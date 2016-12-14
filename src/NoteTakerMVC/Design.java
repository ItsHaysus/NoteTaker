/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoteTakerMVC;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 *
 * @author Jesus
 */
public class Design extends BorderPane {

    public MenuBar getToolbar() {
        return toolbar;
    }

    public void setToolbar(MenuBar toolbar) {
        this.toolbar = toolbar;
    }

    public Menu getFile() {
        return file;
    }

    public void setFile(Menu file) {
        this.file = file;
    }

    public Menu getEdit() {
        return edit;
    }

    public void setEdit(Menu edit) {
        this.edit = edit;
    }

    public Menu getHelp() {
        return help;
    }

    public void setHelp(Menu help) {
        this.help = help;
    }

    public MenuItem getSave() {
        return save;
    }

    public void setSave(MenuItem save) {
        this.save = save;
    }

    public MenuItem getClose() {
        return close;
    }

    public void setClose(MenuItem close) {
        this.close = close;
    }

    public MenuItem getDelete() {
        return delete;
    }

    public void setDelete(MenuItem delete) {
        this.delete = delete;
    }

    public MenuItem getAbout() {
        return about;
    }

    public void setAbout(MenuItem about) {
        this.about = about;
    }

    public TextArea getEditor() {
        return editor;
    }

    public void setEditor(TextArea editor) {
        this.editor = editor;
    }
    private MenuBar toolbar = new MenuBar();
    private HBox statusBar = new HBox();
    private Menu file = new Menu("File");
    private Menu edit = new Menu("Edit");
    private Menu help = new Menu("Help");
    private MenuItem save = new MenuItem("Save file");
    private MenuItem close = new MenuItem("Exit");
    private MenuItem delete = new MenuItem("Delte all");
    private MenuItem about = new MenuItem("About");
    private TextArea editor = new TextArea();
    private Text charactercout = new Text();

    public Design() {
        setMenu();

        this.setCenter(editor);
        this.setTop(toolbar);
        this.setBottom(statusBar);

    }

    void setMenu() {
        toolbar.getMenus().addAll(file, edit, help);
        file.getItems().addAll(save, close);
        edit.getItems().addAll(delete);
        help.getItems().addAll(about);
        statusBar.getChildren().add(charactercout);
    }

    public HBox getStatusBar() {
        return statusBar;
    }

    public void setStatusBar(HBox statusBar) {
        this.statusBar = statusBar;
    }

    public Text getCharactercout() {
        return charactercout;
    }

    public void setCharactercout(Text charactercout) {
        this.charactercout = charactercout;
    }

}
