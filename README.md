# 🚀 Proyecto Java – JDBC Básico y Pool de Conexiones con HikariCP

Este repositorio contiene dos ejemplos prácticos de cómo conectar aplicaciones Java con una base de datos **MySQL** utilizando **JDBC (Java Database Connectivity)**. Se exploran dos enfoques:

-   ✅ **JDBC Clásico con DriverManager**
-   ⚡ **Pool de Conexiones con HikariCP**

El objetivo es comparar ambas implementaciones y aprender buenas prácticas en el acceso a datos en Java.

----------


## 📚 Tabla de Contenidos

1. [🛠 Herramientas utilizadas](#-herramientas-utilizadas)  
2. [🧩 Parte 1: JDBC Clásico](#-parte-1-jdbc-clásico)  
3. [🧩 Parte 2: HikariCP (Connection Pooling)](#-parte-2-hikaricp-connection-pooling)  
4. [🗄 Base de datos utilizada](#-base-de-datos-utilizada)  
5. [🚀 Cómo ejecutar los proyectos](#-cómo-ejecutar-los-proyectos)  
6. [✅ Conclusión y aprendizaje](#-conclusión-y-aprendizaje)  
7. [🔗 Repositorio](#-repositorio)

----------

## 🛠 Herramientas utilizadas

-   🧰 [Apache NetBeans 25](https://netbeans.apache.org/front/main/index.html)
-   🐬 [MySQL Community Server 8.4.5 LTS](https://dev.mysql.com/downloads/mysql/)
-   ☕ [JDK 21](https://www.oracle.com/java/technologies/downloads/)
-   🐘 [DBeaver Community 25.0.4](https://dbeaver.io/download/)
-   ⚙️ [XAMPP 8.2.12](https://www.apachefriends.org/es/index.html)

----------

## 🧩 Parte 1: JDBC Clásico

Este proyecto muestra cómo conectar Java a una base de datos MySQL usando **DriverManager**, sin optimizaciones de rendimiento.

### 📂 Proyecto: `TestBasicJDBC`

#### 📦 Librería utilizada

-   [MySQL Connector/J 8.4.0](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.4.0)

#### 🧾 Archivos principales

-   `BasicConnection.java`: Configura y devuelve una conexión simple usando `DriverManager.getConnection(...)`.
-   `TestBasicJDBC.java`: Ejecuta una consulta y muestra productos desde la tabla `Producto`.

### ✅ Ventajas

-   Fácil de implementar y entender.
-   Ideal para pruebas y ejemplos pequeños.

----------

## 🧩 Parte 2: HikariCP (Connection Pooling)

Este segundo proyecto utiliza **HikariCP**, una de las librerías más rápidas y eficientes para gestionar múltiples conexiones a bases de datos.

### 📂 Proyecto: `TestHikariPoolJDBC`

#### 📦 Librerías utilizadas

-   [MySQL Connector/J 8.4.0](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.4.0)
-   [HikariCP 6.2.1](https://mvnrepository.com/artifact/com.zaxxer/HikariCP/6.2.1)
-   [SLF4J API 1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
-   [SLF4J Simple 1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-simple/1.7.36)

#### 🧾 Archivos principales

-   `HikariConnectionPool.java`: Configura el pool de conexiones con HikariCP.
-   `TestHikariJDBC.java`: Prueba la obtención eficiente de múltiples conexiones y muestra los productos de la tabla `Producto`.

### ✅ Ventajas

-   Mayor rendimiento y escalabilidad.
-   Menor sobrecarga al abrir/cerrar conexiones.

----------

## 🗄 Base de datos utilizada

La base de datos `Tienda` contiene una tabla de productos con registros de ejemplo.

### 📜 Script SQL

```sql
CREATE DATABASE IF NOT EXISTS Tienda;
USE Tienda;

CREATE TABLE Producto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    cantidad INT NOT NULL
);

INSERT INTO Producto (nombre, descripcion, precio, cantidad) VALUES
('Teclado mecánico', 'Teclado con retroiluminación RGB y switches azules.', 7500.00, 15),
('Mouse inalámbrico', 'Mouse ergonómico con sensor óptico de alta precisión.', 3200.00, 30),
('Monitor 24 pulgadas', 'Pantalla LED Full HD con entrada HDMI.', 28500.00, 10),
('Auriculares gamer', 'Auriculares con micrófono y sonido envolvente 7.1.', 6400.00, 20),
('Notebook 15.6"', 'Notebook con procesador i5, 8GB RAM, SSD 256GB.', 189000.00, 8);

```

📌 **Nota:** La conexión a MySQL se realiza con el usuario `root`, al cual se le asignó una contraseña manualmente (`123456`) desde phpMyAdmin.

----------

## 🚀 Cómo ejecutar los proyectos

1.  Clonar el repositorio:

```
git clone https://github.com/Lucas-Chavez/JDBC-Basic-and-HikariCP-Examples
```

2.  Abre ambos proyectos en **NetBeans**:
    
    -   `TestBasicJDBC`
    -   `TestHikariPoolJDBC`
    
3.  Verifica que **MySQL** esté activo desde **XAMPP**.
    
4.  Ejecuta cada clase `main` y observa los resultados de conexión y consultas.
    
----------

## ✅ Conclusión y aprendizaje

Este proyecto demuestra dos enfoques fundamentales para la gestión de conexiones a bases de datos en Java mediante JDBC:

-   **JDBC básico con DriverManager**, útil para comprender el funcionamiento interno de las conexiones.
-   **JDBC con HikariCP**, ideal para ambientes productivos donde la eficiencia y el rendimiento son esenciales.

A través de estos ejemplos, se consolidan los siguientes aprendizajes clave:

-   Cómo establecer una conexión a una base de datos MySQL desde Java.
-   La diferencia entre una conexión tradicional (DriverManager) y una optimizada mediante pool de conexiones (HikariCP).
-   Cómo ejecutar consultas SQL y procesar resultados desde código Java.
-   La importancia de cerrar adecuadamente los recursos JDBC para evitar fugas de memoria.
-   Introducción a buenas prácticas como la reutilización de conexiones y separación de responsabilidades.

Estas prácticas forman la base para desarrollar aplicaciones Java más robustas, escalables y eficientes al trabajar con bases de datos relacionales.

----------

## 🔗 Repositorio

[🔗 JDBC-Basic-and-HikariCP-Examples](https://github.com/Lucas-Chavez/JDBC-Basic-and-HikariCP-Examples)