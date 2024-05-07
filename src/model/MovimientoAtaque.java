package model;

/**
 * Class MoviminetoAtaque
 */
public class MovimientoAtaque extends Movimiento {



    private int potencia;
    private static Tipo tipo;

    public MovimientoAtaque () { }

    @Override
    public void ejecutar(Pokemon atacante, Pokemon objetivo) {

    }

    @Override
    public boolean calcularProbabilidad() {
        return false;
    }



    public void setPotencia (int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia () {
        return potencia;
    }


    public void setTipo (Tipo tipo) {
        this.tipo = tipo;
    }


    public static Tipo getTipo() {
        return tipo;
    }


    



}
