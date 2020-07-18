package MavenSample.CalculatorNormal;

import java.util.Scanner;

public class SOLIDCalci extends Operations{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations o = new SOLIDCalci() ;
		Scanner sc = new Scanner(System.in) ;
        double a[] = new double[2] ;
        for(int i = 0 ; i < 2 ; i++) {
        	a[i] = sc.nextDouble() ;
        }
        char op = sc.next().charAt(0);
        switch(op) {
        case '+' : o.add(a[0],a[1]) ;
        			break ;
        case '-' : o.subtract(a[0],a[1]) ;
        			break ;
        case '*' : o.multiply(a[0],a[1]) ;
        			break ;
        case '/' : if(a[1]!=0) {o.divide(a[0],a[1]) ;}else {System.out.println("Divide by zero error will occur!");}
        			break ;
        default : System.out.println("Invalid operation") ;
        }
	}

	@Override
	public void add(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a+b) ;
	}

	@Override
	public void subtract(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a-b) ;
	}

	@Override
	public void multiply(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a*b) ;
	}

	@Override
	public void divide(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a/b) ;
	}

}