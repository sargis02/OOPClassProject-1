/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package arithmeticoperation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ArithmeticOperationSceneController implements Initializable {

    @FXML    private TextField xTextField;
    @FXML    private TextField yTextField;
    @FXML    private Label resultLabel;
    @FXML
    private Button addButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void addButtonOnMouseClicked(MouseEvent event) {
        String xStr = xTextField.getText();
        String yStr = yTextField.getText();
        
        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        
        int sum = xVal + yVal;
        String resultStr = Integer.toString(sum);
        
        resultLabel.setText(xStr + "+" + yStr + "=" + resultStr);
        
        
    }

    @FXML
    private void substractButtonOnMouseClicked(MouseEvent event) {
        String xStr = xTextField.getText();
        String yStr = yTextField.getText();
        
        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        
        int difference = xVal - yVal;
        String resultStr = Integer.toString(difference);
        
        resultLabel.setText(xStr + "-" + yStr + "=" + resultStr);
    }

    @FXML
    private void multiplyButtonOnMouseClicked(MouseEvent event) {
        String xStr = xTextField.getText();
        String yStr = yTextField.getText();
        
        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        
        int product = xVal * yVal;
        String resultStr = Integer.toString(product);
        
        resultLabel.setText(xStr + "*" + yStr + "=" + resultStr);
        
    }

    @FXML
    private void addButtonOnMouseExited(MouseEvent event) {
        addButton.setText("Add");
    }

    @FXML
    private void addButtonOnMouseEntered(MouseEvent event) {
        addButton.setText("Get out");
    }
}
