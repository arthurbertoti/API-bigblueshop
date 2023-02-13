package br.com.bigblueshop.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bigblueshop.dto.UserDto;
import br.com.bigblueshop.service.UserService;
import br.com.bigblueshop.service.form.UserForm;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/list")
	public Page<UserDto> ObjectUsersList(
			@PageableDefault(sort = "id", direction = Direction.ASC, page = 0, size = 7) Pageable pagination) {
		return userService.objectUsersList(pagination);
	}
	
	@GetMapping()
	public List<UserDto> listUsers() {
		return userService.listUsers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> viewUser(@PathVariable("id") Long id){
		return userService.viewUser(id);
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<UserDto> create (@RequestBody @Valid UserForm form, UriComponentsBuilder uriBuilder){
		return userService.create(form,  uriBuilder);
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<UserDto> update (@PathVariable("id") Long id, @RequestBody @Valid UserForm form){
		return userService.update(id, form);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> delete (@PathVariable("id") Long id){
		return userService.delete(id);
	}

}
