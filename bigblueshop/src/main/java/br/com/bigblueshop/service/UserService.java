package br.com.bigblueshop.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bigblueshop.dto.UserDto;
import br.com.bigblueshop.model.Profile;
import br.com.bigblueshop.model.User;
import br.com.bigblueshop.repository.ProfileRepository;
import br.com.bigblueshop.repository.UserRepository;
import br.com.bigblueshop.service.form.UserForm;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProfileRepository profileRepository;

	public Page<UserDto> listUsers(Pageable pagination) {
		Page<User> users = userRepository.findAll(pagination);
		return UserDto.convert(users);
	}

	public ResponseEntity<UserDto> viewUser(Long id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			return ResponseEntity.ok(new UserDto(user.get()));
		}
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<UserDto> create(UserForm form, UriComponentsBuilder uriBuilder) {
		Long profileId = form.getProfileId();
		Optional<Profile> profile = profileRepository.findById(profileId);
		if (profile.isEmpty()) {
			return ResponseEntity.badRequest().build();
		} 
		User user = new User(form, profileRepository);
		userRepository.save(user);
		URI uri = uriBuilder.path("/users/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(new UserDto(user));
		
	}
	public ResponseEntity<UserDto> update(Long id, UserForm form) {
		Optional<User> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			Optional<Profile> profile = profileRepository.findById(form.getProfileId());
			if(profile.isEmpty()) {
				return ResponseEntity.badRequest().build();
			}
			User user = form.update(id, userRepository, profileRepository);
			return ResponseEntity.ok(new UserDto(user));
		}
		return ResponseEntity.notFound().build();	
	}
	public ResponseEntity<?> delete(Long id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			userRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

}
