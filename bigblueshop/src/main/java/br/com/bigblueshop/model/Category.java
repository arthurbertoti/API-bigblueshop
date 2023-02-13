package br.com.bigblueshop.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.bigblueshop.service.form.CategoryForm;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String code;
	private String description;
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	
	public Category() {
		super();
	}

	public Category(CategoryForm form) {
		this.name = form.getName();
		this.code = form.getCode();
		this.description = form.getDescription();
	}

}
