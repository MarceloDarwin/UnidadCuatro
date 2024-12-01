package ups.unidad4.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealityDeTVTest {

  @Test
  void testConstructor() {
    RealityDeTV reality = new RealityDeTV("Survivor", 90, "Aventura", 20);

    assertEquals("Survivor", reality.getTitulo());
    assertEquals(90, reality.getDuracionEnMinutos());
    assertEquals("Aventura", reality.getGenero());
    assertEquals(20, reality.getParticipantes());
  }

  @Test
  void testSettersAndGetters() {
    RealityDeTV reality = new RealityDeTV("Survivor", 90, "Aventura", 20);

    reality.setTitulo("La Isla");
    reality.setDuracionEnMinutos(120);
    reality.setGenero("Competencia");
    reality.setParticipantes(15);

    assertEquals("La Isla", reality.getTitulo());
    assertEquals(120, reality.getDuracionEnMinutos());
    assertEquals("Competencia", reality.getGenero());
    assertEquals(15, reality.getParticipantes());
  }

  @Test
  void testToString() {
    RealityDeTV reality = new RealityDeTV("Survivor", 90, "Aventura", 20);
    String esperado = "RealityDeTV [ID=" + reality.getId() + ", Título=Survivor, Duración=90 minutos, Género=Aventura, Participantes=20]";
    assertEquals(esperado, reality.toString());
  }

  @Test
  void testACSV() {
    RealityDeTV reality = new RealityDeTV("Survivor", 90, "Aventura", 20);
    String esperado = "RealityDeTV,Survivor,90,Aventura,20";
    assertEquals(esperado, reality.aCSV());
  }
}
