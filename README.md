# **Contenido Audiovisual - Proyecto Unidad 4**

## **Cambios Realizados**
- **Manejo de Archivos CSV**: Se implementó la capacidad para leer y escribir datos en archivos CSV, permitiendo cargar los contenidos y guardarlos para futuras sesiones.
- **Refactorización**: Se consolidaron múltiples listas en una lista genérica, mejorando la organización y eliminando redundancias.
- **Aplicación de Principios SOLID**: Se aplicaron los principios SOLID para hacer el código más flexible y mantenible.
- **Patrón MVC**: Se estructuró el proyecto utilizando el patrón Modelo-Vista-Controlador, separando la lógica del negocio, la vista y el controlador.
- **Pruebas Unitarias**: Se crearon pruebas unitarias con JUnit para verificar la funcionalidad del sistema y asegurar la estabilidad del código.

## **Estructura del Código**
El proyecto está organizado en tres componentes principales:

1. **Modelo**: Contiene las clases que representan los datos del sistema, como `ContenidoAudiovisual`, `Pelicula`, `SerieDeTV`, `Noticiero`, etc.
2. **Controlador**: Gestiona la lógica del sistema y coordina las interacciones entre la vista y el modelo.
3. **Vista**: Ofrece la interfaz de usuario en consola para interactuar con el sistema.

### **Estructura de Paquetes**
- **`ups.unidad4.modelo`**: Contiene las clases que representan los objetos del sistema (ej. `ContenidoAudiovisual`, `Pelicula`, `SerieDeTV`).
- **`ups.unidad4.controlador`**: Implementa la lógica para manejar la creación de contenidos, leer y escribir archivos CSV, y gestionar las operaciones principales del sistema.
- **`ups.unidad4.vista`**: Proporciona la interfaz de usuario donde el usuario puede interactuar con el sistema a través de un menú en consola.

## **Instrucciones para Clonar y Ejecutar el Proyecto**

### **Clonar el Proyecto**
1. Abre tu terminal o consola.
2. Navega a la carpeta donde quieres clonar el proyecto.
3. Usa el siguiente comando para clonar el repositorio:
   ```bash
   git clone https://github.com/MarceloDarwin/UnidadCuatro.git
### **Ejecutar pruebas**
1. Selecciona la carpeta test.
2. Escoge un test.
3. Reproduce el test, en cualquier  IDE debes seleccionar run.
