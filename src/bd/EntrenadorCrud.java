package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import model.Entrenador;

public class EntrenadorCrud {

	public static void crearEntrenador(Connection con, Entrenador entrenador) throws SQLException {
		
		entrenador.setIdEntrador(obtenerIdEntrenador(con));
		entrenador.setPokedollares(generarPokedolares());
		
		String sql = "INSERT INTO ENTRENADOR (ID_ENTRENADOR, NOM_ENTRENADOR, PASSWORD, POKEDOLARES) \r\n"
					+ "VALUES(?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, entrenador.getIdEntrador());
		st.setString(2, entrenador.getNombre());
		st.setString(3, entrenador.getPass());
		st.setDouble(4, entrenador.getPokedollares());
		st.executeUpdate();
		
	}

	private static int generarPokedolares() {
		Random rd = new Random();
		return rd.nextInt(501) + 1000;
	}

	private static int obtenerIdEntrenador(Connection con) throws SQLException {
		int idEntrenador = 0;
		String sql = "SELECT MAX(ID_ENTRENADOR)+1\r\n" + "FROM ENTRENADOR";

		Statement st;

		st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			idEntrenador = rs.getInt(1);
		}

		return idEntrenador;
	}

	public static void obtenerIDPokedolaresEntre(Connection conexion, Entrenador entrenador) throws SQLException {
		String sql = "SELECT ID_ENTRENADOR, POKEDOLARES\r\n"
				+ "FROM ENTRENADOR\r\n"
				+ "WHERE NOM_ENTRENADOR = ?\r\n"
				+ "AND PASSWORD = ?";	
		
		PreparedStatement ps = conexion.prepareStatement(sql);
		ps.setString(1, entrenador.getNombre());
		ps.setString(2, entrenador.getPass());
		
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			entrenador.setIdEntrador(rs.getInt(1));
			entrenador.setPokedollares(rs.getInt(2));
		}
		
	}

}
