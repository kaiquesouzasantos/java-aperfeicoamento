package InterfaceGrafica.MediaNotas;
import javax.swing.*;
import java.text.DecimalFormat;

public class MediaNotas {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");
        double notas = 0;
        int contador = 0;
        String verificador;

        try{
            do{
                notas += Double.parseDouble(JOptionPane.showInputDialog("DIGITE A NOTA: "));
                verificador = JOptionPane.showInputDialog("DESEJA CONTINUAL[S/N]? ");
                contador+=1;
            }while(verificador.equalsIgnoreCase("sim") || verificador.equalsIgnoreCase("s"));

            JOptionPane.showMessageDialog(null, "MEDIA ARITMEDICA DAS NOTAS: "+df.format(notas/contador));
        }catch (Exception e){
            System.exit(0);
        }finally {
            System.out.println("Processo Finalizado");
        }
    }
}
