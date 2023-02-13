package br.com.bigblueshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.bigblueshop.service.form.OrderForm;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="ORDERS")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String client;
	private Date date;
	private Long amount;
	
	public Order(OrderForm form) {
		this.number = form.getNumber();
		this.client = form.getClient();
		this.date = new Date();
		this.amount = form.getAmount();
	}
		
}
