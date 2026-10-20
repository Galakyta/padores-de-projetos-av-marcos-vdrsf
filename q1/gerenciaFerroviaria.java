public class gerenciaFerroviaria extends factoryGerencia {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo
@Override 
public  passagem apoliceGerada(double valorDoCalculo, String nome){
    return new passagemFerroviaria(valorDoCalculo, nome);
}

}
