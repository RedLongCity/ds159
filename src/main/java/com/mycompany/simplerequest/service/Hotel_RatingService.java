package com.mycompany.simplerequest.service;

import com.mycompany.simplerequest.models.Hotel_Rating;
import java.util.List;
/**
 *
 * @author redlongcity
 */
public interface Hotel_RatingService {
    
   Hotel_Rating findById(String id);
   
   void saveHotel_Rating(Hotel_Rating hotel_Rating);
   
   void updateHotel_Rating(Hotel_Rating hotel_Rating);
   
   void deleteHotel_RatingById(String id);
   
   List<Hotel_Rating> findAll();
   
   void deleteAllHotel_Rating();
    
}
