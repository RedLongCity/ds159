package com.mycompany.simplerequest.dao;

import com.mycompany.simplerequest.models.Meal_Type;
import java.util.List;
/**
 *
 * @author redlongcity
 */

public interface Meal_TypeDao {
    
    List<Meal_Type> findAll();
    
    Meal_Type findById(String id);
    
    void save(Meal_Type meal_Type);
    
    void deleteById(String id);
    
}
