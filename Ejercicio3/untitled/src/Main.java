class ArrayReales implements Estadisticas {
    private double[] array;

    public ArrayReales(double[] array) {
        this.array = array;
    }

    @Override
    public double minimo() {
        double min = Double.MAX_VALUE;

        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    @Override
    public double maximo() {
        double max = Double.MIN_VALUE;

        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    @Override
    public double sumatorio() {
        double sum = 0;

        for (double num : array) {
            sum += num;
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        double[] numeros = { 2.5, 1.8, 4.2, 3.7, 6.1 };
        ArrayReales arrayReales = new ArrayReales(numeros);

        System.out.println("Mínimo: " + arrayReales.minimo());
        System.out.println("Máximo: " + arrayReales.maximo());
        System.out.println("Sumatorio: " + arrayReales.sumatorio());
    }
}


