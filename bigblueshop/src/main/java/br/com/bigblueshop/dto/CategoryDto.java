package br.com.bigblueshop.dto;

import java.util.List;

import org.springframework.data.domain.Page;

import br.com.bigblueshop.model.Category;
import br.com.bigblueshop.model.Product;
import lombok.Getter;

@Getter
public class CategoryDto {

	private Long id;
	private String name;
	private String code;
	private String description;
	private int productsCount;

	public CategoryDto(Category category) {
		super();
		this.id = category.getId();
		this.name = category.getName();
		this.code = category.getCode();
		this.description = category.getDescription();
		if (category.getProducts() == null) {
			this.productsCount = 0;
		} else {
			this.productsCount = category.getProducts().size();
		}
	}

	public CategoryDto(Category category, List<Product> products) {
		this.id = category.getId();
		this.name = category.getName();
		this.code = category.getCode();
		this.description = category.getDescription();
		this.productsCount = category.getProducts().size();
	}

	public static Page<CategoryDto> convert(Page<Category> categories) {
		return categories.map(CategoryDto::new);
	}
}
