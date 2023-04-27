import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator_Exercise extends Application {
  @Override
  // Override the start method in the Application class
  public void start(Stage primaryStage) {
    FlowPane pane = new FlowPane();
    pane.setHgap(2);
    pane.setAlignment(Pos.CENTER);
    TextField tfNumber1 = new TextField();
    TextField tfNumber2 = new TextField();
    TextField tfResult = new TextField();
    tfResult.setEditable(false);
    tfNumber1.setPrefColumnCount(3);
    tfNumber2.setPrefColumnCount(3);
    tfResult.setPrefColumnCount(3);
    
    pane.getChildren().addAll(new Label("Number 1: "), tfNumber1,
      new Label("Number 2: "), tfNumber2, new Label("Result: "), tfResult);
    
    // Create four buttons
    HBox hBox = new HBox(5);
    Button btAdd = new Button("Add");
    Button btSubtract = new Button("Subtract");
    Button btMultiply = new Button("Multiply");
    Button btDivide = new Button("Divide");
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(pane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.TOP_CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 250, 150);
    primaryStage.setTitle("Calculator Exercise"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    


// TO DO: Create the four button event handlers



  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 
