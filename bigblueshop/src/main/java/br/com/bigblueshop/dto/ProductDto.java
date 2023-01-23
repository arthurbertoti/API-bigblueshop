package br.com.bigblueshop.dto;

import org.springframework.data.domain.Page;

import br.com.bigblueshop.model.Product;
import lombok.Getter;

public class ProductDto {

	@Getter	private Long id;
	@Getter	private String name;
	@Getter	private String description;
	@Getter	private String barcode;
	@Getter	private String categoryName;
	
	public ProductDto(Long id, String name, String description, String barcode,
			String categoryName) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.barcode = barcode;
		this.categoryName = categoryName;
	}

	public ProductDto(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.description = product.getDescription();
		this.barcode = product.getBarcode();
		this.categoryName = product.getCategory().getName();
	}

	public static Page<ProductDto> convert(Page<Product> products){
		return products.map(ProductDto::new);
	}
}
