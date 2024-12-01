package ups.unidad4.modelo;

//Clase actor que implementa una interfaz.
public class Actor implements ContenidoInteractivo {
  private String nombre;
  private String nacionalidad;

  public Actor(String nombre, String nacionalidad) {
    this.nombre = nombre;
    this.nacionalidad = nacionalidad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("Actor: " + nombre + " - Nacionalidad: " + nacionalidad);
  }
}
