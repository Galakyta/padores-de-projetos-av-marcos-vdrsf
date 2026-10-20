public abstract class   factoryGerencia {
public abstract passagem apoliceGerada(double valorDoCalculo, String nome);
public final void resumo(passagem passagem){
    passagem viagemGerada = passagem;

    System.out.println(viagemGerada.calcularEmbarque());
    System.out.println(viagemGerada.imprimirResumo());
}
}
