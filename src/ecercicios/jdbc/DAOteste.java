package ecercicios.jdbc;

public class DAOteste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERTO INTO pessoas (nome) VALUES (?)";
        dao.incluir(sql, "Joao da Silva");
        dao.incluir(sql, "Ana Julia");
        dao.incluir(sql, "Djalma Pereira");

        dao.close();
    }
}
