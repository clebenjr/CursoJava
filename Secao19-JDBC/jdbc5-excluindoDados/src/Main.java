import db.DB;
import db.DbIntegrityException;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?");
            st.setInt(1, 2);


            int linhasAlteradas = st.executeUpdate();

            System.out.println("Feito! Linhas alteradas: " + linhasAlteradas);


        }
        catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}