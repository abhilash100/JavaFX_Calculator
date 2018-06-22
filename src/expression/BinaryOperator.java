package expression;

/*This class is used mainly for 
 * 1. Checking if the character is an operator or not
 * 2.Getting simple binary operations(a+b,a/b,etc)
 * 3. Keeping track of precedence order*/

public class BinaryOperator {
	
	public boolean isOperator(char c){
		switch(c){
		case '+':
			return true;
		case '-':
			return true;
		case '*':
			return true;
		case '/':
			return true;
		case '%':
			return true;
		case '^':
			return true;
		default:
			return false;
		}
	}
	
	public int getPrecedence(char c){
		switch(c){
		case '%':
			return 2;
		case '^':
			return 2;
		case '*':
			return 2;
		case '/':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		default :
			return -1;
		}
	}

	public double evaluateExpr(double a,double b, char operator)throws ArithmeticException{
		
		switch(operator){
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			return a/b;
		case '%':
			return a%b;
		case '^':
			return Math.pow(a, b);
		default:
			return -1;
		}
	}
}
