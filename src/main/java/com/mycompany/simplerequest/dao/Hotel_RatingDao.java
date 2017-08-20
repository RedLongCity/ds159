package com.mycompany.simplerequest.dao;

import com.mycompany.simplerequest.models.Hotel_Rating;
import java.util.List;
/**
 *
 * @author redlongcity
 */

public interface Hotel_RatingDao {
   
    List<Hotel_Rating> findAll();
    
    Hotel_Rating findById(String id);
    
    void save(Hotel_Rating hotel_Rating);
    
    void deleteById(String id);
}
