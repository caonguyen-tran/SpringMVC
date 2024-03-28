package com.tcn.services;

import com.tcn.pojo.Category;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CategoryService {
    List<Category> getCates();
}
