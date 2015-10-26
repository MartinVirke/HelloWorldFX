package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		FlowPane root = new FlowPane(20, 20);
		Scene scene = new Scene(root, 800, 600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("HELLO FX");

		Label label = new Label("Testing FX");
		root.getChildren().add(label);

		Button b1 = new Button("first");
		Button b2 = new Button("second");
		root.getChildren().add(b1);
		root.getChildren().add(b2);

		root.setAlignment(Pos.CENTER);

		// Eventhandler blir lyssnarobjekt, anonym klass (inget namn) som tar
		// hand om actioneventet (knappen trycks) i metoden "handle".
		b1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				label.setText(b1.getText());
			}
		});
		b2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				label.setText(b2.getText());
			}
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
