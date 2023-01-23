package br.com.bigblueshop.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bigblueshop.dto.ProductDto;
import br.com.bigblueshop.model.Category;
import br.com.bigblueshop.model.Product;
import br.com.bigblueshop.repository.CategoryRepository;
import br.com.bigblueshop.repository.ProductRepository;
import br.com.bigblueshop.service.form.ProductForm;

@Service
public class ProductService {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public Page<ProductDto> listProducts(Pageable pagination) {
		Page<Product> products = productRepository.findAll(pagination);
		return ProductDto.convert(products);
	}
	
	public ResponseEntity<ProductDto> viewProduct(Long id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			return ResponseEntity.ok(new ProductDto(product.get()));
		}
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<ProductDto> create(ProductForm form, UriComponentsBuilder uriBuilder) {
		Optional<Category> category = categoryRepository.findByName(form.getCategoryName());
		if (category.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		Product product = new Product(form, category.get());
		productRepository.save(product);
		URI uri = uriBuilder.path("/products/{id}").buildAndExpand(product.getId()).toUri();
		return ResponseEntity.created(uri).body(new ProductDto(product));
	}

	public ResponseEntity<ProductDto> update(Long id, ProductForm form) {

		Optional<Product> optional = productRepository.findById(id);
		if (optional.isPresent()) {
			Optional<Category> category = categoryRepository.findByName(form.getCategoryName());
			if (category.isEmpty()) {
				return ResponseEntity.badRequest().build();
			}
			Product product = form.update(id, productRepository, categoryRepository);
			return ResponseEntity.ok(new ProductDto(product));
		}
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<?> delete(Long id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			productRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
}
