package xyz.marcelosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.marcelosantos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
