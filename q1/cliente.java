public class cliente {
public static void main(String[] args) {
    
     factoryGerencia gerencia1 = new gerenciaAerea();
     factoryGerencia gerencia2 = new gerenciaFerroviaria();
     factoryGerencia gerencia3 = new gerenciaRodoviaria();

     //input do usuario é com virgula sempre e hardcodado é ponto

     //nn tira sarro de mim por ter deixado isso na consulta eu sempre esqueco 

     passagem apolice1 = gerencia1.apoliceGerada(10000.00);
     passagem apolice2 = gerencia2.apoliceGerada(1000.00);
     passagem apolice3 = gerencia3.apoliceGerada(1000.00);

     System.out.println(apolice1.calcularEmbarque());
     System.out.println(apolice1.imprimirResumo());

     System.out.println(apolice2.calcularEmbarque());
     System.out.println(apolice2.imprimirResumo());

     System.out.println(apolice3.calcularEmbarque());
     System.out.println(apolice3.imprimirResumo());

     

}
}
