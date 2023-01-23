package br.com.bigblueshop.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.bigblueshop.repository.ProfileRepository;
import br.com.bigblueshop.service.form.UserForm;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
	@Getter @Setter private String email;
	@Getter @Setter private String phone;
	@Getter @Setter private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@Getter private List<Profile> profiles = new ArrayList<>();

	public User() {
		super();
	}

	public User(UserForm form, ProfileRepository profileRepository) {
		this.name = form.getName();
		this.email = form.getEmail();
		this.phone= form.getPhone();
		this.password = new BCryptPasswordEncoder().encode(form.getPassword());
		this.profiles.add(profileRepository.findById(form.getProfileId()).get());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public void setProfiles(Profile profile) {
		this.profiles.clear();
		this.profiles.add(profile);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.profiles;
	}

	@Override
	public String getUsername() {
		return this.name;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}


}
