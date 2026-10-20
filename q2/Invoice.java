package q2;
public abstract class Invoice {
public abstract  Comprovante comprovanteGerado(String iden);
public abstract Pagamento pagamentoGerado(double valor);
public abstract DocFiscal docFiscalGerado();
}
