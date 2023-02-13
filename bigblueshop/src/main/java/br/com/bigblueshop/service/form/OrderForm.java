package br.com.bigblueshop.service.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.bigblueshop.model.Order;
import br.com.bigblueshop.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class OrderForm {
	
	@NotNull
	@NotEmpty
	private String number;
	
	@NotNull
	@NotEmpty
	private String client;

	@NotNull
	private Long amount;
	
	public Order update(Long id, OrderRepository orderRepository) {
		Order order = orderRepository.getOne(id);
		
		order.setNumber(this.number);
		order.setClient(this.client);
		order.setDate(new Date());
		order.setAmount(this.amount);
		
		return order;
	}
	
}
