public abstract class passagem {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo

public double valorDoCalculo;
public String nome;

    public passagem(double valorDoCalculo, String nome) {
    this.valorDoCalculo = valorDoCalculo;
    this.nome = nome;
    }

    

public abstract double calcularEmbarque();
public abstract String imprimirResumo();
}
