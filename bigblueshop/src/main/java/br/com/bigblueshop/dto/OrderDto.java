package br.com.bigblueshop.dto;

import java.util.Date;

import org.springframework.data.domain.Page;

import br.com.bigblueshop.model.Order;
import lombok.Getter;

@Getter
public class OrderDto {

	private Long id;
	private String number;
	private String client;
	private Date date;
	private Long amount;

	public OrderDto(Order request) {
		super();
		this.id = request.getId();
		this.number = request.getNumber();
		this.client = request.getClient();
		this.date = request.getDate();
		this.amount = request.getAmount();
	}
	
	public static Page<OrderDto> convert(Page<Order> orders) {
		return orders.map(OrderDto::new);
	}
	
}
