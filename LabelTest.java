// Fig. 12.7: LabelTest.java
// Testing LabelFrame.
import javax.swing.JFrame; //importação da biblioteca

public class LabelTest //criação da classe
{ //início do bloco da classe
   public static void main(String[] args) //criação do método
   { //início do bloco de métodos
      LabelFrame labelFrame = new LabelFrame(); 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o comando de sair e fechar
      labelFrame.setSize(360, 280); //define o tamanho da tela
      labelFrame.setVisible(true); //faz a tela se tornar visível
   } //encerramento do bloco de métodos
} //encerramento do bloco da classe

// end class LabelTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
