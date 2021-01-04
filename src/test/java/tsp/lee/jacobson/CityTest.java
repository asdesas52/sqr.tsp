package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {
	
	
	/**
     * GIVEN distanceTo
     * WHEN distance entre une city de coordonnées (1, 2) et une city de coordonnées (3, 4).
     * THEN sqrt((1-3)^2+(2-4)^2)=2,83 à 0,01 près
     */

	
	
	@Test 
	public void testDistanceTo() {
		
        System.out.println("distanceToOtherCity");

        City city_1 = new City(1, 2);
        City city_2 = new City(3, 4);
        
        double result = city_2.distanceTo(city_1);
        
        double expResult = Math.sqrt((city_1.getX()-city_2.getX())*(city_1.getX()-city_2.getX()) + (city_1.getY()-city_2.getY())*(city_1.getY()-city_2.getY()));
       
        
        assertEquals(expResult, result, 0.01);
    }
	
	
	
	/**
     * GIVEN distanceTo
     * WHEN distance entre une city de coordonnées (1, 2) et une city de coordonnées (2, 2).
     * THEN 0
     */
	
	
	@Test 
	public void testDistanceToSameCity() {
		
        System.out.println("distanceToSameCity");

        City city_1 = new City(1, 2);
        City city_2 = new City(1, 2);
        
        double result = city_2.distanceTo(city_1);
        
        double expResult = Math.sqrt((city_1.getX()-city_2.getX())*(city_1.getX()-city_2.getX()) + (city_1.getY()-city_2.getY())*(city_1.getY()-city_2.getY()));
       
        
        assertEquals(expResult, result, 0.01);
    }

}
