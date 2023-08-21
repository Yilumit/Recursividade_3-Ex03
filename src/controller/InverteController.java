package controller;

public class InverteController{
  public InverteController{
    super();
  }

  public String inverteCaracteres(String palavra, int posicao, int tamanhoString){
    String inversa = "";
    int tamanhoString = palavra.length();
    if(posicao == tamanhoString){
      return palavra.substring(posicao,posicao);
    }else{
      inversa = inversa + inverteCaracteres(palavra,posicao+1,tamanhoString);
      return inversa;
  }
}
