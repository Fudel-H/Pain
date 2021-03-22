package Painview;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textField1;
    public Button saveButton;
    public TextArea myBigTextArea;
    public ListView Listview;

    public void userSavedText() {
        String textToSave = textField1.getText();
        myBigTextArea.setText(textToSave);
        myBigTextArea.setDisable(false);
        textField1.setText("");
        System.out.println(textToSave);
        Listview.getItems().add(textToSave);
    }
}
