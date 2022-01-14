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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USer
 */
public class HumanResourceManagerDashBoardController implements Initializable {

    @FXML
    private TableView<?> CustomerSignUpReq;
    @FXML
    private BarChart<?, ?> MechanicAbsentBar;
    @FXML
    private PieChart PieChartOfEngineSupplier;
    @FXML
    private TextField IDInputForCreateAccount;
    @FXML
    private TextField PositionInput;
    @FXML
    private TextField PasswordInput;
    @FXML
    private TableView<?> EmergencyAndLeaveOfAbsence;
    @FXML
    private TextField IDforWarnBanGrant;
    @FXML
    private TextArea Message;
    @FXML
    private VBox WarnedMechanic;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddAccountButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void WarnAccountButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void RemoveAccountButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void GrantLeaveButtonOnClick(ActionEvent event) {
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
