import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.lang.Exception;

public class Main extends Application {

    @Override
    public void start(Stage mainStage) throws Exception {


        //Creating rectangles in according pane
        GridPane pane = new GridPane();
        for (int i = 0; i < 8; i += 2) {
            for (int j = 0; j < 8; j += 2) {
                Rectangle white1 = new Rectangle(60, 60);
                pane.add(white1, i, j);
                white1.setFill(Color.WHITE);
                //System.out.println("White1 Coordinate: " + i + j);
            }
        }
        for (int i = 1; i < 8; i += 2) {
            for (int j = 1; j < 8; j += 2) {
                Rectangle white2 = new Rectangle(60, 60);
                pane.add(white2, i, j);
                white2.setFill(Color.WHITE);
                //System.out.println("White2 Coordinate: " + i + j);
            }
        }

        for (int i = 0; i < 8; i += 2) {
            for (int j = 1; j < 8; j += 2) {
                Rectangle black1 = new Rectangle(60, 60);
                pane.add(black1, i, j);
                black1.setFill(Color.BLACK);
            }
        }

        for (int i = 1; i < 8; i += 2) {
            for (int j = 0; j < 8; j += 2) {
                Rectangle black2 = new Rectangle(60, 60);
                pane.add(black2, i, j);
                black2.setFill(Color.BLACK);
            }
        }

        //Creating scene
        Scene scene = new Scene(pane);

        mainStage.setScene(scene);
        mainStage.setTitle("Checker Board");
        mainStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
