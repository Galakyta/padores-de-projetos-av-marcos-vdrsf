public class gerenciaRodoviaria extends factoryGerencia {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo
@Override 
public  passagem passagemGerada(double valorDoCalculo, String nome){
    return new passagemRodoviaria(valorDoCalculo, nome);
}

}
