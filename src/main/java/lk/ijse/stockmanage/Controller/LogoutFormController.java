package lk.ijse.stockmanage.Controller;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;



public class LogoutFormController {


    @FXML
    private void btnConfirmLogout(ActionEvent event) {
        Platform.exit();
    }


    @FXML
    private void btnCancelLogout(ActionEvent event) {

    }
}


