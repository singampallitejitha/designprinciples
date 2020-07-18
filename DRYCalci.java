package MavenSample.CalculatorNormal;

import java.util.Scanner;

public class DRYCalci {
	public static double add(double a , double b) {
		return a + b ;
	}
	public static double subtract(double a, double b) {
		return add(a, -b) ;
	}
	public static double multiply(double a , double b) {
		double result = 0 ;
		for(int i = 1; i <= b ; i++) {
			result = add(result,a) ;
		}
		return result ;
	}
	public static double divide(double a , double b) {
		int res = 0 ;
		while(a>=b) {
			a = add(a,-b) ;
			res++;
		}
		return res ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
        double a = sc.nextDouble() ;
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch(op) {
        case '+' : System.out.println(add(a,b)) ;
        			break ;
        case '-' : System.out.println(subtract(a,b)) ;
        			break ;
        case '*' : System.out.println(multiply(a,b)) ;
        			break ;
        case '/' : if(b!=0) {System.out.println(divide(a,b)) ;}else {System.out.println("Divide by zero error will occur!");}
        			break ;
        default : System.out.println("Invalid operation") ;
        }
	}

}
