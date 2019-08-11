/**
 *
 * @author Derek Leblanc
 * @date August 11 / 2019
 * @description Test cases for Robbers Problem
 */

import java.util.Arrays;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RobbersProblemTest {
    
    public RobbersProblemTest() {
    }

    /**
     * Test of maximizeThievery method, of class RobbersProblem.
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
     * Test of maximizeThievery method, of class RobbersProblem.
     */
    @Test
    public void testMaximizeTheftEfficient1() {
        RobbersProblemLinear robbersProblem = new RobbersProblemLinear();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,1));
        assertEquals(4, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftEfficient2() {
        RobbersProblemLinear robbersProblem = new RobbersProblemLinear();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,10));
        assertEquals(12, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftEfficient3() {
        RobbersProblemLinear robbersProblem = new RobbersProblemLinear();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,9,12));
        assertEquals(33, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    @Test
    public void testMaximizeTheftEfficient4() {
        RobbersProblemLinear robbersProblem = new RobbersProblemLinear();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,9,12,1,2,3,12,3,12,32,1,102,1000,2,2,1,2,101,1000,100));
        assertEquals(2083, robbersProblem.maximizeThievery(housesAndValues));
    }
    
    /**
     * Test for negative input on linear time solution
     */
    @Test
    public void testNegativeInputLinearTime() {
        RobbersProblemLinear robbersProblem = new RobbersProblemLinear();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,-9,12,1,2,3,12,3,12,32,1,102,1000,2,2,1,2,101,1000,100));
        
        assertThrows(IllegalArgumentException.class, () -> {
            robbersProblem.maximizeThievery(housesAndValues);
        });
    }
    
    
    /**
     * Test for negative input on exponential time solution
     */
    @Test
    public void testNegativeInputExponentialTime() {
        RobbersProblemExponential robbersProblem = new RobbersProblemExponential();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,-8,9,12,1,2,3,12,3,12,32,1,102,1000,2,2,1,2,101,1000,100));
        
        assertThrows(IllegalArgumentException.class, () -> {
            robbersProblem.maximizeThievery(housesAndValues);
        });
    }
    
}
