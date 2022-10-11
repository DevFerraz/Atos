package ConexaoComBancoDeDados;
import Heranca.Pessoa;
import java.sql.*;


public class Principal {
    public static void main(String[] args) {
        final String db_url = "jdbc:mysql://localhost:3306/agenda";
        final String db_query = "SELECT * FROM pessoa";
        final String db_user = "root";
        final String db_password = "";
        Pessoa[] p;
        int resultSetRows = 0;
        System.out.println("Iniciando conexão com o Banco de Dados");
        try (Connection c = DriverManager.getConnection(db_url, db_user, db_password);
        Statement statement = c.createStatement();
        ResultSet resultSet = statement.executeQuery(db_query)){
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
            }

        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
