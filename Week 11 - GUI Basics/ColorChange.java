import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ColorChange extends Application {


    public void start(Stage primaryStage) {
        primaryStage.setTitle("Color Change!");
        Button btn = new Button();
        btn.setText("Color Change");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                btn.setTextFill(Paint.valueOf("Red"));
                btn.setText("Red");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
 
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 
