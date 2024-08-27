import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.font.*;
import java.util.*;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{
   private final JTextField textField; // exibe texto em mudança de fontes
   private final JCheckBox boldJCheckBox; // para selecionar/desmarcar negrito
   private final JCheckBox italicJCheckBox; // para selecionar/desmarcar itálico
   private final JCheckBox underlineJCheckBox;

   // O construtor CheckBoxFrame adiciona JCheckBoxes ao JFrame
   public CheckBoxFrame()
   {
      super("JCheckBox Test");
      setLayout(new FlowLayout());

      // configura JTextField e defina sua fonte
      textField = new JTextField("Watch the font style change", 20);
      textField.setFont(new Font("Serif", Font.PLAIN, 14));
      add(textField); // adiciona textField ao JFrame

      boldJCheckBox = new JCheckBox("Bold"); 
      italicJCheckBox = new JCheckBox("Italic"); 
      underlineJCheckBox = new JCheckBox("Underline"); 
      add(boldJCheckBox); // adiciona caixa de seleção em negrito ao JFrame
      add(italicJCheckBox); // adiciona caixa de seleção em itálico ao JFrame
      add(underlineJCheckBox);

      // registra ouvintes para JCheckBoxes
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener(handler);
      italicJCheckBox.addItemListener(handler);
      underlineJCheckBox.addItemListener(handler);
   } 

   // classe interna privada para manipulação de eventos ItemListener
   private class CheckBoxHandler implements ItemListener 
   {
      // responder a eventos de caixa de seleção
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         Font font = null; // armazena a nova fonte

         // determina quais CheckBoxes estão marcadas e criar Font
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
         else
            font = new Font("Serif", Font.PLAIN, 14);
         
         textField.setFont(font); 

         if (underlineJCheckBox.isSelected()) {
            font = textField.getFont();
            Map atributes = font.getAttributes();
            atributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            textField.setFont(font.deriveFont(atributes));
            font = new Font(atributes);
         }      
      } 
   }
} // final da classe CheckBoxFrame

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
