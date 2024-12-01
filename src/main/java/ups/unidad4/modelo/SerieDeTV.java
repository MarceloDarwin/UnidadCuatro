package ups.unidad4.modelo;


public class SerieDeTV extends ContenidoAudiovisual {
  private int temporadas;

  public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
    super(titulo, duracionEnMinutos, genero);
    this.temporadas = temporadas;
  }

  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  @Override
  public String aCSV() {
    return "SerieDeTV," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + temporadas;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles de la Película:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
    System.out.println("Género: " + getGenero());
  }


  @Override
  public String toString() {
    return "SerieDeTV [ID=" + getId() + ", Título=" + getTitulo() + ", Duración=" + getDuracionEnMinutos() +
      " minutos, Género=" + getGenero() + ", Número de Temporadas=" + temporadas + "]";
  }
}
