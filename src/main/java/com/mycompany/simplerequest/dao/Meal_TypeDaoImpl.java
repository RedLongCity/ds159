package com.mycompany.simplerequest.dao;

import com.mycompany.simplerequest.models.Meal_Type;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
/**
 *
 * @author redlongcity
 */

public class Meal_TypeDaoImpl extends AbstractDao<String,Meal_Type> implements Meal_TypeDao {

    @Override
    public List<Meal_Type> findAll() {
        Criteria crit = createCriteria();
        crit.addOrder(Order.asc("name"));
        List<Meal_Type> meal_TypeList = (List<Meal_Type>) crit.list();
        return meal_TypeList;
    }

    @Override
    public Meal_Type findById(String id) {
        Meal_Type meal_Type = getByKey(id);
        return meal_Type;
    }

    @Override
    public void save(Meal_Type meal_Type) {
        persist(meal_Type);
    }

    @Override
    public void deleteById(String id) {
        Meal_Type meal_Type = getByKey(id);
        delete(meal_Type);
    }
    
}
