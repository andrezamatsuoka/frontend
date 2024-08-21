import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldFrame extends JFrame 
{
   private final JTextField textField1; // campo de texto com tamanho definido
   private final JTextField textField2; // campo de texto com texto
   private final JTextField textField3; // campo de texto com texto e tamanho
   private final JPasswordField passwordField; // campo de senha com texto

   public TextFieldFrame() //O construtor TextFieldFrame adiciona JTextFields ao JFrame
   {
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout()); //FlowLayout é a forma responsiva do Java

          textField1 = new JTextField(10); //constrói campo de texto com 10 colunas
      add(textField1); // adiciona textField1 ao JFrame

          textField2 = new JTextField("Enter your text here now"); //é uma string, que construi campo de texto com texto padrão
      add(textField2); // adiciona textField2 ao JFrame

      textField3 = new JTextField("Uneditable text field", 21); //constrói campo de texto com texto padrão e 21 colunas
      textField3.setEditable(false); // desabilita edição - impede que o usuário edite
      add(textField3); // adiciona textField3 ao JFrame

      passwordField = new JPasswordField("Hidden text"); //constrói campo de senha com texto padrão "Hidden text" que não fica visível e não deixa copiar, para manter a segurança
      add(passwordField); // adiciona passwordField ao JFrame

      TextFieldHandler handler = new TextFieldHandler(); //registra manipuladores de eventos
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } //fim do construtor TextFieldFrame 

   // classe interna privada para manipulação de eventos
   private class TextFieldHandler implements ActionListener 
   {
      // processa eventos de campo de texto
      @Override
      public void actionPerformed(ActionEvent event)
      {
         String string = ""; 
         // usuário pressionou Enter em JTextField textField1
         if (event.getSource() == textField1) //(==) é operador de comparação e (if) = se
            string = String.format("textField1: %s", //(%s) é o formato de string
               event.getActionCommand()); //(event.getActionCommand) é o texto que está dentro do imput

         // usuário pressionou Enter em JTextField textField2
         else if (event.getSource() == textField2) //(else if) = então
            string = String.format("textField2: %s",
               event.getActionCommand());

         // usuário pressionou Enter em JTextField textField3
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         // usuário pressionou Enter em JTextField passwordField
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // exibir conteúdo JTextField
         JOptionPane.showMessageDialog(null, string); //mostra uma caixa de diálogo, sem definição do tipo de texto (null)
      } 
   } // fim da classe interna privada TextFieldHandler
} // fim da classe TextFieldFrame

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
