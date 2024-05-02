import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión de Java");
        System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnelPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        if (incluidoEnelPlanBasico) {
            System.out.println("Se encuentra incluido en el plan basico");
        }else{
            System.out.println("No se encuentra incluido en el plan basico");
        }


        double mediaEvaluacion = (4.5 + 4.8 +3) / 3;
        System.out.println("la media es: "+ mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        Scanner respuesta = new Scanner(System.in);
        System.out.println("Desea calificar la pelicula? S/N ");
        String calificar = respuesta.next().toLowerCase();
        while (calificar.equals("s")) {
            for (int i = 0; i < 3; i++) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese la nota o evaluacion que le darias a la pelicula: "+nombre);
                double notaMatrix = teclado.nextDouble();
                mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            }

            System.out.println("La evaluacion media  del usuario es: "+
                    mediaEvaluacionUsuario/3);

            System.out.println("Desea calificar nuevamente la pelicula? S/N ");
            calificar = respuesta.next().toLowerCase(); // Convierte la entrada del usuario a minúsculas

        }
        System.out.println("Gracias por su calificación");


    }
}