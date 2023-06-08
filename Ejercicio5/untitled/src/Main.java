import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaUno = new ArrayList<>();

        //Agregar elementos a la lista

        listaUno.add("Lunes");
        listaUno.add("Martes");
        listaUno.add("Miercoles");
        listaUno.add("Jueves");
        listaUno.add(4, "Juernes"); //añadir en la posición 4 elemento juernes
        listaUno.add("Viernes");
        listaUno.add("Sábado");
        listaUno.add("Domingo");

        // Copiar listaUno a listaDos
        List<String> listaDos = new ArrayList<>(listaUno);

        // Añadir contenido de listaDos a listaUno
        listaUno.addAll(listaDos);

        // Imprimir la lista de días de la semana
        System.out.println("listaUno: " + listaUno.toString());
        System.out.println("ListaDos: " + listaDos.toString());

        System.out.println("===============================================================================");
        // Mostrar contenido de las posiciones 3 y 4
        System.out.println("Contenido en la posición 3: " + listaUno.get(2));
        System.out.println("Contenido en la posición 4: " + listaUno.get(3));

        System.out.println("===============================================================================");

        // Mostrar el primer elemento
        String primerElemento = listaUno.get(0);
        System.out.println("Primer elemento: " + primerElemento);

        // Mostrar el último elemento
        int lastIndex = listaUno.size() - 1;
        String ultimoElemento = listaUno.get(lastIndex);
        System.out.println("Último elemento: " + ultimoElemento);


        //eliminiar Juernes de la lista --> no me lo borra
        listaUno.remove("Juernes");
        listaUno.remove(3);
    }

    // Buscar si existe "Lunes" en la lista
    boolean existeLunes = listaUno.contains("Lunes");

    // Imprimir el resultado de la búsqueda
        if (existeLunes) {
        System.out.println("La lista contiene  'Lunes'.");
    } else {
        System.out.println("La lista no contiene 'Lunes'.");
    }
}


