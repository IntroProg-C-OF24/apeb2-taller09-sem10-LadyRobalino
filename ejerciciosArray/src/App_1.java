
import java.util.Scanner;

public class App_1 {

    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        System.out.println("Ingrese el número de marcas de vehículos:");
        int lim = lady.nextInt();
        lady.nextLine();
        String[] nombreM = new String[lim];
        for (int i = 0; i < nombreM.length;) {
            System.out.println("Ingrese la marca del vehículo:" + (i + 1));
            nombreM[i] = lady.nextLine();
            if (nombreM[i].startsWith("A") || nombreM[i].startsWith("C") || nombreM[i].startsWith("T")) {
                System.out.println("Las letras A,C,T no se contabilizan, escriba otra marca:");
            } else {
                i++;
                if (i >= lim) {
                    break;  // Salir del bucle si i no es menor que lim
                }// incrementa i solo si la marca no comienza con 'A', 'C' o 'T'
            }
        }
        System.out.println("Las marcas de vehículos ingresadas son:");
        for (String marca : nombreM) {
            System.out.println(marca);
        }
    }
}
