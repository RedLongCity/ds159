package com.mycompany.simplerequest.dao;

import com.mycompany.simplerequest.models.Currency;
import java.util.List;
/**
 *
 * @author redlongcity
 */

public interface CurrencyDao {
    
    List<Currency> findAll();
    
    Currency findById(String id);
    
    void save(Currency currency);
    
    void deleteById(String id);
    
}
