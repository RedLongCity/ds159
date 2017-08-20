package com.mycompany.simplerequest.service;

import java.util.List;
import com.mycompany.simplerequest.models.Country;

/**
 *
 * @author redlongcity
 */

public interface CountryService {
    
    Country findById(String id);
    
    void saveCountry(Country country);
    
    void updateCountry(Country country);
    
    void deleteCountryById(String id);
    
    List<Country> findAll();
    
    void deleteAllCountries();
    
}
