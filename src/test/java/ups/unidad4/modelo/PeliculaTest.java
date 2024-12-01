package ups.unidad4.modelo;
// Importaciones correctas para JUnit 5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PeliculaTest {
  @Test
  void testConstructorYGetters() {
    Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");

    assertEquals("Inception", pelicula.getTitulo());
    assertEquals(148, pelicula.getDuracionEnMinutos());
     assertEquals("Ciencia Ficción", pelicula.getGenero());
    assertEquals("Warner Bros", pelicula.getEstudio());
  }

  @Test
  void testSetters() {
    Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
    pelicula.setTitulo("Interstellar");
    pelicula.setDuracionEnMinutos(169);
    pelicula.setGenero("Drama");
    pelicula.setEstudio("Paramount");

    assertEquals("Interstellar", pelicula.getTitulo());
    assertEquals(169, pelicula.getDuracionEnMinutos());
    assertEquals("Drama", pelicula.getGenero());
    assertEquals("Paramount", pelicula.getEstudio());
  }

  @Test
  void testToString() {
    Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
    String esperado = "Pelicula [ID=1, Título=Inception, Duración=148 minutos, Género=Ciencia Ficción, Estudio=Warner Bros]";
    assertTrue(pelicula.toString().contains("Inception"));
  }

  @Test
  void testACSV() {
    Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
    String csvEsperado = "Pelicula,Inception,148,Ciencia Ficción,Warner Bros";
    assertEquals(csvEsperado, pelicula.aCSV());
  }
}
