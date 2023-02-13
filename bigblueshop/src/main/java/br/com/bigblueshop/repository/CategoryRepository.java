package br.com.bigblueshop.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bigblueshop.model.Category;
import br.com.bigblueshop.model.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	Optional<Category> findByName(String categoryName);
	/*
	Page<Product> findProductsById(Pageable pagination, Long id);
*/
}
