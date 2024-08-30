import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame 
{
   private final JComboBox<String> imagesJComboBox; // retem nomes de ícones
   private final JLabel label; // exibe o ícone selecionado

   private static final String[] names = 
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif", "icon-bug.png"};
   private final Icon[] icons = { 
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3])),
      new ImageIcon(getClass().getResource(names[4]))};

   // O construtor ComboBoxFrame adiciona JComboBox ao JFrame
   public ComboBoxFrame()
   {
      super("Testing JComboBox"); //título superior
      setLayout(new FlowLayout()); // definir o layout do quadro (FlowLayout é responsivo)

      imagesJComboBox = new JComboBox<String>(names); // configura o JComboBox
      imagesJComboBox.setMaximumRowCount(2); // exibe duas linhas

      imagesJComboBox.addItemListener(
         new ItemListener() // classe interna anônima
         {
            // lida com evento JComboBox
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // determina se o item foi selecionado
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         } // encerra classe interna anônima
      ); //encerra chamada para addItemListener

      add(imagesJComboBox); // adiciona caixa de combinação ao JFrame
      label = new JLabel(icons[0]); // exibe o primeiro ícone
      add(label); // adiciona rótulo ao JFrame
      setSize(350, 350); 
      setVisible(true); 
   }
} // fim da classe ComboBoxFrame

