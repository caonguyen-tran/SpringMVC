package com.tcn.repositories.impl;

import com.tcn.pojo.Category;
import com.tcn.repositories.CategoryRepository;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryRepositoryImp implements CategoryRepository {
    @Autowired
    private LocalSessionFactoryBean factoryBean;

    @Override
    public List<Category> getCategories() {
        Session s = this.factoryBean.getObject().getCurrentSession();
        Query query = s.createNamedQuery("Category.findAll");
        return query.getResultList();
    }
}
