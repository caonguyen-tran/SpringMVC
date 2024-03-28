package com.tcn.services.impl;

import com.tcn.pojo.Category;
import com.tcn.repositories.CategoryRepository;
import com.tcn.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getCates() {
        return this.categoryRepository.getCategories();
    }
}
