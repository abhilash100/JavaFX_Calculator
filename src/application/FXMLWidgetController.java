package application;

import expression.BinaryOperator;
import expression.EvaluateExpression;
import expression.Expression;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import operators.BinaryOperation;
import operators.Digit;
import operators.Dot;

/*Implements the action handlers of the buttions in the FXML file */

public class FXMLWidgetController {

	@FXML Button button_0;
	@FXML Button button_1;
	@FXML Button button_2;
	@FXML Button button_3;
	@FXML Button button_4;
	@FXML Button button_5;
	@FXML Button button_6;
	@FXML Button button_7;
	@FXML Button button_8;
	@FXML Button button_9;
	
	@FXML Button button_dot;
	@FXML Button button_add;
	@FXML Button button_subtract;
	@FXML Button button_multiply;
	@FXML Button button_divide;
	@FXML Button button_modulus;
	@FXML Button button_exponent;
	
	@FXML Button button_clear;
	@FXML Button button_enter;
	@FXML Button button_backspace;
	
	@FXML TextField textbox_main;
	
	Expression expr = new Expression();
	BinaryOperator binary_op = new BinaryOperator();
	EvaluateExpression eval = new EvaluateExpression();
	BinaryOperation binary_operation = new BinaryOperation();
	Digit digit = new Digit();
	Dot dot = new Dot();
	
	boolean lastButoonPressedEnter = false;
	
	public void handleButton0Click(){
		digit.OnPress(expr, '0',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton1Click(){
		digit.OnPress(expr, '1',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}

	public void handleButton2Click(){
		digit.OnPress(expr, '2',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton3Click(){
		digit.OnPress(expr, '3',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton4Click(){
		digit.OnPress(expr, '4',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton5Click(){
		digit.OnPress(expr, '5',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton6Click(){
		digit.OnPress(expr, '6',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton7Click(){
		digit.OnPress(expr, '7',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton8Click(){
		digit.OnPress(expr, '8',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButton9Click(){
		digit.OnPress(expr, '9',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonAddClick(){
		binary_operation.OnPress(expr, '+',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonSubtractClick(){
		binary_operation.OnPress(expr, '-',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonMultiplyClick(){
		binary_operation.OnPress(expr, '*',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonDivideClick(){
		binary_operation.OnPress(expr, '/',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonModulusClick(){
		binary_operation.OnPress(expr, '%',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonExponentClick(){
		binary_operation.OnPress(expr, '^',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}

	public void handleButtonEnterClick(){
		if(!expr.getExpression().isEmpty() && binary_op.isOperator(expr.getLast()))
			expr.removeLast();
			
		textbox_main.setText(Double.toString(eval.evaluate(expr.convertIntoString())));
		expr.setAnswer(eval.evaluate(expr.convertIntoString()));
		expr.getExpression().clear();
		lastButoonPressedEnter = true;
	}
	
	public void handleButtonClearClick(){
		textbox_main.setText("");
		textbox_main.clear();
		expr.getExpression().clear();
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonBackspaceClick(){
		if(!expr.getExpression().isEmpty()){
			expr.removeLast();
			textbox_main.setText(expr.convertIntoString());
		}
		lastButoonPressedEnter = false;
	}
	
	public void handleButtonDotClick(){
		dot.OnPress(expr, '.',lastButoonPressedEnter);
		textbox_main.setText(expr.convertIntoString());
		lastButoonPressedEnter = false;
	}
}
