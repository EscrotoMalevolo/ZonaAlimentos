package alimentos.model;

import alimentos.controller.clasesAlimentos.Carnicos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import alimentos.controller.clasesAlimentos.Frutas;
import alimentos.controller.clasesAlimentos.Vegetales;
import java.util.List;
public class Db {
    
    private Connection getConnection() throws SQLException {
        try {
            // Cargar el driver JDBC explícitamente
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found", e);
        }

        String url = "jdbc:mysql://localhost:3306/test"; // Ajusta según tu base de datos
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }

    
    public void guardarFruta(Frutas fruta) throws SQLException {
        String insertFrutaSQL = "INSERT INTO frutas (nombre, tamaño, precio) VALUES (?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement frutaStmt = connection.prepareStatement(insertFrutaSQL)) {
            frutaStmt.setString(1, fruta.getName());
            frutaStmt.setString(2, fruta.getTamaño());
            frutaStmt.setDouble(3, fruta.getPrecio());
            frutaStmt.executeUpdate();
        }
    }
    
    public List<Frutas> obtenerFrutas() throws SQLException {
        List<Frutas> frutasList = new ArrayList<>();
        String selectFrutasSQL = "SELECT nombre, tamaño, precio FROM frutas";

        try (Connection connection = getConnection();
             PreparedStatement frutaStmt = connection.prepareStatement(selectFrutasSQL);
             ResultSet resultSet = frutaStmt.executeQuery()) {

            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String tamaño = resultSet.getString("tamaño");
                double precio = resultSet.getDouble("precio");

                Frutas fruta = new Frutas(nombre, tamaño, precio);
                frutasList.add(fruta);
            }
        }

        return frutasList;
    }

    
    public void guardarVerdura(Vegetales vegetal) throws SQLException {
    String insertVerduraSQL = "INSERT INTO vegetales (nombre, tamaño, precio) VALUES (?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement vegetalStmt = connection.prepareStatement(insertVerduraSQL)) {
            vegetalStmt.setString(1, vegetal.getName());
            vegetalStmt.setString(2, vegetal.getTamaño());
            vegetalStmt.setDouble(3, vegetal.getPrecio());
            vegetalStmt.executeUpdate();
        }
    }

    public List<Vegetales> obtenerVegetales() throws SQLException {
        List<Vegetales> vegetalesList = new ArrayList<>();
        String selectVegetalesSQL = "SELECT nombre, tamaño, precio FROM vegetales";

        try (Connection connection = getConnection();
             PreparedStatement vegetalStmt = connection.prepareStatement(selectVegetalesSQL);
             ResultSet resultSet = vegetalStmt.executeQuery()) {

            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String tamaño = resultSet.getString("tamaño");
                double precio = resultSet.getDouble("precio");

                Vegetales vegetal = new Vegetales(nombre, tamaño, precio);
                vegetalesList.add(vegetal);
            }
        }

        return vegetalesList;
    }

    
    public void guardarCarne(Carnicos carne) throws SQLException {
    String insertCarneSQL = "INSERT INTO carnes (nombre, tamaño, precio, color) VALUES (?, ?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement carneStmt = connection.prepareStatement(insertCarneSQL)) {
            carneStmt.setString(1, carne.getName());
            carneStmt.setString(2, carne.getTamaño());
            carneStmt.setDouble(3, carne.getPrecio());
            carneStmt.setString(4, carne.getColor());
            carneStmt.executeUpdate();
        }
    }

    public List<Carnicos> obtenerCarnes() throws SQLException {
        List<Carnicos> carnesList = new ArrayList<>();
        String selectCarnesSQL = "SELECT nombre, tamaño, precio, color FROM carnes";

        try (Connection connection = getConnection();
             PreparedStatement carneStmt = connection.prepareStatement(selectCarnesSQL);
             ResultSet resultSet = carneStmt.executeQuery()) {

            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String tamaño = resultSet.getString("tamaño");
                double precio = resultSet.getDouble("precio");
                String color = resultSet.getString("color");

                Carnicos carne = new Carnicos(nombre, tamaño, precio, color);
                carnesList.add(carne);
            }
        }

        return carnesList;
    }

}
