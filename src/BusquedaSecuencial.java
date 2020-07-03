import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BusquedaSecuencial extends JFrame {

    int x = 100;
    int color;

    public BusquedaSecuencial() {

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de pelotitas"));
        if (x > 8) {
            x = 8;
        }
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(true);
        color = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja la pelota a pintar"));
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        for (int x = 0; x < this.x; x++) {
            if (x == color - 1) {
                g.setColor(Color.green);
            } else {
                g.setColor(Color.red);
            }
            g.fillOval(40 + (40 * x), 180, 40, 40);
        }
    }


    public static void ejemplo1() {
        ArrayList<String> arrayList = new ArrayList<String>();
        int i = 0;
        while (true) {

            arrayList.add(JOptionPane.showInputDialog(null, "Ingrese un numero y si ya no quiere agregar más escriba salir"));
            if (arrayList.get(i).equals("salir")) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        int[] enteros = new int[arrayList.size()];
        for (int x = 0; x < arrayList.size(); x++) {
            enteros[x] = Integer.parseInt(arrayList.get(x));
            System.out.println(enteros[x]);
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que quiere buscar"));
        for (int x = 0; x < enteros.length; x++) {
            if (enteros[x] == valor) {
                JOptionPane.showMessageDialog(null, "Valor encontrado");
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, "Valor no encontrado");
    }

    public static void ejemplo2() {
        int[] arreglo = {1, 2, 3, 45, 63, 234};
        int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a buscar"));
        boolean encontrado = false;
        int x = 0;
        while (!encontrado && x < 6) {
            if (arreglo[x] == busqueda) {
                JOptionPane.showMessageDialog(null, "Valor encontrado");
                encontrado = true;
            }
            x++;
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Valor no encontrado");
        }

    }
}
