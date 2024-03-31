package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
 import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application {
	 @Override
	    public void start(Stage primaryStage) {
	        Group root = new Group();
	        Scene scene = new Scene(root, 400, 300);
	        primaryStage.setScene(scene);
	        
	     
	        Line ligne = new Line(50, 50, 200, 50);
	        ligne.setStroke(Color.BLUE);
	        
	      
	        Rectangle rectangle = new Rectangle(100, 100, 100, 50);
	        rectangle.setFill(Color.GREEN);
	        
	   
	        Circle cercle = new Circle(300, 200, 30);
	        cercle.setFill(Color.RED);
	        
	        root.getChildren().add(ligne);
	        root.getChildren().add(rectangle);
	        root.getChildren().add(cercle);
	        
	        primaryStage.show();
	    }
	public static void main(String[] args) {
	launch(args);
}
}

