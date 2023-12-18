
public class notaEst {

    public static void main(String[] args) {
        int limEst = 28, mejor = 0, peor = 0;
        double notasEst[] = new double[limEst];
        double sumaNotas = 0, promedio, notaMayor, notaMenor;
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i] = (double) (Math.random() * (10 - 0 + 1) + 0);
        }
        System.out.println("LISTADO DE NOTAS");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.printf("%s %d: %.2f \n", "Nota del Est", (i + 1), notasEst[i]);
        }
        for (int i = 0; i < notasEst.length; i++) {
            sumaNotas += notasEst[i];
        }
        promedio = sumaNotas / notasEst.length;
        System.out.printf("Promedio: %.2f \n ", promedio);
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > notaMayor) {
                notaMayor = notasEst[i];
                mejor = i;
            }
            if (notasEst[i] < notaMenor) {
                notaMenor = notasEst[i];
                peor = i;
            }
        }
        System.out.printf("El estudiante con la mejor nota es el número %d con una nota de: %.2f \n", (mejor + 1), notaMayor);
        System.out.printf("El estudiante con la peor nota es el número %d con una nota de: %.2f \n", (peor + 1), notaMenor);
        System.out.println("     ");
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > promedio) {
                System.out.printf("La notas que estan por encima del promedio son: %.2f \n", notasEst[i]);
            }
        }
        System.out.println("      ");
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] < promedio) {
                System.out.printf("La notas que estan por debajo del promedio son: %.2f \n", notasEst[i]);
            }
        }
    }
}
