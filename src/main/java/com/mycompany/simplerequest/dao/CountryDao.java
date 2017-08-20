package com.mycompany.simplerequest.dao;

import java.util.List;
import com.mycompany.simplerequest.models.Country;

/**
 *
 * @author redlongcity
 */

public interface CountryDao {
    
    List<Country> findAll();
    
    Country findById(String id);
    
    void save(Country country);
    
    void deleteById(String id);
}
