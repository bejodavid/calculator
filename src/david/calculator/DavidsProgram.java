package david.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DavidsProgram{
	
	public static void main(String[] args) throws IOException {
	
System.out.println("Hello welcome to Davids calculator.We dont have alott yet because  this is the beta 0.0.0.0.4. and sorry for gliches this program is being made by a 9 year old. ");
System.out.print("press 1 to go to the calculator press 2 to see the realise scedule");
int A = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());;
if(A==2) {System.out.println("Welcome to the release scedule.  ");
System.out.println("0.0.0.0.1, 2019.july.26");
System.out.println("0.0.0.0.2, 2019.july.29");
System.out.println("0.0.0.0.3, 2019.july.31");
System.out.println("0.0.0.0.4, 2019.july.31");};
if(A==1){System.out.println("Welcome to the calculator. For now you can only +,-,/ and * but if you want to know when you can calculate more complex eqasions chek the realise schedule");
  System.out.println("Press 2 for +,-,* or /");
  System.out.println("New: you can press 1 for advanced calculator options.");
  
  int N = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
  if(N==2) {
 String B = new BufferedReader(new InputStreamReader(System.in)).readLine();
   if(B.equals("-")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   int E = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   int F = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   System.out.println(E-F);
   };
   if(B.equals("+")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   int J = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   int G = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   System.out.println(J+G);};
   
   if(B.equals("*")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   int H = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   int I = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   System.out.println(I*H);
   };
   if(B.equals("/")) {System.out.println("Now pick two numbers and then the computer will do the rest. ");
   int L = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   int M = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
   System.out.println(L/M);
   };
  }
  if(N==1) {System.out.println("Welcome to the advanced calculator for now you can only get:Speed,distance and time");
  System.out.println("Now press: 1 for speed, 2 for distance, 3 for time");
  int K = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
  if(K==1) {System.out.println("Ok now give me the distance via Km and time via h and I will right the speed via Km/h");
  int P = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
  int Q = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
  if(Q<60) {System.out.println("Sorry this feature is coming in 0.0.0.5");}
  else{int S;
  S=Q/60;
  int T;
  T=P/S;
  System.out.println(T+"Km/h");
  }
  
 //Sorry i just rhit the up my stuff  UVXYZ
  };
  }; 
   
  }
}
}

	