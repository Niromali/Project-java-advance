package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDatabase {

	private static void testAjouterProduit() {
		// TODO Auto-generated method stub
		Connection conn = null;
       
		try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
		   // Create the SQL statement with parameters
	            String sql = "INSERT INTO produit VALUES ('r1','d1',20,50)";
	            Statement pstmt=conn.createStatement();
	            

	            // Execute the SQL statement
	            int rows = pstmt.executeUpdate(sql);

	            // Print the number of rows affected
	            System.out.println(rows + " rows affected");
		} catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
               
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testAjouterProduit();
		//testDeleteProduit();
		//testModifierProduit();
		//testSelectWhereReference();
		//testSelectAll();
		testSelectMax();
	}
	
	private static void testSelectMax() {
		// TODO Auto-generated method stub

		Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
        String sql = "SELECT MAX(prix) as prix FROM produit";
        Statement pstmt = conn.createStatement();
        ResultSet rs = pstmt.executeQuery(sql);
        if (rs.next()) {
            double prix = rs.getDouble("prix");
            System.out.println("Prix Max  : " + prix);
        }
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
	}
	private static void testSelectAll() {
		// TODO Auto-generated method stub

		Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
        String sql = "SELECT * FROM produit";
        Statement pstmt = conn.createStatement();
        ResultSet rs = pstmt.executeQuery(sql);
        while (rs.next()) {
            String ref = rs.getString("reference");
            String desig = rs.getString("designation");
            double prix = rs.getDouble("prix");
            int quantite = rs.getInt("quantite");
            System.out.println("Produit trouvé : " + "Reference"+ref + " - " + "Designation"+desig + " - " + prix + " - " + quantite);
        }
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
	}
	private static void testSelectWhereReference() {

		Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
        String sql = "SELECT * FROM produit WHERE reference = 'r2'";
        Statement pstmt = conn.createStatement();
        ResultSet rs = pstmt.executeQuery(sql);
        if (rs.next()) {
            String ref = rs.getString("reference");
            String desig = rs.getString("designation");
            double prix = rs.getDouble("prix");
            int quantite = rs.getInt("quantite");
            System.out.println("Produit trouvé : " + "Reference"+ref + " - " + "Designation"+desig + " - " + prix + " - " + quantite);
        }
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    }
	private static void testModifierProduit() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				Connection conn = null;
		       
				try {
				      Class.forName("com.mysql.cj.jdbc.Driver");
				      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
				   // Create the SQL statement with parameters
			            String sql = "UPDATE `produit` SET `designation`='dx',`prix`=100,`quantite`=15 WHERE reference = 'r2'";
			            Statement pstmt=conn.createStatement();
			            

			            // Execute the SQL statement
			            int rows = pstmt.executeUpdate(sql);

			            // Print the number of rows affected
			            System.out.println(rows + " rows affected");
				} catch (Exception e) {
		            System.err.println("Error: " + e.getMessage());
		        } finally {
		            try {
		               
		                if (conn != null) {
		                    conn.close();
		                }
		            } catch (Exception e) {
		                System.err.println("Error: " + e.getMessage());
		            }
		        }
	}
	private static void testDeleteProduit() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Connection conn = null;
       
		try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
		   // Create the SQL statement with parameters
	            String sql = "DELETE FROM produit WHERE reference = 'r1'";
	            Statement pstmt=conn.createStatement();
	            

	            // Execute the SQL statement
	            int rows = pstmt.executeUpdate(sql);

	            // Print the number of rows affected
	            System.out.println(rows + " rows affected");
		} catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
               
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
	
	}

}
