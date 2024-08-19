import java.awt.*; //carrega todos os componentes 
// import javax.swing.JFrame; //providencia as características básicas da janela
// import javax.swing.JLabel; //exibe testos e imagens
// import javax.swing.SwingConstants; //constantes comuns usadas com Swing
// import javax.swing.Icon; //interface usada para manipular imagens
// import javax.swing.ImageIcon; //carrega imagens
import javax.swing.*; //carrega todos os componentes do módulo swing da biblioteca javax

public class LabelFrame extends JFrame //declaração de classe e recebimento da "herança" de JFrame
{
   private final JLabel label1; //JLabel com apenas texto
   private final JLabel label2; //JLabel construído com texto e ícone
   private final JLabel label3; //JLabel com texto e ícone adicionados
   //criação da variável label1, do tipo JLabel, para ser usada somente dentro da classe LabelFrame -private-, e somente para leitura -final-

   public LabelFrame() //no java, quando se tem o mesmo nome da classe e do arquivo, é um método construtor
   {
      super("Testing JLabel"); //define o título da janela na parte superior (só pode ser declarado se for herdado do JFrame)
      setLayout(new FlowLayout()); // define o layout (sempre que tem um "new", é a criação de um objeto)
   
      label1 = new JLabel("Label with text"); //declaração de variável que atribui (=) o objeto JLabel
      label1.setToolTipText("This is label1"); //declaração de variável que define o texto com ferramenta de dica (setToolTipText)
      add(label1); // adiciona label1 ao JFrame

      Icon bug = new ImageIcon(getClass().getResource("bug1.png")); //declaração de variável do tipo icon com o parâmetro getClass que invoca (.) o método getResource (pega o recurso "bug1.png")
      label2 = new JLabel("Label with text and icon", bug, //atribuição de valor à variável
         SwingConstants.LEFT); //forma "humanizada" de definir o alinhamento
      label2.setToolTipText("This is label2"); //invoca o texto de ferramenta de dicas
      add(label2); // adiciona label2 ao JFrame

      label3 = new JLabel(); // declaração de variável - construtor JLabel sem argumentos
      label3.setText("Label with icon and text at bottom"); //invoca o texto
      label3.setIcon(bug); // invoca o icon 
      label3.setHorizontalTextPosition(SwingConstants.CENTER); //define a posição horizontal do texto
      label3.setVerticalTextPosition(SwingConstants.BOTTOM); //define a posição vertical do texto
      label3.setToolTipText("This is label3"); //define o texto de ferrametas de dicas
      add(label3); // adiciona label3 ao JFrame
   } 
} // end class LabelFrame


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
