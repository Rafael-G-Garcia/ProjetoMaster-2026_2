import javax.swing.*;

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
        String txt = "Qual tipo de cliente? \n1) Físico \n2) Jurídico";
        int tipoCliente = Integer.parseInt(JOptionPane.showInputDialog(txt));
        Cliente client = null;
        if (tipoCliente == 1) {
            client = new Fisico();
        }   else {
                client = new Juridico();
        }
        client.cadastrar();

        txt = "Qual tipo de conta? \n1) Poupança \n2) Corrente";
        int tipoConta = Integer.parseInt(JOptionPane.showInputDialog(txt));

        Conta c1 = null;
        if (tipoConta == 1){
            c1 = new Poupanca();
        } else {
            c1 = new Corrente();
        }
        c1.titular = client;

        int op = -1;

        while (op != 0){
            op = menu();
            switch (op){
                case 1:
                    String msg = "Saldo: " + c1.getSaldo();
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 2:
                    String sValorD = JOptionPane.showInputDialog("Valor a depositar: ");
                    c1.depositar(Double.parseDouble(sValorD));
                    break;
                case 3:
                    String sValorS = JOptionPane.showInputDialog("Valor a sacar: ");
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
