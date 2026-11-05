import javax.swing.*;

public class Fisico extends Cliente{
    public String cpf;

    public Fisico(){
        super();
    }

    public Fisico(String nome, String cpf, String fone) {
        super(nome);
        this.cpf = cpf;
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Cliente físico: \n" +
                super.toString() +
                "CPF: " + cpf;
    }

    @Override
    public void cadastrar() {
        this.nome = JOptionPane.showInputDialog("Nome do cliente físico: ");
        this.cpf = JOptionPane.showInputDialog("CPF:");
        this.fone = JOptionPane.showInputDialog("Telefone: ");
    }
}
