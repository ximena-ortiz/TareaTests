# Trabajo Tests

Este proyecto está configurado para generar reportes de tests.

## Generar Reportes de Tests

Para generar los reportes de tests, ejecuta el siguiente comando Maven:

```sh
mvnw clean test jacoco:report
```
Este comando realizará las siguientes acciones:
1. Limpiará el proyecto.
2. Ejecutará los tests.
3. Generará el reporte de cobertura de código utilizando JaCoCo.

## Ubicación de los Reportes

### Reporte de Tests Unitarios

El reporte de cobertura de los tests unitarios se encuentra en la carpeta `target/site` y puede ser visualizado abriendo el archivo `index.html` en un navegador web.

Ruta: `target/site/index.html`
