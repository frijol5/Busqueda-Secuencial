import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial();
        while (true){
            busquedaSecuencial.repaint();
            Thread.sleep(10);
            busquedaSecuencial.color = Integer.parseInt(JOptionPane.showInputDialog(null,"Escoja la pelota a pintar"));
        }


    }
}
