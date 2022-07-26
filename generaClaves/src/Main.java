public class Main {
    public static void main(String[] args) {
        System.out.println(generarClave());

    }
    static String generarClave() {
        char[] minusculas = {'a','b', 'c'};
        char[] mayusculas = {'A','B', 'C'};
        char[] numeros = {'1', '2', '3'};

        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        System.out.println(caracteres);

        StringBuilder claveGenerada = new StringBuilder();

        for (Integer i = 0; i < 8; i++) {
            Integer cantidadCaracteres = caracteres.length();

            Double numeroRandom = Math.random()*cantidadCaracteres; //podia usar int = (int)()

            Integer numeroRandomOptimizado = numeroRandom.intValue();

            claveGenerada.append(caracteres.charAt(numeroRandomOptimizado));
        }
        return claveGenerada.toString();
    }
}