# JDBC-Basic-and-HikariCP-Examples

Este repositorio contiene dos proyectos desarrollados en **Java con JDBC** que demuestran dos enfoques para la gestión de conexiones a base de datos MySQL:

- **TestBasicJDBC**: Utiliza JDBC clásico con `DriverManager`.
- **TestHikariPoolJDBC**: Utiliza un pool de conexiones a través de **HikariCP**, lo cual permite manejar múltiples conexiones de manera eficiente.

---

## 🛠 Herramientas utilizadas

- [Apache NetBeans 25](https://netbeans.apache.org/front/main/index.html)
- [MySQL Community Server 8.4.5 LTS](https://dev.mysql.com/downloads/mysql/)
- [JDK 21](https://www.oracle.com/java/technologies/downloads/)
- [DBeaver Community 25.0.4](https://dbeaver.io/download/)
- [XAMPP 8.2.12](https://www.apachefriends.org/es/index.html)

---

## 📁 Proyectos incluidos

### 🔹 TestBasicJDBC

Proyecto que realiza una conexión directa a MySQL usando `DriverManager`.

#### 📦 Librerías utilizadas

- [MySQL Connector/J 8.4.0](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.4.0)

#### 🧾 Archivos principales

- `BasicConnection.java`: Clase que gestiona la conexión clásica JDBC usando `DriverManager`.
- `TestBasicJDBC.java`: Clase que prueba la conexión a la base de datos y muestra un listado de productos.

---

### 🔹 TestHikariPoolJDBC

Proyecto que implementa **HikariCP** para realizar un pool de conexiones con mayor eficiencia.

#### 📦 Librerías utilizadas

- [MySQL Connector/J 8.4.0](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.4.0)
- [HikariCP 6.2.1](https://mvnrepository.com/artifact/com.zaxxer/HikariCP/6.2.1)
- [SLF4J API 1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
- [SLF4J Simple 1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-simple/1.7.36)

#### 🧾 Archivos principales

- `HikariConnectionPool.java`: Clase de configuración del pool de conexiones usando HikariCP.
- `TestHikariJDBC.java`: Clase que obtiene múltiples conexiones y realiza una consulta a la base de datos.

---

## 🗄 Base de datos utilizada

### Script SQL

```sql
-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS Tienda;

-- Usar la base de datos
USE Tienda;

-- Crear la tabla Producto
CREATE TABLE Producto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    cantidad INT NOT NULL
);

-- Insertar productos de ejemplo
INSERT INTO Producto (nombre, descripcion, precio, cantidad) VALUES
('Teclado mecánico', 'Teclado con retroiluminación RGB y switches azules.', 7500.00, 15),
('Mouse inalámbrico', 'Mouse ergonómico con sensor óptico de alta precisión.', 3200.00, 30),
('Monitor 24 pulgadas', 'Pantalla LED Full HD con entrada HDMI.', 28500.00, 10),
('Auriculares gamer', 'Auriculares con micrófono y sonido envolvente 7.1.', 6400.00, 20),
('Notebook 15.6"', 'Notebook con procesador i5, 8GB RAM, SSD 256GB.', 189000.00, 8);
```
📌 **Nota:** La conexión a MySQL se realiza con el usuario `root`, al cual se le asignó una contraseña manualmente (`123456`) desde phpMyAdmin.

----------

## 🚀 Cómo probar

1.  Clonar el repositorio:
```
git clone https://github.com/Lucas-Chavez/JDBC-Basic-and-HikariCP-Examples
```

2.  Abrir cada proyecto en NetBeans:
    
    -   `TestBasicJDBC`
        
    -   `TestHikariPoolJDBC`
        
3.  Asegurarse de que el servidor MySQL está activo desde XAMPP.
    
4.  Ejecutar cada clase `main` para verificar el acceso y lectura de productos desde la base de datos.
    
----------

## 🔗 Repositorio en GitHub

[🔗 JDBC-Basic-and-HikariCP-Examples](https://github.com/Lucas-Chavez/JDBC-Basic-and-HikariCP-Examples)