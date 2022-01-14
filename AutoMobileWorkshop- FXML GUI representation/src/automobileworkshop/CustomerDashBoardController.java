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
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USer
 */
public class CustomerDashBoardController implements Initializable {

    @FXML
    private Label CustomerName;
    @FXML
    private Label CustomerVehicleModel;
    @FXML
    private Label CustomerCommunicateMechanic;
    @FXML
    private Label CustomerCommunicateStoreManager;
    @FXML
    private TableView<?> AvailableMechanicTable;
    @FXML
    private TextField CustomerTextsMechanic;
    @FXML
    private TextField CustomerTextsStoreManager;
    @FXML
    private TextField CustomerLocation;
    @FXML
    private TextField CustomerSendNoteForPickUp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CustomerDownloadInvoiceButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CustomerMenuButtonForMechanicButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CustomerMenuButtonForStoreManagerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CustomerToMechanicSendTextButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CustomerToStoreManagerSendTextButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CustomerRequestForPickUpButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CustomerUploadImageForPickupButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CustomerOrderProductButtonOnClick(ActionEvent event) {
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
