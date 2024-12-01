package ups.unidad4.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerieDeTVTest {
  @Test
  void testConstructorYGetters() {
    SerieDeTV serie = new SerieDeTV("Breaking Bad", 60, "Drama", 5);

    assertEquals("Breaking Bad", serie.getTitulo());
    assertEquals(60, serie.getDuracionEnMinutos());
    assertEquals("Drama", serie.getGenero());
    assertEquals(5, serie.getTemporadas());
  }

  @Test
  void testSetters() {
    SerieDeTV serie = new SerieDeTV("Breaking Bad", 60, "Drama", 5);
    serie.setTitulo("Better Call Saul");
    serie.setDuracionEnMinutos(50);
    serie.setGenero("Comedia");
    serie.setTemporadas(6);

    assertEquals("Better Call Saul", serie.getTitulo());
    assertEquals(50, serie.getDuracionEnMinutos());
    assertEquals("Comedia", serie.getGenero());
    assertEquals(6, serie.getTemporadas());
  }

  @Test
  void testToString() {
    SerieDeTV serie = new SerieDeTV("Breaking Bad", 60, "Drama", 5);
    assertTrue(serie.toString().contains("Breaking Bad"));
  }

  @Test
  void testACSV() {
    SerieDeTV serie = new SerieDeTV("Breaking Bad", 60, "Drama", 5);
    String csvEsperado = "SerieDeTV,Breaking Bad,60,Drama,5";
    assertEquals(csvEsperado, serie.aCSV());
  }
}
