package com.mycompany.simplerequest.service;

import com.mycompany.simplerequest.dao.CountryDao;
import com.mycompany.simplerequest.models.Country;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author redlongcity
 */
@Service("countryService")
@Transactional
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryDao countryDao;
    
    @Override
    public Country findById(String id) {
        return countryDao.findById(id);
    }

    @Override
    public void saveCountry(Country country) {
        countryDao.save(country);
    }

    @Override
    public void updateCountry(Country country) {
        Country entity = countryDao.findById(country.getId());
        if(entity!=null){
            entity.setName(country.getName());
        }
    }

    @Override
    public void deleteCountryById(String id) {
        
    }

    @Override
    public List<Country> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAllCountries() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
