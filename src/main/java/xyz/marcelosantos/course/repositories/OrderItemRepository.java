package xyz.marcelosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.marcelosantos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
