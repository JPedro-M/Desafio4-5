package desafio4.pkg5;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio45 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        String triangulo;
        
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do primeiro lado do triângulo?"));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do segundo lado do triângulo?"));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do terceiro lado do triângulo?"));
        
        if (lado1 < lado2+lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2) {
            if (lado1 == lado2 && lado1 == lado2) {
                triangulo = "equilátero";
            }else if (lado1 == lado2 && lado1 != lado3) {
                triangulo = "isóseceles";
            }else if (lado1 != lado2 && lado1 == lado3) {
                triangulo = "isóseceles";
            }else {
                triangulo = "escaleno";
            }
            JOptionPane.showMessageDialog(null, "O triângulo é "+triangulo);
        }else {
            JOptionPane.showMessageDialog(null, "Isso não é um triângulo");
        }
    } 
}
