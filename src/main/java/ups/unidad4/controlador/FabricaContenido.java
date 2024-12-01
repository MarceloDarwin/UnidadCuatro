package ups.unidad4.controlador;

import ups.unidad4.modelo.*;

public class FabricaContenido {
  //Se retorna un metodo de contenidoAudiiovisual desde un archivo CSV
  public static ContenidoAudiovisual crearDesdeCSV(String linea) {
    String[] datos = linea.split(",");
    String tipo = datos[0];
  //Dependiendo de el tipo de contenido se obtiene los datos mediante el uso de linea.split
    switch (tipo) {
      case "Pelicula":
        return new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
      case "SerieDeTV":
        return new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], Integer.parseInt(datos[4]));
      case "Documental":
        return new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
      case "RealityDeTv":
        return new RealityDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], Integer.parseInt(datos[4]));
      case "Noticiero":
        return new Noticiero(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
      default:
        return null;
    }
  }
}
