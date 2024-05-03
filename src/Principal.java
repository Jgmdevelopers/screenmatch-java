import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9) {
            String menu = """
                    Bienvenido(a) a ScreenMatch
                    1) Registrar Pelicula
                    2) Registrar Serie
                    3) Calculadora de Tiempo
                    
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del titulo de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese año de lanzamiento");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDurancionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del titulo de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese año de lanzamiento");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad de temporadas");
                    int cantidadTemporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad de episodios por temporadas");
                    int cantidadEpisodios = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad de minutos por episodios");
                    int cantidadMinutosEpisodios = teclado.nextInt();
                    teclado.nextLine();

                    Serie serieUsuario = new Serie();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(cantidadTemporadas);
                    serieUsuario.setEpisodiosPorTemporada(cantidadEpisodios);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(cantidadMinutosEpisodios);
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        }

    }
}
