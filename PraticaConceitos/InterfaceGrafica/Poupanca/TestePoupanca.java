package InterfaceGrafica.Poupanca;
import javax.swing.*;

public class TestePoupanca {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca();

        try{
            poupanca.setCapitalInicial(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O CAPITAL INICIAL: ")));
            poupanca.setTaxaJurosMesal(Double.parseDouble(JOptionPane.showInputDialog("DIGITE A TAXA DE JUROS MENSAL: ")));
            poupanca.setQuantMeses(Integer.parseInt(JOptionPane.showInputDialog("DIGITE O PERIODO DE MESES APLICADOS: ")));

            JOptionPane.showMessageDialog(null, poupanca.retornaInvestimento());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Processo Finalizado");
        }
    }
}
