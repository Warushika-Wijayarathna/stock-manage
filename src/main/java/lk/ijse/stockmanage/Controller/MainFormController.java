package lk.ijse.stockmanage.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


import java.io.IOException;




public class MainFormController {
    @FXML
    private StackPane formContainer;

    @FXML
    private void btnCustomerClick(ActionEvent actionEvent) throws IOException {
        loadAndSetForm("/View/customer_form.fxml");
    }

    @FXML
    private void btnItemClick(ActionEvent actionEvent) throws IOException {
        loadAndSetForm("/View/item_form.fxml");
    }

    @FXML
    private void btnSupplyClick(ActionEvent actionEvent) throws IOException {
        loadAndSetForm("/View/supply_form.fxml");;
    }

    @FXML
    private void btnLogoutClick(ActionEvent actionEvent)throws IOException {
        loadAndSetForm("/View/logout_form.fxml");
    }

    private void showLoginForm() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/login_form.fxml"));
            Parent loginForm = loader.load();

            Scene scene = new Scene(loginForm);
            Stage stage = (Stage) formContainer.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    private void loadAndSetForm(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent formRoot = loader.load();

            formContainer.getChildren().clear();
            formContainer.getChildren().add(formRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
