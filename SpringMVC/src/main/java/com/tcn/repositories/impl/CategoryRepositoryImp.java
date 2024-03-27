package com.tcn.repositories.impl;

import com.tcn.pojo.Category;
import com.tcn.repositories.CategoryRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryRepositoryImp implements CategoryRepository {


    @Override
    public List<Category> getCategories() {
        return null;
    }
}
