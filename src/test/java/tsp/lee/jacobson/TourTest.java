package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	 /**
     * GIVEN getDistance
     * WHEN tour avec deux villes de coordonnées (4, 5) et de coordonnées (2, 3).
     * THEN 4 car distance entre ville 1 et ville 2 et inversement.
     */
    @Test
    public void testGetDistance_2_City() {
    	
        ArrayList<City> listeVilles = new ArrayList();
        
        listeVilles.add(new City(2, 3));
        listeVilles.add(new City(4, 5));
        
        Tour Tour_1 = new Tour(listeVilles);
        int result = Tour_1.getDistance();
        
        int expResult = 4;
        
       
        assertEquals(expResult, result);
    }

    /**
     * GIVEN getDistance
     * WHEN tour avec 1 ville de coordonné (2,3).
     * THEN 0
     */
    @Test
    public void testGetDistance_1_City() {
    	
        ArrayList<City> listeVilles = new ArrayList();
        
        listeVilles.add(new City(2, 3));
        
        Tour Tour_2 = new Tour(listeVilles);
        int result = Tour_2.getDistance();
        

        int expResult = 0;
        
        assertEquals(expResult, result);
    }
    
    

    /**
     * GIVEN getDistance
     * WHEN tour avec 0 ville.
     * THEN 0
     */
    
    @Test
    public void testGetDistance_0_City() {
    	
        ArrayList<City> listeVilles = new ArrayList();
        
        Tour Tour_3 = new Tour(listeVilles);
        int result = Tour_3.getDistance();
        
        int expResult = 0;

        assertEquals(expResult, result);
    }

}
