package ups.unidad4.modelo;

public class Pelicula extends ContenidoAudiovisual {
  private String estudio;

  public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
    super(titulo, duracionEnMinutos, genero);
    this.estudio = estudio;
  }

  public String getEstudio() {
    return estudio;
  }

  public void setEstudio(String estudio) {
    this.estudio = estudio;
  }

  @Override
  public String aCSV() {
    return "Pelicula," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + estudio;
  }

  @Override
  public void mostrarDetalles() {

  }

  @Override
  public String toString() {
    return "Pelicula [ID=" + getId() + ", Título=" + getTitulo() + ", Duración=" + getDuracionEnMinutos() +
      " minutos, Género=" + getGenero() + ", Estudio=" + estudio + "]";
  }
}
