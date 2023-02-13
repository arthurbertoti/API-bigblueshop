package br.com.bigblueshop.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bigblueshop.dto.OrderDto;
import br.com.bigblueshop.model.Order;
import br.com.bigblueshop.repository.OrderRepository;
import br.com.bigblueshop.service.form.OrderForm;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public Page<OrderDto> ObjectOrdersList(Pageable pagination) {
		Page<Order> orders = orderRepository.findAll(pagination);
		
		return OrderDto.convert(orders);
	}

	public List<OrderDto> listOrders() {
		return orderRepository.findAll().stream().map(OrderDto::new).collect(Collectors.toList());
	}

	public ResponseEntity<OrderDto> viewOrder(Long id) {
		Optional<Order> optionalOrder = orderRepository.findById(id);
		if (optionalOrder.isPresent()) {
			Order order = optionalOrder.get();
			return ResponseEntity.ok(new OrderDto(order));
		}
		return ResponseEntity.notFound().build();
	}
	
	public ResponseEntity<OrderDto> create(OrderForm form, UriComponentsBuilder uriBuilder){
		Order order= new Order(form);
		orderRepository.save(order);
		URI uri = uriBuilder.path("/order/{id}").buildAndExpand(order.getId()).toUri();
		return ResponseEntity.created(uri).body(new OrderDto(order));
	}
	
	public ResponseEntity<OrderDto> update(Long id, OrderForm form) {

		Optional<Order> optional = orderRepository.findById(id);
		if (optional.isPresent()) {
			Order order = form.update(id, orderRepository);
			return ResponseEntity.ok(new OrderDto(order));
		}
		return ResponseEntity.notFound().build();
	}
	
	public ResponseEntity<?> delete(Long id) {
		Optional<Order> order = orderRepository.findById(id);
		if (order.isPresent()) {
			orderRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
}



















