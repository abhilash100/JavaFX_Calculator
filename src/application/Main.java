package application;
	
import java.net.URL;
import java.nio.file.Paths;

import expression.EvaluateExpression;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

/*
 * Java FX Calculator Project
 * Created by Abhilash Chivukula
 * 
 * Build using Eclipse IDE and ScreenBuilder plugin
 * The main class launches the application. 
 * The application will be available in the form of a runnable jar file*/
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			URL url = Paths.get("C:/Users/ADMIN/workspace1/Calculator/resources/main.fxml").toUri().toURL();
			AnchorPane root = (AnchorPane)FXMLLoader.load(url);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("My Calculator");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
