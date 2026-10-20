public abstract class passagem {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo

public double valorDoCalculo;

    public passagem(double valorDoCalculo) {
    this.valorDoCalculo = valorDoCalculo;
    }

    

public abstract double calcularEmbarque();
public abstract String imprimirResumo();
}
