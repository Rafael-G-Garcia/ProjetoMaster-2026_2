import javax.swing.*;

public class Juridico extends Cliente{
    public String cnpj;

    public Juridico(){
        super();
    }

    @Override
    public void cadastrar() {
        this.nome = JOptionPane.showInputDialog("Nome do cliente jurídico: ");
        this.cnpj = JOptionPane.showInputDialog("CNPJ:");
        this.fone = JOptionPane.showInputDialog("Telefone: ");
    }

    public Juridico(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
        this.fone = fone;
    }
}
