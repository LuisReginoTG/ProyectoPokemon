package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Entrenador;

public class CombateController {

	private PrincipalController principalController;
	private Entrenador ent;
	private Stage stage;
	
    @FXML
    private Button btnCambiarPokemon;

    @FXML
    private Button btnMov1;

    @FXML
    private Button btnMov2;

    @FXML
    private Button btnMov3;

    @FXML
    private Button btnMov4;

    @FXML
    private Button btnSalir;

    @FXML
    private ImageView imgFondoBatalla;

    @FXML
    private ImageView imgPokeJugador;

    @FXML
    private ImageView imgPokeRival;

    @FXML
    private Label lblNivelPokeJugador;

    @FXML
    private Label lblNivelPokeRival;

    @FXML
    private Label lblNomJugador;

    @FXML
    private Label lblNomRival;

    @FXML
    private Label lblPokeJugador;

    @FXML
    private Label lblPokeRival;

    @FXML
    private ProgressBar prbPokeJugador;

    @FXML
    private ProgressBar prbPokeRival;

    @FXML
    private TextArea txtLogCombate;

	public void init(Entrenador entrenador, Stage stage, PrincipalController principalController) {
		lblPokeJugador.setText(entrenador.getNombre());
		this.principalController =principalController;
		this.stage = stage;
		this.ent = entrenador;
		
		btnMov1.setText("Placaje");
		
	}

}
