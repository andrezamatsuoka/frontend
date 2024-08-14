import javax.swing.JOptionPane; // comando (inicia com letra minúscula) que faz a importação de toda a biblioteca javax(biblioteca visual) que invoca(.) o módulo(swing) que invoca (.) o componente(JOptionPane)

public class Addition // Cria/exporta/declara a classe (começa com letra maiúscula) Addition
{ //convenção sms script1 (não escreve o código na mesma linha da abertura de chave)
   public static void main(String[] args) // Declara o método main, sem retorno (void), somente leitura (static), exportado nos parâmetros(args) do tipo matriz de string
   {
      String firstNumber = // declaração de variável (colocar o tipo, depois o nome da variável) e atribui-se um valor a ela (=)
         JOptionPane.showInputDialog("Enter first integer"); //  o componente (JOptionPane) invoca (.) o método (showInputDialog) - o que está entre "texto", será impresso na tela
      String secondNumber =
         JOptionPane.showInputDialog("Enter second integer");

      int number1 = Integer.parseInt(firstNumber); //declaração de variável (tipo, nome), atribui-se valor a ela (=). o método (parseInt - analisa número inteiro) invoca (.) o componente (Integer) que converte o parâmetro ()
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // declaração de variável que vai receber a soma dos números 

      
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE); 
         // o componente (JOptionPane) invoca (.) o método (showInputDialog). 
         //"The sum is " é uma string, e qualquer coisa que concatenar(+) com ela (sum), automaticamente já será convertida em string
         // (PLAIN_MESSAGE) - deixa a mensagem plana - está em scream case, somente para leitura e não pode ser alterada
   } 
} 