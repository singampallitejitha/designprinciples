package MavenSample.CalculatorNormal;

import java.util.Scanner;

public class KISSCalci {
	public static double operation(double a , int c , double b) {
		double n[] = {a+b,a-b,a*b,a/b} ;
		return n[c-1] ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
        double a = sc.nextDouble() ;
        //char op = sc.next().charAt(0);
        int op = sc.nextInt();
        double b = sc.nextDouble();
        System.out.println(operation(a,op,b)) ;
	}

}