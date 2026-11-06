# Biblioteca municipal – Gestión con eXist-db y Java

Aplicación de consola en Java que gestiona una base de datos XML nativa
(eXist-db) de la biblioteca de un ayuntamiento. Proyecto de la asignatura
Acceso a datos (CFGS DAM).

## Funcionalidades
- Búsqueda de libros por autor (XQuery)
- Alta, modificación y baja de libros

## Tecnologías
Java 21 · Maven · eXist-db 6.4.1 · XQuery · XML

## Cómo ejecutarlo
1. Instalar eXist-db y arrancarlo (http://localhost:8080/exist)
2. Crear la colección `/db/biblioteca` y subir `data/biblioteca.xml`
3. Configurar usuario/contraseña en `config.properties`
4. Ejecutar `Main`

## Mejoras futuras
Interfaz gráfica, búsqueda por varios campos, tests.
