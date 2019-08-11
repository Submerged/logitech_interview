
import java.util.Arrays;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derekleblanc
 */
public class Launch {
    public static void main(String args[]) {
        RobbersProblemConstant robbersProblem = new RobbersProblemConstant();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,9,12));
        
        System.out.println(String.format("Maximum we can steal from %s is %d", housesAndValues, robbersProblem.maximizeThievery(housesAndValues)));
    }
}
