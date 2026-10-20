public class passagemRodoviaria extends passagem {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo



    public passagemRodoviaria(double valorDoCalculo, String nome) {
        super(valorDoCalculo, nome);
    }
    //
@Override 
public double calcularEmbarque(){
    valorDoCalculo = (valorDoCalculo * 0.03);
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE PASSAGEM: RODOVIARIA // NOM  DO PASSAGEIRO:"+ nome +" // VALOR DO EMBARQUE 3%: " + valorDoCalculo + " DOCUMENTOS EXIGIDOS: DOC/C FOTO";
}
}