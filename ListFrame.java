import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListFrame extends JFrame 
{
   private final JList<String> colorJList; // lista para exibir cores
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow"};
   private static final Color[] colors = {Color.BLACK, Color.BLUE,
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW};

   private final JList<String> sizeJList; // lista para exibir tamanhos
   private static final String[] sizeNames = {"Small", "Medium", "Big"};

   // Construtor ListFrame adiciona JScrollPane contendo JList a JFrame
   public ListFrame()
   {
      super("List Test");
      setLayout(new FlowLayout()); 

      colorJList = new JList<String>(colorNames); // lista de colorNames
      colorJList.setVisibleRowCount(5); // exibe cinco linhas de uma vez
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //modo único (não é possível selecionar mais de 1 opção ao mesmo tempo)
      // adiciona um JScrollPane contendo JList ao quadro
      add(new JScrollPane(colorJList));

      sizeJList = new JList<String>(sizeNames); // lista de sizeNames
      sizeJList.setVisibleRowCount(5); // exibe cinco linhas de uma vez
      sizeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      add(new JScrollPane(sizeJList));

      colorJList.addListSelectionListener(
         new ListSelectionListener() // classe interna anônima
         {   
            // lida com eventos de seleção de lista
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
               getContentPane().setBackground(
                  colors[colorJList.getSelectedIndex()]);
            } 
         } 
      ); 

      sizeJList.addListSelectionListener(
         new ListSelectionListener() // classe interna anônima
         {   
            // lida com eventos de seleção de lista
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
               switch (sizeJList.getSelectedIndex()) {
                  case 0:
                     setSize(350, 150); //opção de tamanho pequeno
                     break;

                  case 1:
                     setSize(550, 350); //opção de tamanho médio
                     break;

                  case 2:
                     setSize(750, 550); //opção de tamanho grande
                     break;
                                
                  default:
                  setSize(350, 150);
                     break;
               }
            } 
         } 
      ); 
   } 
} // fim da classe ListFrame
