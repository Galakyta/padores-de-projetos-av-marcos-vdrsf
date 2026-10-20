package q2;


public class Main {

    public static void main(String[] args) {
        
        Matricular pedidoBrasil = new Matricular(new InvoiceBrasil());
        pedidoBrasil.finalizarPedido(1000.00,"123.456.789-13");
        Matricular pedidoAlemanha = new Matricular(new InvoiceChile());
        pedidoAlemanha.finalizarPedido(2000.00, "13.13.13.13.13");
        //queria ter dado um PULO quando foi de primeira AAAAAAAAAAA

        //
    }


}
