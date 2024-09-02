import javax.swing.*; //importação de todos os componentes (*) do módulo swing da biblioteca javax

public class MultipleSelectionTest
{
   public static void main(String[] args)
   { 
      MultipleSelectionFrame multipleSelectionFrame =
         new MultipleSelectionFrame(); 
      multipleSelectionFrame.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);
      multipleSelectionFrame.setSize(550, 150); 
      multipleSelectionFrame.setVisible(true); 
   } 
} // end class MultipleSelectionTest

