package br.com.bigblueshop.dto;

import org.springframework.data.domain.Page;

import br.com.bigblueshop.model.User;
import br.com.bigblueshop.service.form.UserForm;
import lombok.Getter;

public class UserDto {

	@Getter
	private Long id;
	@Getter
	private String name;
	@Getter
	private String email;
	@Getter
	private String phone;
	@Getter
	private String password;
	@Getter
	private Long profileId;

	public UserDto(UserForm form) {
		this.name = form.getName();
		this.email = form.getEmail();
		this.phone = form.getPhone();
		this.profileId = form.getProfileId();
	}
	
	public UserDto(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.phone = user.getPhone();
		this.profileId = user.getProfiles().get(0).getId();
	}

	public static Page<UserDto> convert(Page<User> users) {
		return users.map(UserDto::new);
	}

}
