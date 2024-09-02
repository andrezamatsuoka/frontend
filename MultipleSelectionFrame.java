
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; // lista para conter nomes de cores
   private final JList<String> copyJList; // lista para armazenar nomes copiados
   private final JList<String> copyJList2; // cópia 3 do JList

   private JButton copyJButton; // botão para copiar nomes selecionados
   private JButton copyJButton2; // cópia 2 do JButton
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   // Construtor MultipleSelectionFrame
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames); // lista de nomes de cores
      colorJList.setVisibleRowCount(5); // mostra cinco linhas
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); // adiciona lista com scrollpane

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() // classe interna anônima
         {  
            // lida com evento de botão
            @Override
            public void actionPerformed(ActionEvent event)
            {
               // coloca os valores selecionados em copyJList
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); // adiciona botão de cópia ao JFrame

      copyJList = new JList<String>(); // lista para armazenar nomes de cores copiados
      copyJList.setVisibleRowCount(5); // mostrar 5 linhas
      copyJList.setFixedCellWidth(100); // define a largura
      copyJList.setFixedCellHeight(15); // define a altura
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList)); // adiciona lista com scrollpane



      copyJButton2 = new JButton("Copy >>>"); 
      copyJButton2.addActionListener(
         new ActionListener() // classe interna anônima
         {  
            // lida com evento de botão
            @Override
            public void actionPerformed(ActionEvent event)
            {
               // coloca os valores selecionados em copyJList
               copyJList2.setListData(
                  copyJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton2); // adiciona botão de cópia ao JFrame

      copyJList2 = new JList<String>(); // lista para armazenar nomes de cores copiados
      copyJList2.setVisibleRowCount(5); // mostrar 5 linhas
      copyJList2.setFixedCellWidth(100); // define a largura
      copyJList2.setFixedCellHeight(15); // define a altura
      copyJList2.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList2)); // adiciona lista com scrollpane

      
   } 
} // fim da classe MultipleSelectionFrame

