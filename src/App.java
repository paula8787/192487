import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String vendedor= Input.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int producto= Input.nextInt();

        System.out.println("Ingrese valor productos 1:");
        double x1 = Input.nextDouble();

        System.out.println("Ingrese valor productos 2:");
        double x2 = Input.nextDouble();

        System.out.println("Ingrese valor productos 3:");
        double x3 = Input.nextDouble();

        System.out.println("Ingrese valor productos 4:");
        double x4 = Input.nextDouble();

        System.out.println("Ingrese valor productos 5:");
        double x5 = Input.nextDouble();

        System.out.println("Ingrese valor productos 6:");
        double x6 = Input.nextDouble();

        System.out.println("Ingrese valor productos 7:");
        double x7 = Input.nextDouble();

        double Comisiones = 0;

        if (x1 >= 100000) {
            Comisiones = Comisiones + (x1 * 0.10);
        } else {
            Comisiones = Comisiones + (x1 * 0.05);
        }

        if (x2 >= 100000) {
            Comisiones = Comisiones + (x2 * 0.10);
        } else {
            Comisiones = Comisiones + (x2 * 0.05);
        }

        if (x3 >= 100000) {
            Comisiones = Comisiones + (x3 * 0.10);
        } else {
            Comisiones = Comisiones + (x3 * 0.05);
        }

        if (x4 >= 100000) {
            Comisiones = Comisiones + (x4 * 0.10);
        } else {
            Comisiones = Comisiones + (x4 * 0.05);
        }

        if (x5 >= 100000) {
            Comisiones = Comisiones + (x5 * 0.10);
        } else {
            Comisiones = Comisiones + (x5 * 0.05);
        }

        if (x6 >= 100000) {
            Comisiones = Comisiones + (x6 * 0.10);
        } else {
            Comisiones = Comisiones + (x6 * 0.05);
        }

        if (x7 >= 100000) {
            Comisiones = Comisiones + (x7 * 0.10);
        } else {
            Comisiones = Comisiones + (x7 * 0.05);
        }

        double totalDeVentas = x1 + x2 + x3 + x4 + x5 + x6 + x7;
        double SalarioTotal = (double) (Comisiones + 1000000);

        System.out.println("Vendedor: " +vendedor);
        System.out.println("Total ventas: " + (int)totalDeVentas);
        System.out.println("Comisiones: " + (int)Comisiones);
        System.out.println("Salario total: " + (int)SalarioTotal);
       
        Input.close();
    }
}
