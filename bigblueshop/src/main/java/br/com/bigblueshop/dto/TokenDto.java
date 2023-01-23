package br.com.bigblueshop.dto;

import lombok.Getter;

public class TokenDto {

	@Getter
	private String token;
	@Getter
	private String type;

	public TokenDto(String token, String type) {
		this.token = token;
		this.type = type;
	}

}
