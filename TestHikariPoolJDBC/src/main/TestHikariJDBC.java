package main;

import config.HikariConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestHikariJDBC {
    public static void main(String[] args) {

        System.out.println("Probando conexiones desde el pool...");

        // Intentar obtener y usar 5 conexiones consecutivas del pool
        for (int i = 1; i <= 5; i++) {
            // try-with-resources para cerrar la conexión automáticamente al terminar el bloque
            try (Connection conn = HikariConnectionPool.getConnection()) {
                if (conn != null) {
                    System.out.println("✓ Conexión #" + i + " establecida correctamente.");

                    // En la primera conexión, ejecutar consulta para listar productos
                    if (i == 1) {
                        System.out.println("Listado de productos:");
                        String sql = "SELECT id, nombre, precio FROM producto";

                        // Crear un Statement para ejecutar la consulta SQL
                        try (Statement stmt = conn.createStatement();
                             // Ejecutar consulta y obtener los resultados
                             ResultSet rs = stmt.executeQuery(sql)) {

                            // Recorrer cada fila del resultado
                            while (rs.next()) {
                                int id = rs.getInt("id");           // Obtener columna 'id'
                                String nombre = rs.getString("nombre"); // Obtener columna 'nombre'
                                double precio = rs.getDouble("precio"); // Obtener columna 'precio'

                                // Mostrar los datos del producto en consola
                                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio);
                            }

                        } catch (SQLException e) {
                            // Mostrar error si falla la consulta
                            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
                        }
                    }

                } else {
                    // Si la conexión no se pudo obtener del pool
                    System.out.println("X Conexión #" + i + " fallida.");
                }
            } catch (SQLException e) {
                // Mostrar cualquier error al obtener o usar la conexión
                System.err.println("Error en la conexión #" + i + ": " + e.getMessage());
                e.printStackTrace();
            }
        }

        System.out.println("Prueba finalizada.");
    }
}
