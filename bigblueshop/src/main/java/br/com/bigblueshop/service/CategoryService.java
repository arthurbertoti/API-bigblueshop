package br.com.bigblueshop.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bigblueshop.dto.CategoryDto;
import br.com.bigblueshop.dto.ProductDto;
import br.com.bigblueshop.model.Category;
import br.com.bigblueshop.model.Product;
import br.com.bigblueshop.repository.CategoryRepository;
import br.com.bigblueshop.service.form.CategoryForm;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Page<CategoryDto> objectCategoriesList(Pageable pagination) {
		Page<Category> categories = categoryRepository.findAll(pagination);
		return CategoryDto.convert(categories);
	}
	
	public List<CategoryDto> listCategories() {
		return categoryRepository.findAll().stream().map(CategoryDto::new).collect(Collectors.toList());
	}
	
	public ResponseEntity<CategoryDto> viewCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if (optionalCategory.isPresent()) {
			Category category = optionalCategory.get();
			return ResponseEntity.ok(new CategoryDto(category, category.getProducts()));
		}
		return ResponseEntity.notFound().build();
	}
	
	public ResponseEntity<CategoryDto> create(CategoryForm form, UriComponentsBuilder uriBuilder) {
		Category category = new Category(form);
		categoryRepository.save(category);
		URI uri = uriBuilder.path("/categories/{id}").buildAndExpand(category.getId()).toUri();
		return ResponseEntity.created(uri).body(new CategoryDto(category));
	}
	
	public ResponseEntity<CategoryDto> update(Long id, CategoryForm form) {

		Optional<Category> optional = categoryRepository.findById(id);
		if (optional.isPresent()) {
			Category category = form.update(id, categoryRepository);
			return ResponseEntity.ok(new CategoryDto(category));
		}
		return ResponseEntity.notFound().build();
	}
	
	public ResponseEntity<?> delete(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		if (category.isPresent()) {
			if (category.get().getProducts().size() > 0) {
				throw new ServiceException("Existe ao menos um produto cadastrado com esta categoria. Impossível excluir!");/*
				return ResponseEntity.badRequest().build();*/
			}
			categoryRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
}