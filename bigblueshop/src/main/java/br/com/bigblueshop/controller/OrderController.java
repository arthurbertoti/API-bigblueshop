package br.com.bigblueshop.controller;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.bigblueshop.dto.OrderDto;
import br.com.bigblueshop.service.OrderService;
import br.com.bigblueshop.service.form.OrderForm;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/list")
	public Page<OrderDto> ObjectOrdersList(
			@PageableDefault(sort = "id", direction = Direction.ASC, page = 0, size = 7) Pageable pagination) {
		System.out.println(new Date());
		return orderService.ObjectOrdersList(pagination);
	}
	
	@GetMapping
	public List<OrderDto>listCategories() {
		return orderService.listOrders();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderDto> viewOrder(@PathVariable("id") Long id){
		return orderService.viewOrder(id);
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<OrderDto> create (@RequestBody @Valid OrderForm form, UriComponentsBuilder uriBuilder ){
		return orderService.create(form, uriBuilder);
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<OrderDto> update (@PathVariable("id") Long id, @RequestBody @Valid OrderForm form){
		return orderService.update(id, form);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		return orderService.delete(id);
	}	
}
