package q2;


public class InvoiceBrasil extends Invoice{

    @Override 
public  Comprovante comprovanteGerado(String identificador){
    return new ComprovanteBrasi(identificador);
}
@Override 
public Pagamento pagamentoGerado(double valor){
    return new PagamentoBrasil(valor);
}
@Override 
public DocFiscal docFiscalGerado(){
    return new DocFiscalBrasil();
}

}
