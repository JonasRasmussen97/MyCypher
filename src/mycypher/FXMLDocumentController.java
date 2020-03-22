/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycypher;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SaltO
 */
public class FXMLDocumentController implements Initializable {
    
    Cypher c;

   
    @FXML
    private Button encryptButton;
    @FXML
    private Button decryptButton;
    @FXML
    private TextArea encryptedText;
    @FXML
    private TextArea decryptedText;
    @FXML
    private TextArea normalText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        c = new Cypher();
    }    

    @FXML
    private void encryptText(ActionEvent event) {
        encryptedText.setText("");
        String encrypt = c.encrypt(normalText.getText());
        encryptedText.setText(encrypt);
    }

    @FXML
    private void decryptText(ActionEvent event) {
        decryptedText.setText("");
        String decrypt = c.decrypt(normalText.getText());
        decryptedText.setText(decrypt);
    }
    
}
