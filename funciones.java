public class App {
    public static void main(String[] args) throws Exception {

        /*
         * LENGTH
         */

        String texto = "hola mundo";
        int longitud = 0;
        if (texto != null) {
            System.out.println("La longitud de la variable es de " + texto.length());
        } else {
            System.out.println("Nada por imprimir");
        }

        /*
         * CONCAT
         */

        String nombre = "Juan";
        String apellido = "Pérez";
        String completo = nombre.concat(" ").concat(apellido);

        if (nombre != null && apellido != null) {
            System.out.println(completo);
        }

        /*
         * EQUALS
         */

        String a = "Java";
        String b = "Java";

        if (a.equals(b)) {
            System.out.println("Son iguales");
        }

        /*
         * CompareTo. devuelve la diferencia Unicode del primer carácter distinto entre
         * dos cadenas
         */

        String s1 = "Ana";
        String s2 = "Luis";

        int resultado = s1.compareTo(s2);

        System.out.println(resultado);

        /*
         * Upper - Lower
         */

        String texto1 = "Java";
        System.out.println(texto1.toUpperCase());

        /*
         * STRING A ENTERO
         */

        int numero = Integer.parseInt("123");

        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("No es un número entero válido");
        }

        /*
         * STRING A FLOAT
         */

        float precio = Float.parseFloat("19.99");

        try {
            float f = Float.parseFloat("xyz");
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido para float");
        }

        /*
         * MATH.ROUND
         */

        float valor = 3.6f;
        int redondeado = Math.round(valor);

    }
}
