package ups.unidad4.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoticieroTest {

  @Test
  void testConstructor() {
    Noticiero noticiero = new Noticiero("Noticias de Hoy", 30, "Informativo", "Matutina");
    assertEquals("Noticias de Hoy", noticiero.getTitulo());
    assertEquals(30, noticiero.getDuracionEnMinutos());
    assertEquals("Informativo", noticiero.getGenero());
    assertEquals("Matutina", noticiero.getEmision());
  }

  @Test
  void testSetters() {
    Noticiero noticiero = new Noticiero("Noticias de Hoy", 30, "Informativo", "Matutina");
    noticiero.setTitulo("Noticias Actualizadas");
    noticiero.setDuracionEnMinutos(60);
    noticiero.setGenero("Político");
    noticiero.setEmision("Nocturna");

    assertEquals("Noticias Actualizadas", noticiero.getTitulo());
    assertEquals(60, noticiero.getDuracionEnMinutos());
    assertEquals("Político", noticiero.getGenero());
    assertEquals("Nocturna", noticiero.getEmision());
  }

  @Test
  void testToString() {
    Noticiero noticiero = new Noticiero("Noticias de Hoy", 30, "Informativo", "Matutina");
    String esperado = "Noticiero [ID=1, Título=Noticias de Hoy, Duración=30 minutos, Género=Informativo, Emisión=Matutina]";
    assertTrue(noticiero.toString().contains("Noticias de Hoy"));
  }
}
