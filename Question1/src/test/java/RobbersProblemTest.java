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
    public void testMaximizeTheft() {
        RobbersProblem robbersProblem = new RobbersProblem();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,1));
        assertEquals(4, robbersProblem.maximizeTheft(housesAndValues));
    }
    
}
