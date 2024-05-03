import modelo.Pelicula;
import modelo.Serie;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión de Java");

//        Pelicula matrix = new Pelicula();
//        matrix.setNombre("Matrix");
//        matrix.setTiempoDeDurancionEnMinutos(120);
//        matrix.setFechaDeLanzamiento(1999);
//        matrix.muestraFichaTecnica();
//
//        Pelicula encanto = new Pelicula();
//        encanto.setNombre("Encanto");
//        encanto.setTiempoDeDurancionEnMinutos(120);
//        encanto.setFechaDeLanzamiento(2022);
//        encanto.muestraFichaTecnica();
//
//        Serie friends = new Serie();
//        friends.setNombre("Friends");
//        friends.setFechaDeLanzamiento(1996);
//        friends.setTemporadas(10);
//        friends.setEpisodiosPorTemporada(22);
//        friends.setDuracionEnMinutosPorEpisodio(30);
//        friends.muestraFichaTecnica();

        Principal principal = new Principal();
        principal.muestraElMenu();


    }
}