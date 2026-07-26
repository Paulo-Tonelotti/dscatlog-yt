package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscatalog.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long>{
    
}
