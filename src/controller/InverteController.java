package controller;

public class InverteController{
  public InverteController{
    super();
  }

  public String inverteCaracteres(String palavra, int posicao){
    String inversa = "";
    int tamanhoString = palavra.length();
    if(posicao == tamanhoString){
      return palavra.substring(posicao,posicao);
    }else{
      inversa = inverteCaracteres(palavra,posicao+1);
      inversa = inversa + palavra.substring(posicao,posicao);
      return inversa;
  }
}
