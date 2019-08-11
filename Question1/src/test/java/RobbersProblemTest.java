/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author derekleblanc
 */
public class RobbersProblemTest {
    
    public RobbersProblemTest() {
    }

    /**
     * Test of maximizeTheft method, of class RobbersProblem.
     */
    @Test
    public void testMaximizeTheftInefficient1() {
        RobbersProblemExponential robbersProblem = new RobbersProblemExponential();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,1));
        assertEquals(4, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftInefficient2() {
        RobbersProblemExponential robbersProblem = new RobbersProblemExponential();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,10));
        assertEquals(12, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftInefficient3() {
        RobbersProblemExponential robbersProblem = new RobbersProblemExponential();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,9,12));
        assertEquals(33, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    
    // Test more efficient implementation
    
    /**
     * Test of maximizeTheft method, of class RobbersProblem.
     */
    @Test
    public void testMaximizeTheftEfficient1() {
        RobbersProblemConstant robbersProblem = new RobbersProblemConstant();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,1));
        assertEquals(4, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftEfficient2() {
        RobbersProblemConstant robbersProblem = new RobbersProblemConstant();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,10));
        assertEquals(12, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftEfficient3() {
        RobbersProblemConstant robbersProblem = new RobbersProblemConstant();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,9,12));
        assertEquals(33, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftEfficient4() {
        RobbersProblemConstant robbersProblem = new RobbersProblemConstant();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,9,12,1,2,3,12,3,12,32,1,102,1000,2,2,1,2,101,1000,100));
        assertEquals(2083, robbersProblem.maximizeThievery(housesAndValues));
    }
    
}
