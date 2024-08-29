// Fig. 12.19: RadioButtonFrame.java
// Criando botões de opção usando ButtonGroup e JRadioButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonFrame extends JFrame // declaração da classe (que tem o mesmo nome do arquivo) que herda do JFrame
{
   private JTextField textField; // usado para exibir alterações de fonte (campo imput - para inserir texto)

   private Font plainFont; // fonte para texto simples (4 fontes de texto)
   private Font boldFont; // fonte para texto em negrito
   private Font italicFont; // fonte para texto em itálico
   private Font boldItalicFont; // fonte para texto em negrito e itálico 

   private Color blueColor; 
   private Color redColor; 
   private Color yellowColor; 
   private Color blackColor;
 
   private JRadioButton plainJRadioButton; // seleciona texto simples (4 botões de grupo)
   private JRadioButton boldJRadioButton; // seleciona texto em negrito
   private JRadioButton italicJRadioButton; // seleciona texto em itálico
   private JRadioButton boldItalicJRadioButton; // negrito e itálico
   private ButtonGroup radioGroup; // grupo de botões para segurar botões de opção 

   private JRadioButton blueJRadioButton; 
   private JRadioButton redJRadioButton; 
   private JRadioButton yellowJRadioButton; 
   private JRadioButton blackJRadioButton; 
   private ButtonGroup colorRadioGroup; 
   // 

   // O construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
   public RadioButtonFrame() //declaração do construtor (que tem o mesmo nome do arquivo e da classe)
   {
      super("RadioButton Test");
      setLayout(new FlowLayout()); 

      textField = new JTextField("Watch the font style change", 25);
      add(textField); // adiciona textField ao JFrame

      // create radio buttons
      plainJRadioButton = new JRadioButton("Plain", true);
      boldJRadioButton = new JRadioButton("Bold", false);
      italicJRadioButton = new JRadioButton("Italic", false);
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
      add(plainJRadioButton); // adiciona botão simples ao JFrame
      add(boldJRadioButton); // adiciona botão de negrito ao JFrame
      add(italicJRadioButton); // adiciona botão de italico ao JFrame
      add(boldItalicJRadioButton); // adiciona botão de negrito e italico ao JFrame

      // criar relacionamento lógico entre JRadioButtons (não deixa que mais de 1 seja selecionado)
      radioGroup = new ButtonGroup(); // cria ButtonGroup
      radioGroup.add(plainJRadioButton); // adiciona simples ao grupo
      radioGroup.add(boldJRadioButton); // adiciona negrito ao grupo
      radioGroup.add(italicJRadioButton); // adiciona italico ao grupo
      radioGroup.add(boldItalicJRadioButton); // adiciona negrito e italico ao grupo


      blueJRadioButton = new JRadioButton("Blue", false);
      redJRadioButton = new JRadioButton("Red", false);
      yellowJRadioButton = new JRadioButton("Yellow", false);
      blackJRadioButton = new JRadioButton("Black", true);
      add(blueJRadioButton); 
      add(redJRadioButton); 
      add(yellowJRadioButton); 
      add(blackJRadioButton); 
     
      colorRadioGroup = new ButtonGroup(); 
      colorRadioGroup.add(blueJRadioButton); 
      colorRadioGroup.add(redJRadioButton); 
      colorRadioGroup.add(yellowJRadioButton); 
      colorRadioGroup.add(blackJRadioButton);

      // cria objetos de fonte
      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont);

      blueColor = new Color(0,0,255);
      redColor = new Color(255,0,0);
      yellowColor = new Color(255,255,0);
      blackColor = new Color(0,0,0);
     
      // registra eventos para JRadioButtons
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));

      blueJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blueColor));
      redJRadioButton.addItemListener(
         new ColorRadioButtonHandler(redColor));
      yellowJRadioButton.addItemListener(
         new ColorRadioButtonHandler(yellowColor));
      blackJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blackColor));
   } 

   // classe interna privada para lidar com eventos de botão de opção
   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; // fonte associada a este ouvinte

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 

      // lida com eventos de botão de opção
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 

   private class ColorRadioButtonHandler implements ItemListener 
   {
      private Color color; 

      public ColorRadioButtonHandler(Color c)
      {
         color = c; 
      } 
   
      // lida com eventos de botão de opção
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setForeground(color); 
      } 
   } 
} // fim da classe RadioButtonFrame 

