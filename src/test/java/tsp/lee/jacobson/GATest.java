package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GATest {

	/**
     * Test evolvePopulation
     * WHEN un tour, forcement le meilleur
     * THEN même tour dans le même ordre
     */
    @Test
    public void testEvolvePopulation_1_Tour_MemeTour() {

        ArrayList<City> listeVilles = new ArrayList();
        
        listeVilles.add(new City(2, 3));
        listeVilles.add(new City(4, 5));
        Tour tour = new Tour(listeVilles);

        Population population = new Population(1, false);
        population.saveTour(0, tour);
        Population result = GA.evolvePopulation(population);

        assertEquals(result.getTour(0).getCity(0), listeVilles.get(0));
        assertEquals(result.getTour(0).getCity(1), listeVilles.get(1));
    }
    
    
    
    
    
    
    /**
     * Test evolvePopulation
     * WHEN 2 tour
     * THEN meilleur tour en premier.
     */
    @Test
    public void evolvePopulation_2_Tour_MeilleurEnPremier() {
    	
    
        ArrayList<City> listeVilles1 = new ArrayList();
        listeVilles1.add(new City(2, 3));
        listeVilles1.add(new City(3, 4));
        Tour tour1 = new Tour(listeVilles1);
        
        ArrayList<City> listeVilles2 = new ArrayList<>(listeVilles1);
        listeVilles2.add(new City(2, 3));
        listeVilles2.add(new City(3, 4));
        listeVilles2.add(new City(5, 6));
        Tour tour2 = new Tour(listeVilles2);

        Population population = new Population(2, false);
        population.saveTour(0, tour1);
        population.saveTour(1, tour2);
        Population result = GA.evolvePopulation(population);
        assertEquals(result.getTour(0), tour1);
    }
    
    
    
    
    
    /**
     * Test evolvePopulation
     * WHEN 0 tour
     * THEN ArrayIndexOutOfBoundsException
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testEvolvePopulation_0TourneeException() {
    	
        Population population = new Population(0, false);
        Population result = GA.evolvePopulation(population);
    }
    
    
    
    
    
    
}




