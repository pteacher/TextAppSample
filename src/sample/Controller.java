package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;
import java.util.Scanner;

public class Controller {
    @FXML
    private TextArea textEditArea;

    @FXML
    private void saveText(ActionEvent event) {
        try {
            FileOutputStream fout = new FileOutputStream("data.txt");
            fout.write(textEditArea.getText().getBytes());
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void readText(ActionEvent event) {
        try {
            FileInputStream fin = new FileInputStream("data.txt");
            String text = new Scanner(fin).nextLine();
            textEditArea.setText(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
