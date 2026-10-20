package q2;


public class Main {

    public static void main(String[] args) {
        
        Matricular Brasil = new Matricular(new InvoiceBrasil());
        Brasil.finalizarPedido(1000.00,"123.456.789-13");
        Matricular Chile = new Matricular(new InvoiceChile());
        Chile.finalizarPedido(2000.00, "13.13.13.13.13");
        //queria ter dado um PULO quando foi de primeira AAAAAAAAAAA

        //
    }


}
