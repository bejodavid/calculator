package david.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Simpleprogram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
 System.out.println("Welcome to Tester! 0.0.1 alpha \n"
 		+ "Type one of the numbers from below to get to the a test, or type 0 to see update schedule \n"
 		+ "1 for trait test");
 int testNumberOrUS = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
 if( testNumberOrUS == 0) {
	 System.out.println("2020.04.25.: 0.0.2");
 }
    if(testNumberOrUS == 1) {
    System.out.println("Error, error mask 1x1");// 1x1:unfinished code, 1:code error
    System.out.println("It's 8:10, your in school and the teacher has'nt come in \n"
    		+ "yet. What do you do? \n"
    		+ "1)Start talking with your friends. 2)Start talking to your friends.");
    int QA = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
    if(QA==1) {
    	boolean talkitive = true;
    }
    else {
    	boolean talkitive = false;
    }
    if(QA == 2){
    	boolean EagerToLearn = true;
    }
    else {
    	boolean EagerTolearn = false;
    }	
    }
    else{
    	 System.out.println("Error, error mask 2x1");//2x1:invalid integer 2:invalid awnser
    }
    
}
}
