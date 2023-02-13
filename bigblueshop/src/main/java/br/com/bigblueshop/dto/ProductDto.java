package br.com.bigblueshop.dto;

import org.springframework.data.domain.Page;

import br.com.bigblueshop.model.Product;
import lombok.Getter;

public class ProductDto {

	@Getter	private Long id;
	@Getter	private String name;
	@Getter	private String imageUrl;
	@Getter	private Float price;
	@Getter	private Long storage;
	@Getter	private String description;
	@Getter	private String barcode;
	@Getter	private String categoryName;
	
	public ProductDto(String name, String imageUrl, Float price, Long storage, String description, String barcode,
			String categoryName) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.storage = storage;
		this.description = description;
		this.barcode = barcode;
		this.categoryName = categoryName;
	}

	public ProductDto(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.imageUrl = product.getImageUrl();
		this.price = product.getPrice();
		this.storage = product.getStorage();
		this.description = product.getDescription();
		this.barcode = product.getBarcode();
		this.categoryName = product.getCategory().getName();
	}

	public static Page<ProductDto> convert(Page<Product> products){
		return products.map(ProductDto::new);
	}

}
