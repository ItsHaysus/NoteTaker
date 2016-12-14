package NoteTakerMVC;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Jesus
 */
public class Controller {

    Design design;
    SaveAs save = new SaveAs();

    public Controller(Design design) {
        this.design = design;
        setListener();
        setHandlers();
    }

    void setListener() {
        design.getEditor().lengthProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable,
                    Number oldValue, Number newValue) {
                if (newValue.intValue() > oldValue.intValue()) {
                    // Check if the new character is greater than LIMIT
                    design.getCharactercout().setText(newValue.toString());
                }
            }
        });

    }

    void setHandlers() {

        design.getClose().setOnAction((event) -> {
            System.exit(0);
        });
        design.getSave().setOnAction((event) -> {
            save.save();

        });
    }
}
