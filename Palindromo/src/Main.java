import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        if (esPalindromo(nombre)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("no es palindromo");
        }
    }
    static Boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replace(" ", "");

        StringBuilder palabraInvertida = new StringBuilder();


        for (Integer i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida.append(palabra.charAt(i));
        }
            return palabra.equals(palabraInvertida.toString());
        }

    }



