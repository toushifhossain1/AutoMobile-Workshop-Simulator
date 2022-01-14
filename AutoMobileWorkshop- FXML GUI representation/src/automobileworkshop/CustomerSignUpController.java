/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobileworkshop;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static sun.management.Agent.getText;

/**
 * FXML Controller class
 *
 * @author USer
 */
public class CustomerSignUpController implements Initializable {

    @FXML
    private TextField SignUpName;
    @FXML
    private TextField SignUpCarModel;
    @FXML
    private TextField SignUpCarRegNo;
    @FXML
    private TextField SignUpEmail;
    @FXML
    private TextField SignUpPassword;
    @FXML
    private Button ConfirmButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ConfirmButtonOnClick(ActionEvent event) {
       String customer_name , customer_email , cutomer_carmodel, customer_reg_no, customer_password;
       
    }

    @FXML
    private void GoBackButtonOnClick(ActionEvent event) {
        try {
            Parent HumanResourceManagerDashBoard = FXMLLoader.load(getClass().getResource("AutoMobileWorkshop.fxml"));
            Scene LogInscene = new Scene(HumanResourceManagerDashBoard);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(LogInscene);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AutoMobileWorkshopController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
