
class Empleado {
    private String nombre;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}

class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}

class Operario extends Empleado {
    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}

class Oficial extends Operario {
    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}

class Tecnico extends Operario {
    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");

        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }
}
