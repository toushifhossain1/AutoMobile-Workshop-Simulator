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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USer
 */
public class SupplierDashBoardController implements Initializable {

    @FXML
    private Label SupplierID;
    @FXML
    private Label SupplierStatusAndMessage;
    @FXML
    private TableView<?> Inventory;
    @FXML
    private TextField EngineSuggestion;
    @FXML
    private TextField QuantitySuggestion;
    @FXML
    private TabPane PendingOrders;
    @FXML
    private Tab DeliveryOrderPending;
    @FXML
    private Tab FailedToDeliverProducts;
    @FXML
    private TextField SupplierEngineModelDelivered;
    @FXML
    private TextField SupplierEngineQuantityDelivered;
    @FXML
    private DatePicker SupplierDateOfDelivery;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SupplierSuggestForPurchaseButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SupplierConfirmDeliveryButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void RecordProductSuppliedButtonOnClick(ActionEvent event) {
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
