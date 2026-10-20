public class gerenciaRodoviaria implements factoryGerencia {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo
@Override 
public  passagem apoliceGerada(double valorDoCalculo){
    return new passagemRodoviaria(valorDoCalculo);
}

}
