package xyz.marcelosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.marcelosantos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
