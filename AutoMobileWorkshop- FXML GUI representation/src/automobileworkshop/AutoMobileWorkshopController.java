/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobileworkshop;


import java.io.IOException;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static sun.management.Agent.getText;

/**
 * FXML Controller class
 *
 * @author USer
 */
public class AutoMobileWorkshopController implements Initializable {

    char passwordInput;
    
    
    
    @FXML
    private RadioButton CustomerRadioButton;
    @FXML
    private ToggleGroup toggleGroup1;
    @FXML
    private RadioButton MechanicRadioButton;
    @FXML
    private RadioButton EngineSupplierRadioButton;
    @FXML
    private RadioButton HumanResourceManagerRadioButton;
    @FXML
    private TextField GetPassword;
    @FXML
    private Button LogIn;
    @FXML
    private Button SignUp;
    @FXML
    private RadioButton StoreManagerRadioButton;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void GetPassword (ActionEvent event){
        passwordInput = getChar(GetPassword.getText());
}

    @FXML
    private void handleButtonAction(MouseDragEvent event) {
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

    @FXML
    private void handleButtonAction(MouseEvent event) {
    }


    @FXML
    private void ClickToLogIn(ActionEvent event) {
       
        if(HumanResourceManagerRadioButton.isSelected() ) {
            
            try {
            Parent HumanResourceManagerDashBoard = FXMLLoader.load(getClass().getResource("HumanResourceManagerDashBoard.fxml"));
            Scene LogInscene = new Scene(HumanResourceManagerDashBoard);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(LogInscene);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AutoMobileWorkshopController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        } 
            else if (MechanicRadioButton.isSelected()) {
            
                 try {
                Parent MechanicDashBoard = FXMLLoader.load(getClass().getResource("MechanicDashBoard.fxml"));
                Scene LogInscene = new Scene(MechanicDashBoard);
        
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(LogInscene);
                    window.show();
                       } 
         catch (IOException ex) {
            Logger.getLogger(AutoMobileWorkshopController.class.getName()).log(Level.SEVERE, null, ex);
                                             }
            }
        else if (StoreManagerRadioButton.isSelected()) {
            
                 try {
                Parent StoreManagerDashBoard = FXMLLoader.load(getClass().getResource("StoreManagerDashBoard.fxml"));
                Scene LogInscene = new Scene(StoreManagerDashBoard);
        
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(LogInscene);
                    window.show();
                       } 
         catch (IOException ex) {
            Logger.getLogger(AutoMobileWorkshopController.class.getName()).log(Level.SEVERE, null, ex);
                                             }
            }
        
        else if (EngineSupplierRadioButton.isSelected()) {
            
                 try {
                Parent EngineSupplierDashBoard = FXMLLoader.load(getClass().getResource("SupplierDashBoard.fxml"));
                Scene LogInscene = new Scene(EngineSupplierDashBoard);
        
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(LogInscene);
                    window.show();
                       } 
         catch (IOException ex) {
            Logger.getLogger(AutoMobileWorkshopController.class.getName()).log(Level.SEVERE, null, ex);
                                             }
            }
            else if(CustomerRadioButton.isSelected()){
                try {
                Parent CustomerDashBoard = FXMLLoader.load(getClass().getResource("CustomerDashBoard.fxml"));
                Scene LogInscene = new Scene(CustomerDashBoard);
        
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                 window.setScene(LogInscene);
                    window.show();
                       } 
         catch (IOException ex) {
            Logger.getLogger(AutoMobileWorkshopController.class.getName()).log(Level.SEVERE, null, ex);
                                             }
            
            }
    
    
    
    }

    @FXML
    private void ClickToSignUp(ActionEvent event) {
        try {
            Parent CustomerSignUp = FXMLLoader.load(getClass().getResource("CustomerSignUp.fxml"));
            Scene CustomerSignUpscene = new Scene(CustomerSignUp);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(CustomerSignUpscene);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AutoMobileWorkshopController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GetPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private char getChar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
