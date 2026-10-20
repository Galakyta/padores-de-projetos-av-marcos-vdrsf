package q2;


public class ComprovanteBrasi extends Comprovante {

    

    public ComprovanteBrasi(String identificador) {
        super(identificador);
    }
@Override
public  String imprimirComprovante(){
    return "ALUNO BRASILEIRO MATRICULADO - CPF: " + identificador;
}


}
