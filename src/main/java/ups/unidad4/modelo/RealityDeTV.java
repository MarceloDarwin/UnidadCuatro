package ups.unidad4.modelo;

public class RealityDeTV extends ContenidoAudiovisual {
  private int participantes;

  public RealityDeTV(String titulo, int duracionEnMinutos, String genero, int participantes) {
    super(titulo, duracionEnMinutos, genero);
    this.participantes = participantes;
  }

  public int getParticipantes() {
    return participantes;
  }

  public void setParticipantes(int participantes) {
    this.participantes = participantes;
  }

  @Override
  public String toString() {
    return "RealityDeTV [ID=" + getId() + ", Título=" + getTitulo() + ", Duración=" + getDuracionEnMinutos() +
      " minutos, Género=" + getGenero() + ", Participantes=" + participantes + "]";
  }

  @Override
  public String aCSV() {
    return "RealityDeTV," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + participantes;
  }

  @Override
  public void mostrarDetalles() {

  }
}
