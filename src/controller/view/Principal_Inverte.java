package view;

import controller.InverteController;

public class Principal_Inverte{
  public static void main (String []args){
    InverteController cMet = new InverteController();
    String palavra = "alucard";

    System.out.println("O inverso de "+palavra+" é "+cMet.inverteCaracteres(palavra, 1));
  }
}
