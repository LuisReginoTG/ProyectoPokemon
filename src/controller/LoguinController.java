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
	private Label lblError;

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
	private void eventKey(KeyEvent event) {
//		Object evt = event.getSource();
//
//		if (evt.equals(txtUsuario)) {
//			if (event.getCharacter().equals(" ")) {
//				event.consume();// Detenemos el evento
//			}
//		} else if (evt.equals(txtPass)) {
//			if (event.getCharacter().equals(" ")) {
//				event.consume();// Detenemos el evento
//			}
//		}
		
		if (event.getCharacter().equals(" ")) {
			event.consume();// Detenemos el evento
		}
	}

	@FXML
	public void loguearse(ActionEvent event) {
		Object evt  = event.getSource();
		
		if(txtUsuario.getText().isEmpty()) {
			lblError.setText("Error: Inserta nombre de usuario");
			lblError.setVisible(true);
		}else if(txtPass.getText().isEmpty()) {
			lblError.setText("Error: Inserta contraseña");
			lblError.setVisible(true);
		}else {
			String usuario = txtUsuario.getText();
			String pass = txtPass.getText();
			
			String sql ="SELECT COUNT(*)\n"
					+ "FROM ENTRENADOR\n"
					+ "WHERE NOM_ENTRENADOR = ?\n"
					+ "AND PASSWORD = ?";
			
			
			
		}
	}

	@FXML
	void registrar(ActionEvent event) {

	}

}
