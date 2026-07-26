package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRespository;

@Service
public class CategoryService {

    private final CategoryRespository categoryRespository;

    CategoryService(CategoryRespository categoryRespository) {
        this.categoryRespository = categoryRespository;
    }
    
    public List<Category> findAll() {
        return categoryRespository.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRespository.save(category);
    }
}
