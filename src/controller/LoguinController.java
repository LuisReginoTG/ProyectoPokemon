package controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

import bd.DataBaseConnection;
import bd.EntrenadorCrud;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import model.Entrenador;

public class LoguinController {

	private Stage stage;
	private boolean sonido = true;
	private MediaPlayer mediaPlayer;

	@FXML
	private Button btnAceptar;

	@FXML
	private Button btnCancelar;

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
	private ImageView imgSonido;

	@FXML
	public void cerrarAplicacion(ActionEvent event) {
		Stage stage = (Stage) btnCancelar.getScene().getWindow();
		stage.close();
	}

	@FXML
	private void eventKey(KeyEvent event) {
		if (event.getCharacter().equals(" ")) {
			event.consume();// Detenemos el evento
		}
	}

	@FXML
	public void loguearse(ActionEvent event) {
		// Object evt = event.getSource();

		if (txtUsuario.getText().isEmpty()) {
			lblError.setText("Error: Inserta nombre de usuario");
			lblError.setVisible(true);
		} else if (txtPass.getText().isEmpty()) {
			lblError.setText("Error: Inserta contraseña");
			lblError.setVisible(true);
		} else {
			String usuario = txtUsuario.getText();
			String pass = txtPass.getText();

			String sql = "SELECT PASSWORD\n" + "FROM ENTRENADOR\n" + "WHERE NOM_ENTRENADOR = ?";

			DataBaseConnection con = new DataBaseConnection();

			Connection conexion = con.getConnection();

			try {
				PreparedStatement ps = conexion.prepareStatement(sql);
				ps.setString(1, usuario);

				ResultSet rs = ps.executeQuery();

				Entrenador entrenador = new Entrenador(usuario, pass);

				if (!rs.isBeforeFirst()) {
//					lblError.setText("Usuario no registrado");
//					lblError.setVisible(true);

					int opcion = JOptionPane.showConfirmDialog(null, "Usuario no registrado, ¿desea registrarlo?");

					if (opcion == JOptionPane.YES_OPTION) {

						EntrenadorCrud.crearEntrenador(conexion, entrenador);
						abrirMenuPrincipal(entrenador);

					} else {
						txtPass.setText("");
					}
				} else {
					while (rs.next()) {
						if (rs.getString(1).equals(pass)) {
							System.out.println("Usuario encontrado");
							// Cambiamos de ventana
							EntrenadorCrud.obtenerIDPokedolaresEntre(conexion, entrenador);
							abrirMenuPrincipal(entrenador);

						} else {
							lblError.setText("Contraseña incorrecta");
							lblError.setVisible(true);
						}
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	private void abrirMenuPrincipal(Entrenador ent) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/principal.fxml"));
			Parent root = loader.load();
			PrincipalController principalController = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);// Cargamos la escena en el stage

			principalController.init(ent, stage, this);
			stage.show();
			this.stage.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void show() {
		stage.show();
		lblError.setVisible(false);
		txtUsuario.setText("");
		txtPass.setText("");

	}

	public void setStage(Stage primaryStage) {
		stage = primaryStage;
//		String ruta = "../../sonidos/Opening.mp3";
//		Media sound = new Media(new File(ruta).toURI().toString());
//		mediaPlayer = new MediaPlayer(sound);
//		mediaPlayer.play();

	}

	@FXML
	void activarDesactivarSonido(MouseEvent event) {

	}

}
