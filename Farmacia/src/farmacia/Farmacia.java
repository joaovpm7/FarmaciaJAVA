package farmacia;

import javax.swing.JOptionPane;

public class Farmacia {

    public static void main(String[] args) {
        Carrinho c = new Carrinho();

        //Cadastrando medicamentos
        c.inserirMedicamento();
        c.inserirMedicamento();
        c.inserirMedicamento();

        //Pesquisar medicamento
        int i = c.pesquisarMedicamento("Dipirona");
        System.out.println(i);
        c.med[i].exibirMedicamento();
        
        //Alterar medicamento
        c.alterarMedicamento();
        c.med[i].exibirMedicamento();

        //Excluir medicamento
        c.excluirMedicamento();
        
        i = c.pesquisarMedicamento("Dipirona");
        System.out.println(i);

    }
}
