package xyz.marcelosantos.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.marcelosantos.course.entities.Category;
import xyz.marcelosantos.course.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
