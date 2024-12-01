package ups.unidad4.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentalTest {

  @Test
  void testConstructor() {
    Documental documental = new Documental("El Universo", 50, "Ciencia", "Astrofísica");
    assertEquals("El Universo", documental.getTitulo());
    assertEquals(50, documental.getDuracionEnMinutos());
    assertEquals("Ciencia", documental.getGenero());
    assertEquals("Astrofísica", documental.getTema());
  }

  @Test
  void testSetters() {
    Documental documental = new Documental("El Universo", 50, "Ciencia", "Astrofísica");
    documental.setTitulo("Planeta Tierra");
    documental.setDuracionEnMinutos(60);
    documental.setGenero("Naturaleza");
    documental.setTema("Vida Salvaje");

    assertEquals("Planeta Tierra", documental.getTitulo());
    assertEquals(60, documental.getDuracionEnMinutos());
    assertEquals("Naturaleza", documental.getGenero());
    assertEquals("Vida Salvaje", documental.getTema());
  }

  @Test
  void testToString() {
    Documental documental = new Documental("El Universo", 50, "Ciencia", "Astrofísica");
    String esperado = "Documental [ID=1, Título=El Universo, Duración=50 minutos, Género=Ciencia, Tema=Astrofísica]";
    assertTrue(documental.toString().contains("El Universo"));
  }
}
