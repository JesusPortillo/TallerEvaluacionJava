package App;

import java.text.DateFormat;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

public class Funciones {
    public void Mayor(){
        int x = 20;
        int y = 14;

        if (x == y){
            out.println("los numeros ingresados son iguales");
        }else if (x > y){
            out.println("El numero mayor es: " + x);
            out.println("El numero menor es: " + y);
        }else{
            out.println("El numero mayor es: " + y);
            out.println("El numero menor es: " + x);
        }
    }
    public void Mayor(double x, double y){
        if (x == y){
            out.println("los numeros ingresados son iguales");
        }else if (x < y){
            out.println("El numero mayor es: " + x);
            out.println("El numero menor es: " + y);
        }else{
            out.println("El numero mayor es: " + y);
            out.println("El numero menor es: " + x);
        }
    }

    public void CalcularAreaCirculo(double radio){
        double res = Math.PI * Math.pow(radio,2);
        out.println("El área del circulo es: " + res);
    }

    public void CalcularPrecioTotalConIVA(double precio){
        double res = precio + (precio * 0.21);
        out.println("El precio final es: " + res);
    }

    public void MostrarParesImpares(){
        boolean bandera = true;
        double actual = 1;
        while (actual <= 100 ){
            if (actual % 2 == 0){
                out.println("El numero " + actual + " es par");
            }else {
                out.println("El numero " + actual + " es impar");
            }
            actual++;
        }
    }

    public void MostrarParesImparesConFor(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                out.println("El numero " + i + " es par");
            }else {
                out.println("El numero " + i + " es impar");
            }
        }
    }
    public void MostrarNumeroMayorIgualCero(){
        Scanner scanner = new Scanner(in);
        double numeroPorProbar = 0;
        do {
            try {
                out.println("Ingrese un numero mayor o igual a 0");
                numeroPorProbar = scanner.nextDouble();
                if (numeroPorProbar >= 0){
                    out.println("El valor ingresado fue " + numeroPorProbar);
                }
            }catch (Exception ex){
                out.println("Ingrese solo numeros");
                break;
            }
        }while (numeroPorProbar < 0);
    }

    public void VerificarDiaLaboral(String dia){
        switch (eliminarAcentos(dia)){
            case "lunes":
                out.println("El lunes es un dia laboral, sin tener en cuenta festividades");
                break;
            case "martes":
                out.println("El martes es un dia laboral, sin tener en cuenta festividades");
                break;
            case "miercoles":
                out.println("El miercoles es un dia laboral, sin tener en cuenta festividades");
                break;
            case "jueves":
                out.println("El jueves es un dia laboral, sin tener en cuenta festividades");
                break;
            case "viernes":
                out.println("El viernes es un dia laboral, sin tener en cuenta festividades");
                break;
            case "sabado":
                out.println("El sabado no es un dia laboral");
                break;
            case "domingo":
                out.println("El domingo no es un dia laboral");
                break;
            default:
                out.println("Este no es un dia de la semana");

        }
    }
    public String eliminarAcentos(String cadena) {

        cadena.toUpperCase();
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        cadena = cadena.replaceAll("[^\\p{ASCII}]", "");
        return cadena.toLowerCase();
    }

    public void ConcatenerFraseConOtra(String frase){
        out.println("La sonrisa sera la mejor arma contra la tristeza ".replace("a", "e").concat(frase));
    }

    public void EliminarEspacios(String frase){
        out.println(frase.replace(" ", ""));
    }

    public void ContarVocalesConLongitud(String frase){
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a'){
                contA++;
            }else if (frase.charAt(i) == 'e'){
                contE++;
            }else if (frase.charAt(i) == 'i'){
                contI++;
            }else if (frase.charAt(i) == 'o'){
                contO++;
            }else if (frase.charAt(i) == 'u'){
                contU++;
            }
        }
        out.println("La longitud de la frase es de " + frase.length() + "\n"+
                "La vocal a aparece: " + contA + "veces"+ "\n"+
                "La vocal e aparece: " + contE + "veces"+ "\n"+
                "La vocal i aparece: " + contI + "veces"+ "\n"+
                "La vocal o aparece: " + contO + "veces"+ "\n"+
                "La vocal u aparece: " + contU + "veces");
    }
    public void IgualoDiferente(String frase1, String frase2){
        if (frase1.equalsIgnoreCase(frase2)){
            out.println("Las dos frases son iguales");
        }else {
            HashMap<Integer, String> distintos = new HashMap<>();
            if (frase1.length() == frase2.length()){
                for (int i = 0; i < frase1.length(); i++) {
                    if (frase1.charAt(i) != frase2.charAt(i)){
                        distintos.put(i, frase1.charAt(i)+" es distinto a "+frase2.charAt(i));
                    }
                }
            }else if (frase1.length() > frase2.length()){
                for (int i = 0; i < frase1.length(); i++) {
                    if (i <= frase2.length() - 1){
                        if (frase1.charAt(i) != frase2.charAt(i)){
                            distintos.put(i, frase1.charAt(i)+" es distinto a "+frase2.charAt(i));
                        }
                    }else{
                        distintos.put(i, "No tienen con quien comparar en frase 2: "+frase1.charAt(i));
                    }
                }
            }else if (frase1.length() < frase2.length()){
                for (int i = 0; i < frase2.length(); i++) {
                    if (i <= frase1.length() - 1){
                        if (frase1.charAt(i) != frase2.charAt(i)){
                            distintos.put(i, frase1.charAt(i)+" es distinto a "+frase2.charAt(i));
                        }
                    }else{
                        distintos.put(i, "No tienen con quien comparar en frase 1: "+frase2.charAt(i));
                    }
                }
            }
            distintos.entrySet().stream().forEach(out::println);
        }
    }
    public void VerFechaHora(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+hourdateFormat.format(date));
    }

    public void ContarHastaMil(double inicio){
        if (inicio <= 998){
            for (double i = inicio; i <= 1000; i+=2) {
                out.println(i);
            }
        }else {
            out.println("El numero maximo a ingresar debe ser 1000");
        }
    }
    public void menu(){
        int seleccion = 0;
        do {
            try {
                System.out.println("****** GESTION CINEMATOGRAFICA ********");
                System.out.println(" 1-NUEVO ACTOR\n 2-BUSCAR ACTOR\n 3-ELIMINAR ACTOR\n 4-MODIFICAR ACTOR\n 5-VER TODOS LOS ACTORES" +
                        "\n 6-VER PELICULAS DE LOS ACTORES\n 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n 8-SALIR");
                Scanner scanner = new Scanner(System.in);
                seleccion = scanner.nextInt();

                switch (seleccion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        out.println("Opcion incorrecta");

                }
            }catch (Exception ex){
                out.println("Solo esta permitido ingresar alguna de las opciones");
            }
        }while (seleccion != 8);
    }

}
