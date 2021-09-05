package App;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.*;

public class TallerEvaluacionJava {
    public static void main(String[] args) {
        Funciones obj = new Funciones();
        int seleccion = 0;
        do {
            try {
                out.println("Seleccione un item del menu");
                out.println("1- Punto 1\n2- Punto 2\n3- Punto 3\n4- Punto 4\n5- Punto 5\n" +
                        "6- Punto 6\n7- Punto 7\n8- Punto 8\n9- Punto 9\n10- Punto 10\n" +
                        "11- Punto 11\n12- Punto 12\n13- Punto 13\n14- Punto 14\n15- Punto 15\n" +
                        "16- Punto 16\n17- Punto 17\n18- Punto 18\n19- Salir");
                Scanner scanner = new Scanner(System.in);
                scanner.useDelimiter("\n");
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
                        dia = scanner.next();
                        if (dia.chars().allMatch(Character::isDigit)){
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        }
                        obj.VerificarDiaLaboral(dia);
                        break;
                    case 9:
                        String frase;
                        out.println("Ingrese una frase");

                        frase = scanner.next();
                        if (frase.chars().allMatch(Character::isDigit)){
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        }else {
                            obj.ConcatenerFraseConOtra(frase);
                        }
                        break;
                    case 10:
                        String fraseConEspacios;
                        out.println("Ingrese una frase");
                        fraseConEspacios = scanner.next();
                        if (fraseConEspacios.chars().allMatch(Character::isDigit)){
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        }else {
                            obj.EliminarEspacios(fraseConEspacios);
                        }
                        break;
                    case 11:
                        String frasePorContar;
                        out.println("Ingrese una frase");
                        frasePorContar = scanner.next();
                        if (frasePorContar.chars().allMatch(Character::isDigit)){
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        }else {
                            obj.ContarVocalesConLongitud(frasePorContar);
                        }
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
                    case 19:
                        System.exit(0);
                        break;

                }
            }catch (Exception ex){
                out.println("Ingrese una opcion valida");
            }
        } while (seleccion != 19);
    }

}
