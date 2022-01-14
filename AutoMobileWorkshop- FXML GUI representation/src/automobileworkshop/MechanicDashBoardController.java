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
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USer
 */
public class MechanicDashBoardController implements Initializable {

    @FXML
    private Label MechanicID;
    @FXML
    private Label MechanicStatusAndMessage;
    @FXML
    private Label MechanicCommunicateCustomer;
    @FXML
    private TableView<?> Inventory;
    @FXML
    private TextField CustomerConversationTextField;
    @FXML
    private TextField HRManagerConversationTextField;
    @FXML
    private TextField EngineSuggestion;
    @FXML
    private TextField EngineQuantitySuggestion;
    @FXML
    private TextField MechanicRecordTimeButtonOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MechanicMenuButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void MechanicSplitMenuButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SendTextToCustomerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SendTextToHRManagerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SubmitAttendanceButtonOnClick(ActionEvent event) {
    }


    @FXML
    private void StartWorkButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void EndWorkButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void MechanicSuggestsForPurchaseButtonOnClick(ActionEvent event) {
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
