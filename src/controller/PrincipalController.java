package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Entrenador;

public class PrincipalController {
	public static final int EQUIPOPRINCIPAL =1;
	public static final int EQUIPOSECUNDARIO =2;
	
	private Entrenador entrador;
	private Stage stage;
	private LoguinController loginController;

    @FXML
    private Button btnCapturar;

    @FXML
    private Button btnCombate;

    @FXML
    private Button btnEntrenar;

    @FXML
    private Button btnEquipo;

    @FXML
    private Button btnHospital;

    @FXML
    private Button btnTienda;

    @FXML
    private ImageView imgFondoPrincipal;

    @FXML
    private ImageView imgSalir;

    @FXML
    private ImageView imgTituloPrincipal;
    
    @FXML
    private Label lblPokedollares;

    @FXML
    private Label lblUsuario;

	public void init(String usuario, String pass, Stage stage2, LoguinController loguinController) {
		lblUsuario.setText(usuario);
		this.loginController =loguinController;
		this.stage = stage2;
		this.entrador = new Entrenador(usuario, pass);
//		cargarEquipo(EQUIPOPRINCIPAL);//EquipoPrincipal
//		cargarEquipo(EQUIPOSECUNDARIO);//EquipoSencudario
//		cargarMochilaEntrenador();
	}


    @FXML
    public void salir(MouseEvent event) {
    	loginController.show();
    	stage.close();
    }
}
