package br.com.bigblueshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.bigblueshop.service.form.ProductForm;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String imageUrl;
	private Float price;
	private Long storage;
	private String description;
	private String barcode;
	@ManyToOne
	private Category category;
	
	
	public Product(String name, String imageUrl, Float price, Long storage, String description, String barcode,
			Category category) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.storage = storage;
		this.description = description;
		this.barcode = barcode;
		this.category = category;
	}
	
	public Product(ProductForm form, Category category) {
		this.name = form.getName();
		this.imageUrl = form.getImageUrl();
		this.price = form.getPrice();
		this.storage = form.getStorage();
		this.description = form.getDescription();
		this.barcode = form.getBarcode();
		this.category = category;
	}




	
}
