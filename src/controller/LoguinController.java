package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class LoguinController {

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnRegistrar;

    @FXML
    private ImageView imgFondoLoguin;

    @FXML
    private ImageView imgLogoLoguin;

    @FXML
    private Label lblPass;

    @FXML
    private Label lblUsuario;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUsuario;

    @FXML
    public void cerrarAplicacion(ActionEvent event) {
    	Stage stage = (Stage) btnCancelar.getScene().getWindow();
    	stage.close();
    }

    @FXML
    public void eventKey(KeyEvent event) {

    }

    @FXML
    public void loguearse(ActionEvent event) {

    }

    @FXML
    void registrar(ActionEvent event) {

    }

}
