package br.com.bigblueshop.service.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.bigblueshop.model.User;
import br.com.bigblueshop.repository.ProfileRepository;
import br.com.bigblueshop.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class UserForm {
	@NotNull
	@NotEmpty
	private String name;
	@NotNull
	@NotEmpty
	private String email;
	@NotNull
	@NotEmpty
	private String function;
	@NotNull
	@NotEmpty
	private String phone;
	@NotNull
	@NotEmpty
	private String password;
	@NotNull
	private Long profileId;

	public User update(Long id, UserRepository userRepository, ProfileRepository profileRepository) {
		User user = userRepository.getOne(id);
		
		user.setName(this.name);
		user.setEmail(this.email);
		user.setFunction(this.function);
		user.setPhone(this.phone);
		user.setPassword(new BCryptPasswordEncoder().encode(this.password));
		user.setProfiles(profileRepository.findById(this.profileId).get());
		
		return user;
	}
}
