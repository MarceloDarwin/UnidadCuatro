package ups.unidad4.controlador;

import ups.unidad4.modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorSistema {
  private List<ContenidoAudiovisual> listaContenidos;

  public ControladorSistema() {
    this.listaContenidos = new ArrayList<>();
  }

  // Método para precargar datos
  public void precargarDatos() {
    listaContenidos.add(new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios"));
    listaContenidos.add(new SerieDeTV("Breaking Bad", 50, "Drama", 5));
    listaContenidos.add(new Documental("Planeta Tierra", 90, "Naturaleza", "Vida Salvaje"));
    listaContenidos.add(new RealityDeTV("Survivor", 60, "Aventura", 20));
    listaContenidos.add(new Noticiero("Televistazo", 30, "Informativo", "Matutina"));
  }

  // Método para agregar un nuevo contenido audiovisual
  public void agregarContenido(ContenidoAudiovisual contenido) {
    listaContenidos.add(contenido);
  }

  // Método para desplegar la lista de contenidos
  public void mostrarListaContenidos() {
    if (listaContenidos.isEmpty()) {
      System.out.println("No hay contenidos disponibles.");
    } else {
      System.out.println("\n========== Lista de Contenidos ==========");
      for (ContenidoAudiovisual contenido : listaContenidos) {
        System.out.println(contenido.toString());
      }
    }
  }

  // Método para guardar datos en un archivo CSV
  public void guardarDatos(String archivo) throws IOException {
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
      for (ContenidoAudiovisual contenido : listaContenidos) {
        escritor.write(contenido.aCSV());
        escritor.newLine();
      }
      System.out.println("Datos guardados correctamente en el archivo: " + archivo);
    } catch (IOException e) {
      System.out.println("Error al guardar los datos: " + e.getMessage());
    }
  }

  // Método para cargar datos desde un archivo CSV
  public void cargarDatos(String archivo) throws IOException {
    listaContenidos.clear();
    try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
      String linea;
      while ((linea = lector.readLine()) != null) {
        ContenidoAudiovisual contenido = FabricaContenido.crearDesdeCSV(linea);
        if (contenido != null) {
          listaContenidos.add(contenido);
        }
      }
      System.out.println("Datos cargados correctamente desde el archivo: " + archivo);
    } catch (IOException e) {
      System.out.println("Error al cargar los datos: " + e.getMessage());
    }
  }

  public List<ContenidoAudiovisual> obtenerListaContenidos() {
    return listaContenidos;
  }
}
