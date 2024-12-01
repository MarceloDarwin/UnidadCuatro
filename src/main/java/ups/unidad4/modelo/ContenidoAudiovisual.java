package ups.unidad4.modelo;

//Clase padre abstracta, de la cual se generan los tipos de contenidos
public abstract class ContenidoAudiovisual {
  private static int contador = 0;
  private int id;
  private String titulo;
  private int duracionEnMinutos;
  private String genero;

  public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
    this.id = ++contador;
    this.titulo = titulo;
    this.duracionEnMinutos = duracionEnMinutos;
    this.genero = genero;
  }

  public int getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getDuracionEnMinutos() {
    return duracionEnMinutos;
  }

  public void setDuracionEnMinutos(int duracionEnMinutos) {
    this.duracionEnMinutos = duracionEnMinutos;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public abstract String aCSV();

  public abstract void mostrarDetalles();
}
