package net.codejava.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import net.codejava.models.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
