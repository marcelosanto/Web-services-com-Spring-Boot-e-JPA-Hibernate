package xyz.marcelosantos.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.marcelosantos.course.entities.Product;
import xyz.marcelosantos.course.entities.User;
import xyz.marcelosantos.course.repositories.ProductRepository;
import xyz.marcelosantos.course.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }

}
