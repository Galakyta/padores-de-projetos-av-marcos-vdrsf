public class passagemAerea extends passagem {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo

    public passagemAerea(double valorDoCalculo, String nome) {
       super(valorDoCalculo, nome);
        
    }
@Override 
public double calcularEmbarque(){
    valorDoCalculo = (valorDoCalculo * 0.08);
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE PASSAGEM: AEREA // NOM DO PASSAGEIRO:"+ nome +" // VALOR DO EMBARQUE 8%: " + valorDoCalculo + " DOCUMENTOS EXIGIDOS: BILEHTE ELETRONICO E DOC/C FOTO";
}
}
