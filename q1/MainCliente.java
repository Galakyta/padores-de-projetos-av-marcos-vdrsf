public class MainCliente {
public static void main(String[] args) {
    //m v d r s f //meu nome abreviado
     factoryGerencia gerencia1 = new gerenciaAerea();
     factoryGerencia gerencia2 = new gerenciaFerroviaria();
     factoryGerencia gerencia3 = new gerenciaRodoviaria();

     //input do usuario é com virgula sempre e hardcodado é ponto

     //nn tira sarro de mim por ter deixado isso na consulta eu sempre esqueco 

     passagem apolice1 = gerencia1.passagemGerada(10000.00, "marcos");
     passagem apolice2 = gerencia2.passagemGerada(1000.00, "alone on your planet");
     passagem apolice3 = gerencia3.passagemGerada(1000.00, "the haunt");

     gerencia1.resumo(apolice1);
     gerencia2.resumo(apolice2);
     gerencia3.resumo(apolice3);

     

}
}
