package xyz.marcelosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.marcelosantos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
