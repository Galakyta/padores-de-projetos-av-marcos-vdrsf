package q2;


public class InvoiceChile extends  Invoice{

    @Override 
public Comprovante comprovanteGerado(String identificador){
    return new ComprovanteChile(identificador);
}
@Override 
public Pagamento pagamentoGerado(double valor){
    return new PagamentoChile(valor);
}
@Override 
public DocFiscal docFiscalGerado(){
    return new DocFiscalChile();
}

}
