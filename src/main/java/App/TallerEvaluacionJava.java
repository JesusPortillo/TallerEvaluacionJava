package App;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.*;

public class TallerEvaluacionJava {
    public static void main(String[] args) {
        Funciones obj = new Funciones();
        int seleccion;
        do {
            out.println("Seleccione un item del menú");
            out.println("1- Punto 1\n2- Punto 2\n3- Punto 3\n4- Punto 4\n5- Punto 5\n" +
                    "6- Punto 6\n7- Punto 7\n8- Punto 8\n9- Punto 9\n10- Punto 10\n" +
                    "11- Punto 11\n12- Punto 12\n13- Punto 13\n14- Punto 14\n15- Punto 15\n" +
                    "16- Punto 16\n17- Punto 17\n18- Punto 18\n19- Salir");
            Scanner scanner = new Scanner(System.in);
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    obj.Mayor();
                    break;
                case 2:
                    try {
                        String numero1;
                        String numero2;
                        out.println("Por favor ingrese el primer numero");
                        numero1 = scanner.next();
                        out.println("Por favor ingrese el segundo numero");
                        numero2 = scanner.next();
                        obj.Mayor(Double.parseDouble(numero1.replace(",",".")), Double.parseDouble(numero2.replace(",",".")));
                    }catch (Exception ex){
                        out.println("Por favor ingresar solo numeros");
                    }
                    break;
                case 3:
                    try {
                        String radio;
                        out.println("Por favor ingrese el valor del radio");
                        radio = scanner.next();
                        obj.CalcularAreaCirculo(Double.parseDouble(radio.replace(",",".")));
                    }catch (Exception ex){
                        out.println("Por favor ingresar solo numeros");
                    }
                    break;
                case 4:
                    try {
                        String precio;
                        out.println("Por favor ingrese el precio");
                        precio = scanner.next();
                        obj.CalcularPrecioTotalConIVA(Double.parseDouble(precio.replace(",",".")));
                    }catch (Exception ex){
                        out.println("Por favor ingresar solo numeros");
                    }
                    break;
                case 5:
                    obj.MostrarParesImpares();
                    break;
                case 6:
                    obj.MostrarParesImparesConFor();
                    break;
                case 7:
                    obj.MostrarNumeroMayorIgualCero();
                    break;
                case 8:
                    String dia;
                    out.println("Ingrese un dia de la semana");
                    dia = scanner.next().toLowerCase();
                    eliminarAcentos(dia);
                    out.println(dia);
                    if (dia.chars().allMatch(Character::isDigit)){
                        out.println("Ingresar algo en formato numerico no es válido aquí");
                    }
                    obj.VerificarDiaLaboral(dia);
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                default:
                    out.println("No ha ingresado ninguna opción valida, recuerde que van desde el numero 1 al 19");
                    break;

            }
        } while (seleccion != 19);
    }
    public static String eliminarAcentos(String str) {

        final String ORIGINAL = "áéíóú";
        final String REEMPLAZO = "aeiou";

        if (str == null) {
            return null;
        }
        char[] array = str.toCharArray();
        for (int indice = 0; indice < array.length; indice++) {
            int pos = ORIGINAL.indexOf(array[indice]);
            if (pos > -1) {
                array[indice] = REEMPLAZO.charAt(pos);
            }
        }
        return new String(array);
    }
}
