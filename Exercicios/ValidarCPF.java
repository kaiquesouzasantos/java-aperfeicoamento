import javax.swing.*;

public class ValidarCPF {
    public static void main(String[] args) {
        String strCpf = JOptionPane.showInputDialog(null, "Digite o CPF que sera validado: ");

        if(!CPF(strCpf)){
            JOptionPane.showMessageDialog(null, "CPF INVALIDO!");
        }else {
            JOptionPane.showMessageDialog(null, "CPF VALIDO!");
        }
    }

    public static boolean CPF(String strCpf ) {
        int d1 = 0, d2 = 0, digito_01, digito_02, resto, digitoCPF;
        String ultimosDigitos;

        if(strCpf.length() < 11 || strCpf.length() > 14) return false;
        strCpf = strCpf.replace(".", "");
        strCpf = strCpf.replace("-", "");

        for (int k = 1; k < strCpf.length() - 1; k++) {
            digitoCPF = Integer.parseInt(strCpf.substring(k - 1, k));

            d1 += (11 - k) * digitoCPF;
            d2 += (12 - k) * digitoCPF;
        }

        resto = (d1 % 11);

        if (resto < 2){
            digito_01 = 0;
        }else{
            digito_01 = 11 - resto;
        }

        d2 += 2 * digito_01;
        resto = (d2 % 11);

        if (resto < 2){
            digito_02 = 0;
        }else {
            digito_02 = 11 - resto;
        }

        String verificacaoUltimosDigitos = strCpf.substring(strCpf.length() - 2);
        ultimosDigitos = ""+digito_01+""+digito_02;
        return verificacaoUltimosDigitos.equals(ultimosDigitos);
    }
}
