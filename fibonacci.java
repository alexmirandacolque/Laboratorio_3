import java.util.Scanner;

public class Fibonacci {

    /**
     * Genera y muestra los primeros n términos de la serie de Fibonacci.
     * @param n Cantidad de términos a generar
     */
    public static void generarFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor a 0.");
            return;
        }

        long primero = 0;
        long segundo = 1;

        System.out.println("Serie de Fibonacci (" + n + " términos):");

        for (int i = 1; i <= n; i++) {
            System.out.print(primero + (i < n ? ", " : "\n"));
            long siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de Fibonacci a generar: ");
        
        if (scanner.hasNextInt()) {
            int limite = scanner.nextInt();
            generarFibonacci(limite);
        } else {
            System.out.println("Entrada no válida. Debe ingresar un número entero.");
        }
        
        scanner.close();
    }
}
