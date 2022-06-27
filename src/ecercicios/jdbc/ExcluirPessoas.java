package ecercicios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        int codigo = entrada.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELET FROM pessoas WHERE codigo = ?";

        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, codigo);

        int contador = stm.executeUpdate();

        if(contador > 0) {
            System.out.println("Pessoa excluida com sucesso");
        }else {
            System.out.println("Nada feito!");
        }

        System.out.println("Linhas afetada: " + contador);

        conexao.close();
        entrada.close();
    }
}
