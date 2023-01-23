package br.com.bigblueshop.config.validation;

import lombok.Getter;

public class FormErrorDto {

	@Getter
	private String field;
	@Getter
	private String error;

	public FormErrorDto(String field, String error) {
		this.field = field;
		this.error = error;
	}
}
