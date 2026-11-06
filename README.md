# Biblioteca municipal – Gestión con eXist-db y Java

Aplicación de consola en Java que gestiona una base de datos XML nativa
(eXist-db) de la biblioteca de un ayuntamiento. Proyecto de la asignatura
Acceso a datos (CFGS Desarrollo de Aplicaciones Multiplataforma).

## Funcionalidades

- Búsqueda de libros por autor mediante consultas XQuery
- Alta, modificación y baja de libros
- Menú interactivo por consola

## Tecnologías

Java 21 · Maven · eXist-db 6.4.1 · XQuery · XML · IntelliJ IDEA

## Estructura del proyecto

```
biblioteca-exist/
├── data/biblioteca.xml        Datos de ejemplo (5 libros)
├── src/main/java/org/example/
│   ├── ConexionExistDB.java   Conexión con eXist-db
│   ├── Consultas.java         Búsqueda, alta, modificación y baja
│   └── Main.java              Menú de la aplicación
└── pom.xml                    Dependencias de Maven
```

## Cómo ejecutarlo

1. Descargar e instalar [eXist-db 6.4.1](https://github.com/eXist-db/exist/releases/tag/eXist-6.4.1)
   y arrancarlo. Se abre en http://localhost:8080/exist
2. Desde el Dashboard (eXide), crear la colección `/db/biblioteca` y subir
   el archivo `data/biblioteca.xml`
3. Comprobar los datos de conexión en `ConexionExistDB.java`
   (por defecto: usuario `admin`, contraseña vacía)
4. Abrir el proyecto con IntelliJ IDEA (JDK 21) y ejecutar `Main`

## Mejoras futuras

- Interfaz gráfica (JavaFX o Swing)
- Búsqueda por varios campos (título, género, editorial)
- Consultas parametrizadas y configuración externa de la conexión
- Pruebas automáticas
