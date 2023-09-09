package lk.ijse.stockmanage.Controller;



import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
public class DashBoardController {
    public TextField txtMsg;

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        String text = txtMsg.getText();

        System.out.println(text);
    }
}
