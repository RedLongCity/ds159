package com.mycompany.simplerequest.dao;

import com.mycompany.simplerequest.models.From_Cities;
import java.util.List;
/**
 *
 * @author redlongcity
 */

public interface From_CitiesDao {
    
    List<From_Cities> findAll();
    
    From_Cities findById(String id);
    
    void save(From_Cities from_Cities);
    
    void deleteById(String id);
    
}
