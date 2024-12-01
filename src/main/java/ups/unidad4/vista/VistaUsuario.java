package ups.unidad4.vista;

import ups.unidad4.controlador.ControladorSistema;
import ups.unidad4.modelo.*;

import java.io.IOException;
import java.util.Scanner;

public class VistaUsuario {
  private ControladorSistema controlador;
  private Scanner scanner;

  public VistaUsuario(ControladorSistema controlador) {
    this.controlador = controlador;
    this.scanner = new Scanner(System.in);
  }

  public void mostrarMenu() {
    int opcion;
    do {
      System.out.println("\n========== Menú Principal ==========");
      System.out.println("1. Añadir contenido audiovisual");
      System.out.println("2. Ver lista de contenidos");
      System.out.println("3. Guardar contenidos en archivo");
      System.out.println("4. Cargar contenidos desde archivo");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opción: ");
      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          menuAgregarContenido();
          break;
        case 2:
          mostrarContenidos();
          break;
        case 3:
          guardarEnArchivo();
          break;
        case 4:
          cargarDesdeArchivo();
          break;
        case 5:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida. Intente nuevamente.");
      }
    } while (opcion != 5);
  }

  private void menuAgregarContenido() {
    System.out.println("\n========== Añadir Contenido ==========");
    System.out.println("1. Documental");
    System.out.println("2. Película");
    System.out.println("3. Serie de TV");
    System.out.println("4. Reality de TV");
    System.out.println("5. Noticiero");
    System.out.print("Seleccione una opción: ");
    int opcion = scanner.nextInt();
    scanner.nextLine();

    switch (opcion) {
      case 1:
        agregarDocumental();
        break;
      case 2:
        agregarPelicula();
        break;
      case 3:
        agregarSerieDeTV();
        break;
      case 4:
        agregarRealityDeTV();
        break;
      case 5:
        agregarNoticiero();
        break;
      default:
        System.out.println("Opción no válida.");
    }
  }

  private void agregarDocumental() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Tema: ");
    String tema = scanner.nextLine();

    controlador.agregarContenido(new Documental(titulo, duracion, genero, tema));
    System.out.println("Documental añadido con éxito.");
  }

  private void agregarPelicula() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Estudio: ");
    String estudio = scanner.nextLine();

    controlador.agregarContenido(new Pelicula(titulo, duracion, genero, estudio));
    System.out.println("Película añadida con éxito.");
  }

  private void agregarSerieDeTV() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Número de temporadas: ");
    int temporadas = scanner.nextInt();
    scanner.nextLine();

    controlador.agregarContenido(new SerieDeTV(titulo, duracion, genero, temporadas));
    System.out.println("Serie de TV añadida con éxito.");
  }

  private void agregarRealityDeTV() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Número de participantes: ");
    int participantes = scanner.nextInt();
    scanner.nextLine();

    controlador.agregarContenido(new RealityDeTV(titulo, duracion, genero, participantes));
    System.out.println("Reality de TV añadido con éxito.");
  }

  private void agregarNoticiero() {
    System.out.print("Título: ");
    String titulo = scanner.nextLine();
    System.out.print("Duración (minutos): ");
    int duracion = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Género: ");
    String genero = scanner.nextLine();
    System.out.print("Emisión (matutina, vespertina, etc.): ");
    String emision = scanner.nextLine();

    controlador.agregarContenido(new Noticiero(titulo, duracion, genero, emision));
    System.out.println("Noticiero añadido con éxito.");
  }

  private void mostrarContenidos() {
    System.out.println("\n========== Lista de Contenidos ==========");
    for (ContenidoAudiovisual contenido : controlador.obtenerListaContenidos()) {
      System.out.println(contenido.toString());
    }
  }

  private void guardarEnArchivo() {
    System.out.print("Ingrese el nombre del archivo para guardar los datos: ");
    String archivo = scanner.nextLine();
    try {
      controlador.guardarDatos(archivo);
      System.out.println("Datos guardados correctamente en " + archivo);
    } catch (IOException e) {
      System.out.println("Error al guardar los datos: " + e.getMessage());
    }
  }

  private void cargarDesdeArchivo() {
    System.out.print("Ingrese el nombre del archivo para cargar los datos: ");
    String archivo = scanner.nextLine();
    try {
      controlador.cargarDatos(archivo);
      System.out.println("Datos cargados correctamente desde " + archivo);
    } catch (IOException e) {
      System.out.println("Error al cargar los datos: " + e.getMessage());
    }
  }
}
