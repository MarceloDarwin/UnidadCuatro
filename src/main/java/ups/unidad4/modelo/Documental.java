package ups.unidad4.modelo;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {
  private String tema;
  private List<Investigador> investigadores;

  public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
    super(titulo, duracionEnMinutos, genero);
    this.tema = tema;
    this.investigadores = new ArrayList<>();
  }

  public String getTema() {
    return tema;
  }

  public void setTema(String tema) {
    this.tema = tema;
  }

  public void agregarInvestigador(Investigador investigador) {
    investigadores.add(investigador);
  }

  public List<Investigador> getInvestigadores() {
    return investigadores;
  }

  @Override
  public String toString() {
    return "Documental [ID=" + getId() + ", Título=" + getTitulo() + ", Duración=" + getDuracionEnMinutos() +
      " minutos, Género=" + getGenero() + ", Tema=" + tema + "]";
  }

  @Override
  public String aCSV() {
    return "Documental," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + tema;
  }

  @Override
  public void mostrarDetalles() {

  }
}
