import javax.swing.*;
import java.lang.classfile.instruction.SwitchCase;

public class Main {
    private static int menu(){
        String txt = "1) Mostrar Saldo  \n";
        txt += "\n2) Depositar  \n";
        txt += "\n3) Sacar  \n";
        txt += "\n0) Sair  \n\n";
        txt += "Digite sua opção:";
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static void main(String[] args){
        String txt = "Qual tipo de cliente? \n1) Físico \n2) - Jurídico)";
        int tipoCliente = Integer.parseInt(JOptionPane.showInputDialog(txt));
        Cliente client = null;
        String nome = JOptionPane.showInputDialog("Nome do cliente: ");
        if (tipoCliente == 1) {
            String cpf = JOptionPane.showInputDialog("CPF:");
            client = new Fisico(nome, cpf);
        }   else {
                String cnpj = JOptionPane.showInputDialog("CNPJ:");
                client = new Fisico(nome, cnpj);
        }



        Conta c1 = new Conta();
        c1.titular = client;

        int op = -1;

        while (op != 0){
            switch (op){
                case 1:
                    String msg = "Saldo: " + c1.getSaldo();
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 2:
                    String sValorD = "Valor a depositar: ";
                    c1.depositar(Double.parseDouble(sValorD));
                    break;
                case 3:
                    String sValorS = "Valor a depositar: ";
                    c1.sacar(Double.parseDouble(sValorS));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema, até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    break;

            }
        }
    }
}
