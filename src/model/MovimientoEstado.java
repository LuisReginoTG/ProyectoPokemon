package model;

/**
 * Class MovimientoEstado
 */
public class MovimientoEstado extends Movimiento {

	private int longevidad;
	private Estado estado;

	public MovimientoEstado() {
	}

	@Override
	public void ejecutar(Pokemon atacante, Pokemon objetivo) {

	}

	public void setLongevidad(int longevidad) {

		this.longevidad = longevidad;
	}

	public int getLongevidad() {

		return longevidad;
	}

	public void setEstado(Estado estado) {

		this.estado = estado;
	}

	public Estado getEstado() {

		return estado;
	}

	public void aplicarEstado(Movimiento nombre) {
		
	}

	public void quitaEstado(Movimiento nombre) {
		estado = null;
	}

}