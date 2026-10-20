package q2;


public abstract class Comprovante  {

protected String identificador;

    public Comprovante(String identificador) {
        this.identificador = identificador;
    }



public abstract String imprimirComprovante();

}
