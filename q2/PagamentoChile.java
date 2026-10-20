package q2;


public class PagamentoChile extends Pagamento {

    public PagamentoChile(double valor) {
       super(valor);
    }


    @Override 
public  String imprimirPagamento(){
    double valorASerPago = (valor * 0.23);
return "Valor A ser pago: " + valor + " com impostos: " + (valor + valorASerPago) + "Metodo de pagamento aceito: Web Pay";
}

}
