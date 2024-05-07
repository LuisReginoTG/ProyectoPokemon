package model;


/**
 * Class MoviminetoMejora
 */
public class MovimientoMejora extends Movimiento {

    //
    // Fields
    //

    private int longevidad;
    private String tipoMejora;

    //
    // Constructors
    //
    public MovimientoMejora () { }

    @Override
    public void ejecutar(Pokemon atacante, Pokemon objetivo) {

    }

    @Override
    public boolean calcularProbabilidad() {
        return false;
    }


    public void setLongevidad (int longevidad) {

        this.longevidad = longevidad;
    }


    public int getLongevidad () {

        return longevidad;
    }


    public void setTipoMejora (String tipoMejora) {

        this.tipoMejora = tipoMejora;
    }


    public String getTipoMejora () {

        return tipoMejora;
    }

    //
    // Other methods
    //

    /**
     */
    public void applyImplement()
    {
    }


    /**
     * @param        longevidad
     * @param        tipo
     */
    public void new_operation(int longevidad, String tipo)
    {
    }


}
