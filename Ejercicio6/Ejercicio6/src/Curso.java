import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String titulo;
    private float duracion;
    private int videos;
    private int alumnos;

    public Curso(String titulo, float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

//Imprimir la cantidad de cursos con duracion mayor a 5 horas
        int cantidadCursosDuracionMayorA5Horas = 0;

        for (Curso curso : cursos) {
            if (curso.getDuracion() > 5) {
                cantidadCursosDuracionMayorA5Horas++;
            }
        }

        System.out.println("-la cantidad de cursos con duración mayor a 5 horas es: " + cantidadCursosDuracionMayorA5Horas);

        //Imprimir la cantidad de cursos duración menor a 2 horas

        int cantidadCursosDuracionMenorA2Horas = 0;

        for (Curso curso : cursos) {
            if (curso.getDuracion() < 2) {
                cantidadCursosDuracionMenorA2Horas++;
            }
        }

        System.out.println("-Cantidad de cursos con duración menor a 2 horas: " + cantidadCursosDuracionMenorA2Horas);

       // Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.

        System.out.println("====================================================================");

        for (Curso curso : cursos) {
            if (curso.getVideos() > 50) {
                String titulo = curso.getTitulo();
                System.out.println("-Título del curso con más de 50 vídeos: " + titulo);
            }
        }

        //Mostrar en consola la duración total de todos los cursos
        float duracionTotal = 0;

        for (Curso curso : cursos) {
            duracionTotal += curso.getDuracion();
        }

        System.out.println("-Duración total de todos los cursos: " + duracionTotal + " horas");

        //promedio
        float duracionPromedio = 0;
        for (Curso curso : cursos) {
            duracionPromedio += curso.getDuracion();
        }
        duracionPromedio /= cursos.size();

        //Mostrar los cursos que superen el promedio de duración
        System.out.println("Cursos con duración superior al promedio:");
        for (Curso curso : cursos) {
            if (curso.getDuracion() > duracionPromedio) {
                System.out.println("    -"+curso.getTitulo());
            }
        }
        System.out.println("=======================================================================");

        //Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos  inscritos menor a 500.
        System.out.println("Duración de los cursos con menos de 500 alumnos inscritos:");
        for (Curso curso : cursos) {
            if (curso.getAlumnos() < 500) {
                System.out.println(curso.getTitulo() + ": " + curso.getDuracion() + " horas");
            }
        }

        System.out.println("=======================================");

        //Obtener el curso con mayor duración.

        Curso cursoMaxDuracion = null;
        float duracionMaxima = 0;

        for (Curso curso : cursos) {
            if (curso.getDuracion() > duracionMaxima) {
                duracionMaxima = curso.getDuracion();
                cursoMaxDuracion = curso;
            }
        }

        if (cursoMaxDuracion != null) {
            System.out.println("El curso con mayor duración es: " + cursoMaxDuracion.getTitulo());
            System.out.println("        -Duración: " + cursoMaxDuracion.getDuracion() + " horas");
        } else {
            System.out.println("No se encontró ningún curso.");
        }



    }


}
