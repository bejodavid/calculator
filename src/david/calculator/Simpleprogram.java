package david.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Simpleprogram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
 System.out.println("Welcome to Tester! 0.0.1 alpha");
 System.out.println("Type one of the numbers from below to get to the a test, or type 0 to see update schedule");
 System.out.println("1 for trait test");
 int testNumberOrUS = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
 if( testNumberOrUS == 0) {
	 System.out.println("2020.03.30: 0.0.2");
 }
    if(testNumberOrUS == 1) {
    System.out.println("Error, error mask 1x1:unfinished code ");//add test
    }
	}

}
