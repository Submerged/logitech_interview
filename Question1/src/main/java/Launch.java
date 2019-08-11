
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
        RobbersProblemLinear robbersProblem = new RobbersProblemLinear();
        
        Vector<Integer> housesAndValuesSimple = new Vector<>(Arrays.asList(1,2,3,1));
        System.out.println(String.format("Maximum we can steal from %s is %d", housesAndValuesSimple, robbersProblem.maximizeThievery(housesAndValuesSimple)));
        
        Vector<Integer> housesAndValuesComplex = new Vector<>(Arrays.asList(3,2,3,4,4,6,7,8,9,12,1,2,3,12,3,12,32,1,102,1000,2,2,1,2,101,1000,100));
        System.out.println(String.format("Maximum we can steal from %s is %d", housesAndValuesComplex, robbersProblem.maximizeThievery(housesAndValuesComplex)));
    }
}
