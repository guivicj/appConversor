package org.guivic.appconversor;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private VBox vBox;
    @FXML
    private Label instructions;
    @FXML
    private Label nameSurname;
    @FXML
    private TextField nameField;
    @FXML
    private Label mobile;
    @FXML
    private TextField mobileField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private CheckBox chkSpain;
    @FXML
    private CheckBox chkAbroad;
    @FXML
    private Button show;
    @FXML
    private Label resoult;
    @FXML
    private Label nameResoult;
    @FXML
    private Label userName;
    @FXML
    private Label mobileResoult;
    @FXML
    private Label userMobile;
    @FXML
    private Label dateResoult;
    @FXML
    private Label userDate;
    @FXML
    private Label origin;
    @FXML
    private Label userOrigin;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        show.setTooltip(new Tooltip("Este botón mostrará la información del formulario"));
        datePicker.setTooltip(new Tooltip("Escoja una fecha para el formulario"));

    }

    @FXML
    protected void processData() {
        userName.setText(nameField.getText());
        userMobile.setText(mobileField.getText());
        userDate.setText(datePicker.getValue().toString());
        if (chkSpain.isSelected()) {
            userOrigin.setText(chkSpain.getText());
        } else {
            userOrigin.setText(chkAbroad.getText());
        }

    }

    @FXML
    protected void selectSpain() {
        chkAbroad.setSelected(false);
    }

    @FXML
    protected void selectAbroad() {
        chkSpain.setSelected(false);
    }

}