package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    Button boutonQuitter;


    public void quitter(){
        Main.stage.close();
    }

    public void hoverQuitter(){
        boutonQuitter.hoverProperty().addListener(l->{
        System.out.println("Test");
        });
    }

}
