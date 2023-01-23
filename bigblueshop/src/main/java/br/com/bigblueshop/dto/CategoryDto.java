package br.com.bigblueshop.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

import br.com.bigblueshop.model.Category;
import br.com.bigblueshop.model.Product;
import lombok.Getter;

public class CategoryDto {

	@Getter	private Long id;
	@Getter	private String name;
	@Getter	private String description;
	@Getter	private int productsCount;
	@Getter	private List<String> productsName = new ArrayList<String>();

	public CategoryDto(Category category) {
		super();
		this.id = category.getId();
		this.name = category.getName();
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
		this.description = category.getDescription();
		this.productsCount = category.getProducts().size();
		this.productsName = CategoryDto.productsNameList(products);
	}

	private static List<String> productsNameList(List<Product> products) {
		List<String> AllProductsName = new ArrayList<String>();
		for (int i = 0; i < products.size(); i++) {
			AllProductsName.add(products.get(i).getName());
		}
		return AllProductsName;
	}

	public static Page<CategoryDto> convert(Page<Category> categories) {
		return categories.map(CategoryDto::new);
	}
}
