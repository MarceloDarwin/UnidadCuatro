package ups.unidad4.modelo;

public class Noticiero extends ContenidoAudiovisual {
  private String emision;

  public Noticiero(String titulo, int duracionEnMinutos, String genero, String emision) {
    super(titulo, duracionEnMinutos, genero);
    this.emision = emision;
  }

  public String getEmision() {
    return emision;
  }

  public void setEmision(String emision) {
    this.emision = emision;
  }

  @Override
  public String toString() {
    return "Noticiero [ID=" + getId() + ", Título=" + getTitulo() + ", Duración=" + getDuracionEnMinutos() +
      " minutos, Género=" + getGenero() + ", Emisión=" + emision + "]";
  }

  @Override
  public String aCSV() {
    return "Noticiero," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + emision;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles del Noticiero:");
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
    System.out.println("Género: " + getGenero());
    System.out.println("Emisión: " + emision);
  }
}
