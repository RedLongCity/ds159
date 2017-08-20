package com.mycompany.simplerequest.service;

import com.mycompany.simplerequest.models.Currency;
import java.util.List;
/**
 *
 * @author redlongcity
 */

public interface CurrencyService {
    
    Currency findById(String id);
    
    void saveCurrency(Currency currency);
    
    void updateCurrency(Currency currency);
    
    void deleteCurrencyById(String id);
    
    List<Currency> findAll();
    
    void deleteAllCurrency();
    
}
