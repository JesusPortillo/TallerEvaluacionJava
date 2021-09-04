package App;

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
        out.println("El area del circulo es: " + res);
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

}
