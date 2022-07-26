import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        Integer dato = scanner.nextInt();

        imprimir(comprobarPrimo(dato));
    }


    static void imprimir(Boolean booleano) {
        if (booleano) {
            System.out.println("Es primo");
        } else {
            System.out.println("NO ES PRIMO");
        }
    }

    static Boolean comprobarPrimo(Integer numeroEntrada) {

        Integer contador = 0;

        if (numeroEntrada > 1) {
            //creo espacios en un array con el numero que pedi
            Integer[] numeros = new Integer[numeroEntrada];

            //lleno los espacios del array
            for (Integer i = 0; i < numeros.length; i++) {
                //condicion de llenado
                numeros[i] = i + 1;
//            System.out.println(numeros[i]);
            }

            //recorro y salto a la siguiente con continue si pasa eso,
            for (Integer i : numeros) {
                if (i == 1 || i == numeroEntrada) {
                    continue;
                }
                if (numeroEntrada % i == 0) {
                    contador++;
                }
            }
            return contador == 0;
        } else {
            if (numeroEntrada < 1) {
                System.out.println("El numero ingresado no es valido");

            }
            return contador == 1;
        }


    }
}


