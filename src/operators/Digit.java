package operators;

import expression.Expression;

/*Implementation of action handler on pressing the digits buttons*/

public class Digit implements Pressable{

	public void OnPress(Expression expr, char digit,boolean lastPressedEnter) {
		expr.getExpression().add(digit);
	}

}
