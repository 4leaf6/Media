import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Media {

    public static void main (String args [ ]){
        int a;
        float VetSoma [], soma = 0, media = 0;
        VetSoma = new float [50];

        for (a = 0; a <= 49; a++){
            VetSoma[a] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor real"));
            soma = soma + VetSoma[a];
        }
        media = soma / 50;
        JFrame parent = new JFrame();

        JOptionPane.showMessageDialog(parent, "A média é " + media);
        System.exit(0);
    }

}
