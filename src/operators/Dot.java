package operators;

import expression.BinaryOperator;
import expression.Expression;

/*Implementation of action handler on pressing the '.' button*/

public class Dot implements Pressable{
	
	BinaryOperator binary_op = new BinaryOperator();
	
	public void OnPress(Expression expr, char c,boolean lastPressedEnter) {
		if(expr.getLast() == '.'){
			
		}
		else if(expr.getLastDotIndex() > expr.getLastOperatorIndex()){
			
		}
		else if(binary_op.isOperator(expr.getLast())){
			expr.getExpression().add('0');
			expr.getExpression().add('.');
		}
		else{
			expr.getExpression().add('.');
		}
	}

}
