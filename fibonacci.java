import java.util.Scanner;

public class Fibonacci {

    /**
     * Genera y muestra los primeros n términos de la serie de Fibonacci.
     * @param n Cantidad de términos a generar
     */
    public static void generarFibonacci(int n) {
	// caso base
	if (n == 0) { 
	   return 0;
        }

	if (n == 1) {
	   return 1;
	}

	// llamada recursiva 
	return fibonacci(n-1) + fibonacci(n-2);        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de Fibonacci a generar: ");
        
	int n = scanner.nextInt();
	fibonacci(n);      
    }
}
