package Calculadora1;
import javax.swing.JOptionPane;
public class Calculadora2 {

    public static void main(String[] args) {
        int Opcion;
        Opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "---Menu---"
                + "\n1.Suma \n2.Multiplicacion"
                + "\n3 .Salir"));
        JOptionPane.showMessageDialog(null,"Tu opcion es: "+ Opcion);
    }
}
