package david.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DavidsProgram{
	
	public static void main(String[] args) throws IOException {
	
System.out.println("Hello welcome to Davids calculator.We dont have alott yet because  this is the beta 0.0.0.0.1. and sorry for gliches this program is being made by a 9 year old. ");
System.out.print("press 1 to go to the calculator press 2 to see the realise scedule");
int A;
if(A==2) {System.out.println("Welcome to the release scedule.  ");
System.out.println("0.0.0.0.1, 2019.july.26");
System.out.println("0.0.0.0.2, 2019.july.28");
System.out.println("0.0.0.0.3, 2019.july.31");};
if(A==1){System.out.println("Welcome to the calculator. For now you can only +,-,/ and * but if you want to know when you can calculate more complex eqasions chek the realise schedule");
  System.out.println("Press +,-,*,/ depending on wich eqaison you want to do");
 String B = new BufferedReader(new InputStreamReader(System.in)).readLine();
   if(B.equals("-")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   int E;
   int F;
   System.out.println(E-F);
   };
   if(B.equals("+")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   int I;
   int G;
   System.out.println(I+G);};
   
   if(B.equals("*")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   int G;
   int H;
   System.out.println(G*H);
   };
   if(B.equals("/")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   };
  }
}
}

	