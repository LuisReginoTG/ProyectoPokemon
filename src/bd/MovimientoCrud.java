package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import model.Estado;
import model.Movimiento;
import model.MovimientoAtaque;
import model.MovimientoEstado;
import model.MovimientoMejora;
import model.Pokemon;
import model.Tipo;

public class MovimientoCrud {

	public static LinkedList<Movimiento> obtenerMovimientos(Connection conexion, int idPokemon) throws SQLException {
		String sql = "SELECT M.ID_MOVIMIENTO,\r\n" 
					+ "	M.NOM_MOVIMIENTO,\r\n" 
				+ "    M.POTENCIA,\r\n"
				+ "    M.TIPO,\r\n" 
				+ "    M.ESTADO,\r\n" 
				+ "    M.QUITA,\r\n" 
				+ "    M.TURNOS,\r\n"
				+ "    M.MEJORA,\r\n" 
				+ "    M.CANT_MEJORA,\r\n" 
				+ "    M.NUM_USOS,\r\n"
				+ "    M.NIVEL_APRENDIZAJE\r\n"
				+ "FROM MOVIMIENTO_POKEMON MP\r\n" 
				+ "INNER JOIN MOVIMIENTOS M\r\n"
				+ "	ON M.ID_MOVIMIENTO = MP.ID_MOVIMIENTO\r\n" 
				+ "WHERE MP.ID_POKEMON=?";

		PreparedStatement ps = conexion.prepareStatement(sql);
		ps.setInt(1, idPokemon);

		ResultSet rs = ps.executeQuery();
		LinkedList<Movimiento> listadoMovimientos = new LinkedList<Movimiento>();

		while (rs.next()) {
			if (!rs.getString(8).equals("")) {//Mejora
				MovimientoMejora mj = new MovimientoMejora();
				mj.setIdMovimiento(rs.getInt(1));
				mj.setNombre(rs.getString(2));
				mj.setLongevidad(rs.getInt(7));
				mj.setNumeroUsos(rs.getInt(10));
				mj.setTipoMejora(rs.getString(8));
				listadoMovimientos.add(mj);
				
			} else if (!rs.getString(5).equals("")) {
				MovimientoEstado est = new MovimientoEstado();
				est.setIdMovimiento(rs.getInt(1));
				est.setNombre(rs.getString(2));
				est.setLongevidad(rs.getInt(7));
				est.setNumeroUsos(rs.getInt(10));
				est.setEstado(Estado.convertirEstadoDesdeString(rs.getString(5)));
				
				listadoMovimientos.add(est);
			} else {
				MovimientoAtaque at = new MovimientoAtaque();

				at.setIdMovimiento(rs.getInt(1));
				at.setNombre(rs.getString(2));
				at.setPotencia(rs.getInt(3));
				at.setTipo(Tipo.convertirTipoDesdeString(rs.getString(4)));
				at.setNumeroUsos(rs.getInt(10));
				
				listadoMovimientos.add(at);
			}
		}
		return listadoMovimientos;
	}

}
