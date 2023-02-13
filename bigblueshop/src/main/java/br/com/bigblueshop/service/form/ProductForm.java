package br.com.bigblueshop.service.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.bigblueshop.model.Category;
import br.com.bigblueshop.model.Product;
import br.com.bigblueshop.repository.CategoryRepository;
import br.com.bigblueshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ProductForm {
	@NotNull
	@NotEmpty
	private String name;

	@NotNull
	@NotEmpty	
	private String imageUrl;
	
	@NotNull
	private Float price;
	
	@NotNull
	private Long storage;
	
	@NotNull
	@NotEmpty
	private String description;

	@NotNull
	@NotEmpty
	private String barcode;

	@NotNull
	@NotEmpty
	private String categoryName;

	public Product convert(CategoryRepository categoryRepository) {
		Category category = categoryRepository.findByName(categoryName).get();
		
		return new Product(name, imageUrl, price, storage, description, barcode, category);
	}

	public Product update(Long id, ProductRepository productRepository, CategoryRepository categoryRepository) {

		Product product = productRepository.getOne(id);

		product.setName(this.name);
		product.setImageUrl(this.imageUrl);
		product.setPrice(this.price);
		product.setStorage(this.storage);
		product.setDescription(this.description);
		product.setBarcode(this.barcode);
		product.setCategory(categoryRepository.findByName(this.categoryName).get());

		return product;
	}

}
