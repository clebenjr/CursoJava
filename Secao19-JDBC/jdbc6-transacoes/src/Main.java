import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int linhas1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            //int x = 1;
            //if (x < 2){
            //    throw new SQLException("Fake error");
            //}

            int linhas2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("Linhas 1 = " + linhas1);
            System.out.println("Linhas 2 = " + linhas2);
        }
        catch (SQLException e){
            try{
                conn.rollback();
                throw new DbException("Transacao nao realizada! Causa: " + e.getMessage());
            }
            catch (SQLException e1) {
                throw new DbException("erro tentando fazer o rollback! causa: " + e1.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}