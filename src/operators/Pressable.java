package operators;

import expression.Expression;

/*The Pressable interface is implemeted by the ActionHandlers of the buttons.
 * There are 3 classes that implement the Pressable interface
 * 1. The Dot class handles the action of pressing the '.' button 
 * 2. The Digit class handles the action of pressing the digits button
 * 3. The BinaryOperator class handles the action of pressing the operators*/

public interface Pressable {

	public void OnPress(Expression expr, char c,boolean lastPressedEnter);
	
}
