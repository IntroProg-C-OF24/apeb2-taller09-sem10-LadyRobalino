
public class Ejercicio_2 {

    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0.0;
        for (int numero : arreglo) {
            suma += numero;
        }
        double mediaAritmetica = suma / arreglo.length;
        System.out.printf("La media aritmetica es: %.2f", mediaAritmetica);
        System.out.println(" ");
        System.out.println("Los elementoS que estan por encima de la media aritmética son : ");
        for (int numero : arreglo) {
            if (numero > mediaAritmetica) {
                System.out.println(numero);
            }
        }
        System.out.println("Los elementos que estan por debajo de la media aritmética: ");
        for (int numero : arreglo) {
            if (numero < mediaAritmetica) {
                System.out.println(numero);
            }
        }
    }
}
