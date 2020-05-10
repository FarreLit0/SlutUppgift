package Quiz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		primaryStage.setTitle("Farhad's Quiz");
		
		Button button;
		button = new Button();
		button.setText("A");
		button.setPrefSize(500, 100);
		button.setTextAlignment(TextAlignment.LEFT);
		button.setLayoutX(100);
		button.setLayoutY(400);
		
		Pane layout = new Pane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 1440,720);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
	}

	/*@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	} */

}
