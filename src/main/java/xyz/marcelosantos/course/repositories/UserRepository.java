package xyz.marcelosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.marcelosantos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
