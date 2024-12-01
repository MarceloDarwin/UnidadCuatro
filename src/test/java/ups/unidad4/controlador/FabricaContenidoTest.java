package ups.unidad4.controlador;

import org.junit.jupiter.api.Test;
import ups.unidad4.modelo.ContenidoAudiovisual;
import ups.unidad4.modelo.Pelicula;

import static org.junit.jupiter.api.Assertions.*;

class FabricaContenidoTest {

  @Test
  void testCrearDesdeCSV() {
    String lineaCSV = "Pelicula,Avatar,162,Ciencia Ficción,20th Century Studios";
    ContenidoAudiovisual contenido = FabricaContenido.crearDesdeCSV(lineaCSV);

    assertNotNull(contenido);
    assertTrue(contenido instanceof Pelicula);

    Pelicula pelicula = (Pelicula) contenido;
    assertEquals("Avatar", pelicula.getTitulo());
    assertEquals(162, pelicula.getDuracionEnMinutos());
    assertEquals("Ciencia Ficción", pelicula.getGenero());
    assertEquals("20th Century Studios", pelicula.getEstudio());
  }

  @Test
  void testCrearDesdeCSVFormatoInvalido() {
    String lineaCSV = "Invalido,SinTitulo,0";
    ContenidoAudiovisual contenido = FabricaContenido.crearDesdeCSV(lineaCSV);

    assertNull(contenido);
  }
}
