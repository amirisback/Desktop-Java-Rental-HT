/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;


public class koneksi {
    //Deklarasi data path hasil program ----------------------------------------
    private String Folder_Data = "C:/AccomHT/";
    //--------------------------------------------------------------------------
    
    
    //Deklarasi operasi CRUD Database-------------------------------------------
    private PreparedStatement preStatement;
    private Statement statement;
    private Connection connect;
    private ResultSet resultSet;
    //--------------------------------------------------------------------------
    
    //Koneksi SQLite------------------------------------------------------------
    private String driver = "com.mysql.jdbc.Driver";
    private String Nama_database = "DataBaseHT.db";
    private String url = Folder_Data + Nama_database;
    private String url_db = "jdbc:sqlite:" + url;
    private String sql_table_data;
    private String sql_table_admin;
    private String sql_admin;
    //--------------------------------------------------------------------------

    public String getFolder_Data() {
        return Folder_Data;
    }

    public void setFolder_Data(String Folder_Data) {
        this.Folder_Data = Folder_Data;
    }

    public PreparedStatement getPreStatement() {
        return preStatement;
    }

    public void setPreStatement(PreparedStatement preStatement) {
        this.preStatement = preStatement;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Connection getConnect() {
        return connect;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getNama_database() {
        return Nama_database;
    }

    public void setNama_database(String Nama_database) {
        this.Nama_database = Nama_database;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_db() {
        return url_db;
    }

    public void setUrl_db(String url_db) {
        this.url_db = url_db;
    }

    public String getSql_table_data() {
        return sql_table_data;
    }

    public void setSql_table_data(String sql_table_data) {
        this.sql_table_data = sql_table_data;
    }

    public void ConnectToDB() {
        try {
            File folder = new File(Folder_Data);
            if (!folder.exists()) {
                folder.mkdir();
            }
            connect = DriverManager.getConnection(url_db);
            DatabaseMetaData meta = connect.getMetaData();
        } catch (Exception e) {
        }   
    }
    
    public void createAllTable() {
        try {
            sql_table_admin = "CREATE TABLE user (\n"
                    + "    username VARCHAR (20) PRIMARY KEY,\n"
                    + "    password VARCHAR (20) \n"
                    + ");";

            sql_table_data = "CREATE TABLE data_peminjaman (\n"
                    + "    id_peminjam VARCHAR (20) PRIMARY KEY,\n"
                    + "    nama        VARCHAR (25),\n"
                    + "    noktp       INTEGER (20),\n"
                    + "    alamat      VARCHAR (25),\n"
                    + "    nohp        INTEGER (13),\n"
                    + "    lamasewa    INTEGER (3),\n"
                    + "    mulaisewa   VARCHAR (25),\n"
                    + "    tanggal     VARCHAR (25),\n"
                    + "    banyakht    INTEGER (3),\n"
                    + "    dp          VARCHAR (25) \n"
                    + ");";
            statement = connect.createStatement();
            //Create Table data
            statement.execute(sql_table_admin);
            statement.execute(sql_table_data);
        } catch (SQLException e) {
        }

    }

    public void data_admin() {
        sql_admin = "INSERT INTO user (username, password) VALUES ('admin','admin') ";
        try {
            statement = connect.createStatement();
            statement.execute(sql_admin);
        } catch (Exception e) {
        }
    }
    

}

