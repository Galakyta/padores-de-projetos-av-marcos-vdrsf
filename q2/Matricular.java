package q2;


public class Matricular {
    private final Invoice invoice;

    public Matricular(Invoice invoice) {
        this.invoice = invoice;
    }

 

    public void finalizarPedido(double valor, String identificador){
        
        Comprovante e = invoice.comprovanteGerado(identificador);
        Pagamento p = invoice.pagamentoGerado(valor);
        DocFiscal d = invoice.docFiscalGerado();

        System.out.println(e.imprimirComprovante());
        System.out.println(p.imprimirPagamento());
        System.out.println(d.imprimirDocFiscal());
         
    }

}
