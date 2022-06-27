package ecercicios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome");
        String nome = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO pessoa(nome) VALUES (?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, nome);

        stm.execute();

        System.out.println("Pessoa incluida com sucesso!");
        entrada.close();
    }
}
