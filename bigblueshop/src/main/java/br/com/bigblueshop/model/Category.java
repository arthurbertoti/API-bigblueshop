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
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	private Long id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String description;
	@OneToMany(mappedBy = "category")
	@Getter @Setter
	private List<Product> products;
	
	public Category() {
		super();
	}

	public Category(CategoryForm form) {
		this.name = form.getName();
		this.description = form.getDescription();
	}

}
