package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRespository;

@Service
public class CategoryService {

    private final CategoryRespository categoryRespository;

    CategoryService(CategoryRespository categoryRespository) {
        this.categoryRespository = categoryRespository;
    }
    
    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list =  categoryRespository.findAll();
        return list.stream().map(category -> new CategoryDTO(category)).collect(Collectors.toList());
        

    }

    @Transactional
    public Category createCategory(Category category) {
        return categoryRespository.save(category);
    }
}
