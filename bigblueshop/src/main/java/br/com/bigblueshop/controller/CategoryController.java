package br.com.bigblueshop.controller;

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

import br.com.bigblueshop.dto.CategoryDto;
import br.com.bigblueshop.service.CategoryService;
import br.com.bigblueshop.service.form.CategoryForm;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public Page<CategoryDto> listCategories(
			@PageableDefault(sort = "id", direction = Direction.DESC, page = 0, size = 10) Pageable pagination) {
		return categoryService.listCategories(pagination);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoryDto> viewCategory(@PathVariable("id") Long id) {
		return categoryService.viewCategory(id);
	}

	@PostMapping
	@Transactional
	public ResponseEntity<CategoryDto> create(@RequestBody @Valid CategoryForm form, UriComponentsBuilder uriBuilder) {
		return categoryService.create(form, uriBuilder);
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<CategoryDto> update(@PathVariable("id") Long id, @RequestBody @Valid CategoryForm form) {
		return categoryService.update(id, form);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		return categoryService.delete(id);
	}
}
