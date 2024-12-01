package ups.unidad4.controlador;
import ups.unidad4.vista.VistaUsuario;

public class Main {
  public static void main(String[] args) {
    //Ejecucion de el programa usando el controlador y la vista
    ControladorSistema controlador = new ControladorSistema();
    controlador.precargarDatos();
    VistaUsuario vista = new VistaUsuario(controlador);
    vista.mostrarMenu();
  }
}
