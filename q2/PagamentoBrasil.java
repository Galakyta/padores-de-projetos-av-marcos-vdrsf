package q2;

public class PagamentoBrasil extends Pagamento {

    public PagamentoBrasil(double valor) { 
       super(valor);
    }


    @Override 
public  String imprimirPagamento(){
    double valorASerPago = (valor * 0.05);
    return "Valor a ser pago: " + valor + " com impostos: " + (valor + valorASerPago) + "Metodo de pagamento aceito: PIX ";
}

}
