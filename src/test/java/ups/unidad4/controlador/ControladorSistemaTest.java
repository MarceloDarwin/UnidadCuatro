package ups.unidad4.controlador;

import org.junit.jupiter.api.Test;
import ups.unidad4.modelo.*;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControladorSistemaTest {
  @Test
  void testPrecargarDatos() {
    ControladorSistema controlador = new ControladorSistema();
    controlador.precargarDatos();

    List<ContenidoAudiovisual> lista = controlador.obtenerListaContenidos();
    assertFalse(lista.isEmpty());
    assertEquals(5, lista.size()); //
  }

  @Test
  void testGuardarYCargarDatos() throws IOException {
    ControladorSistema controlador = new ControladorSistema();
    controlador.precargarDatos();

    String archivo = "test_contenidos.csv";
    controlador.guardarDatos(archivo);

    ControladorSistema nuevoControlador = new ControladorSistema();
    nuevoControlador.cargarDatos(archivo);

    List<ContenidoAudiovisual> listaOriginal = controlador.obtenerListaContenidos();
    List<ContenidoAudiovisual> listaCargada = nuevoControlador.obtenerListaContenidos();

    assertEquals(listaOriginal.size(), listaCargada.size());
    assertEquals(listaOriginal.get(0).getTitulo(), listaCargada.get(0).getTitulo());
  }
}
