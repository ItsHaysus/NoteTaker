package NoteTakerMVC;

/**
 *
 * @author Jesus
 */
public class Controller {

    private Design design;
    private SaveAs save = new SaveAs();
    private WindowsAssets.PopUps assets = new WindowsAssets.PopUps();

    public Controller(Design design) {
        this.design = design;
        setListener();
        setHandlers();
    }

    private void setListener() {
        design.getEditor().lengthProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.intValue() > oldValue.intValue()) {
                // Check if the new character is greater than LIMIT
                design.getCharactercout().setText(newValue.toString());
            }
        });

    }

    private void setHandlers() {
        design.getClose().setOnAction((event) -> System.exit(0));
        design.getSave().setOnAction((event) -> save.save());
        design.getAbout().setOnAction((event) -> assets.versionWindow());
        design.getDelete().setOnAction((event) -> design.getEditor().setText(""));
    }
}
