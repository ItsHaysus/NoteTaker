package NoteTakerMVC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SaveAs {

    Design design = new Design();

    public void save() {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("java-buddy.blogspot.com");
        
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        //Show save file dialog
        File file = fileChooser.showSaveDialog(primaryStage);

        if (file != null) {
            try {
                PrintWriter writer = new PrintWriter(file);
                writer.write(design.getEditor().getText().toString());
                writer.close();

            } catch (IOException ex) {
                Logger.getLogger(SaveAs.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
