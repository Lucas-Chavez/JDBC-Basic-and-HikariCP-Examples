package config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class HikariConnectionPool {

    // Configuración estática de HikariCP
    private static final HikariConfig config = new HikariConfig();
    // Fuente de datos que administra el pool de conexiones
    private static final HikariDataSource ds;

    // Bloque estático para inicializar la configuración y el pool una vez al cargar la clase
    static {
        // Establecer URL JDBC con base de datos MySQL local y nombre "db"
        config.setJdbcUrl("jdbc:mysql://localhost:3306/tienda");
        // Usuario para la conexión
        config.setUsername("root");
        // Contraseña del usuario
        config.setPassword("123456");
        // Número máximo de conexiones que tendrá el pool
        config.setMaximumPoolSize(10);
        // Crear el pool con la configuración definida
        ds = new HikariDataSource(config);
    }

    // Método estático para obtener una conexión del pool
    public static Connection getConnection() throws SQLException {
        // Retorna una conexión disponible (o crea una nueva si hay espacio)
        return ds.getConnection();
    }
}
