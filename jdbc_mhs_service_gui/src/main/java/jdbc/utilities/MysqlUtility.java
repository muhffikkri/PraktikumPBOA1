/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 * File : MysqlUtility.java
 * Deskripsi : Kelas untuk koneksi ke database mysql
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/jdbc_mhs?serverTimezone=UTC";
                String user = "root";
                String password = "Ciganjur123f*";

                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi berhasil");
            } catch (ClassNotFoundException e) {
                System.out.println("Gagal load driver: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Gagal koneksi: " + e.getMessage());
            }
        }

        return koneksi;
    }
}