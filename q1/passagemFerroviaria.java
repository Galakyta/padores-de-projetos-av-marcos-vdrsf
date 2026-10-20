public class passagemFerroviaria extends passagem {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo

 //queria ir p morretes fim de ano


    public passagemFerroviaria(double valorDoCalculo, String nome) {
       super(valorDoCalculo, nome);
        
    }
@Override 
public double calcularEmbarque(){
    valorDoCalculo = (valorDoCalculo * 0.05);
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE PASSAGEM: FERROVARIA  // NOM DO PASSAGEIRO:"+ nome +" // RODOVIARIA VALOR DO EMBARQUE 5%: " + valorDoCalculo + " DOCUMENTOS EXIGIDOS:COMPROVANTE DE RESERVA DOC/C FOTO";
}
}
