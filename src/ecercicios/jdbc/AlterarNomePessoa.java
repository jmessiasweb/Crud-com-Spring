package ecercicios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o codigo da pessoa: ");
        int codigo = entrada.nextInt();

        String select = "SELECT * FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stm = conexao.prepareStatement(select);
        stm.setInt(1, codigo);
        ResultSet r = stm.executeQuery();

        if (r.next()) {
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

            System.out.println("O nome atual e  " + p.getNome());
            entrada.nextLine();

            System.out.printf("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            stm.close();
            stm = conexao.prepareStatement(update);
            stm.setString(1, novoNome);
            stm.setInt(2, codigo);
            stm.execute();

            System.out.println("Pessoa alterada com sucesso! ");
        } else {
            System.out.println("Pessoa nao encontrda!");
        }


        conexao.close();
        entrada.close();


    }
}
