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
	private String code;
	
	@NotNull
	@NotEmpty
	private String description;

	public Category update(Long id, CategoryRepository categoryRepository) {
		Category category = categoryRepository.getOne(id);
		category.setName(this.name);
		category.setCode(this.code);
		category.setDescription(this.description);
		return category;
	}
	
	
}
