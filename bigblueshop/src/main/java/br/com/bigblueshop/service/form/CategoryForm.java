package br.com.bigblueshop.service.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.bigblueshop.model.Category;
import br.com.bigblueshop.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class CategoryForm {

	@NotNull
	@NotEmpty
	private String name;
	
	@NotNull
	@NotEmpty
	private String description;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category update(Long id, CategoryRepository categoryRepository) {
		Category category = categoryRepository.getOne(id);
		category.setName(this.name);
		category.setDescription(this.description);
		return category;
	}
	
	
}
