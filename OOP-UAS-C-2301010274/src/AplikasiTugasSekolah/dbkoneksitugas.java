package AplikasiTugasSekolah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Arlya Dewi
 * Tgl 28/06/2025
 */
public class dbkoneksitugas {
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost/tugas_sekolah"; // ganti sesuai DB kamu
    static String DB_USER = "root";
    static String DB_PASS = "";

    public static Connection koneksi() {
        try {
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Gagal koneksi ke database: " + e.getMessage());
        }
        return null;
    }
}
