package ConexaoComBancoDeDados;
import java.sql.*;

public class Principal2 {
    public static void main(String[] args) {
        final String db_url = "jdbc:mysql://localhost:3306/agenda";
        final String db_query = "INSERT INTO pessoa(nome, email, cargo) values ('Letícia', 'leticia.cintra@hotmail.com', 'Aluna')";
        final String db_user = "root";
        final String db_password = "";

        System.out.println("Iniciando a conexão com o banco de dados... ");
        try {
            Connection c = DriverManager.getConnection(db_url, db_user, db_password);
            System.out.println("Conectado ao MySQL");
            Statement statement = c.createStatement();
            int linhas = statement.executeUpdate(db_query);
            System.out.println("A query afetou " + linhas + " linhas");
            statement.close();
            c.close();
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
