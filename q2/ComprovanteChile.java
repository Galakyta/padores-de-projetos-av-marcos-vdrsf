package q2;


public class ComprovanteChile extends Comprovante{
    


    public ComprovanteChile(String identificador) {
        super(identificador);
    }

@Override
public  String imprimirComprovante(){
    return "ALUNO CHILENO MATRICULADO - RUT" + identificador;
}


}
