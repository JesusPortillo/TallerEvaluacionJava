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
                            obj.Mayor(Double.parseDouble(numero1.replace(",", ".")), Double.parseDouble(numero2.replace(",", ".")));
                        } catch (Exception ex) {
                            out.println("Por favor ingresar solo numeros");
                        }
                        break;
                    case 3:
                        try {
                            String radio;
                            out.println("Por favor ingrese el valor del radio");
                            radio = scanner.next();
                            obj.CalcularAreaCirculo(Double.parseDouble(radio.replace(",", ".")));
                        } catch (Exception ex) {
                            out.println("Por favor ingresar solo numeros");
                        }
                        break;
                    case 4:
                        try {
                            String precio;
                            out.println("Por favor ingrese el precio");
                            precio = scanner.next();
                            obj.CalcularPrecioTotalConIVA(Double.parseDouble(precio.replace(",", ".")));
                        } catch (Exception ex) {
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
                        if (dia.chars().allMatch(Character::isDigit)) {
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        }
                        obj.VerificarDiaLaboral(dia);
                        break;
                    case 9:
                        String frase;
                        out.println("Ingrese una frase");

                        frase = scanner.next();
                        if (frase.chars().allMatch(Character::isDigit)) {
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        } else {
                            obj.ConcatenerFraseConOtra(frase);
                        }
                        break;
                    case 10:
                        String fraseConEspacios;
                        out.println("Ingrese una frase");
                        fraseConEspacios = scanner.next();
                        if (fraseConEspacios.chars().allMatch(Character::isDigit)) {
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        } else {
                            obj.EliminarEspacios(fraseConEspacios);
                        }
                        break;
                    case 11:
                        String frasePorContar;
                        out.println("Ingrese una frase");
                        frasePorContar = scanner.next();
                        if (frasePorContar.chars().allMatch(Character::isDigit)) {
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        } else {
                            obj.ContarVocalesConLongitud(frasePorContar);
                        }
                        break;
                    case 12:
                        String frase1;
                        String frase2;
                        out.println("Ingrese frase 1 a comparar");
                        frase1 = scanner.next();
                        out.println("Ingrese frase 2 a comparar");
                        frase2 = scanner.next();
                        if (frase1.chars().allMatch(Character::isDigit) || frase2.chars().allMatch(Character::isDigit)) {
                            out.println("Ingresar algo en formato numerico no es valido aqui");
                        } else {
                            obj.IgualoDiferente(frase1, frase2);
                        }
                        break;
                    case 13:
                        obj.VerFechaHora();
                        break;
                    case 14:
                        try {
                            double inicio;
                            out.println("Ingrese el valor inicial");
                            inicio = scanner.nextDouble();
                            obj.ContarHastaMil(inicio);
                        } catch (Exception ex) {
                            out.println("Por favor ingresar solo numeros");
                        }
                        break;
                    case 15:
                        obj.menu();
                        break;
                    case 16:
                        try {
                            String entrada;
                            int tipoPeso1 = 0;
                            int tipoPeso2 = 0;
                            int tipoPeso3 = 0;
                            boolean esMayorDeEdad = true;
                            System.out.print("Ingrese el nombre de la persona: ");
                            String nombre = scanner.next();
                            System.out.print("Ingrese la edad de la persona: ");
                            int edad = scanner.nextInt();
                            while (edad < 1) {
                                System.out.println("La edad no es valida");
                                System.out.print("Ingrese la edad de la persona: ");
                                edad = scanner.nextInt();
                            }
                            System.out.print("Ingrese el sexo de la persona siendo \"H\" hombre y \"M\" mujer : ");
                            char sexo = scanner.next().charAt(0);
                            System.out.print("Ingrese el peso de la persona en KG: ");
                            int peso = scanner.nextInt();
                            while (peso < 3) {
                                System.out.println("El peso no es valido");
                                System.out.print("Ingrese el peso de la persona en KG: ");
                                peso = scanner.nextInt();
                            }
                            System.out.print("Ingrese la altura de la persona en metros: ");
                            entrada = scanner.next();
                            entrada = entrada.replace(",", ".");
                            float altura = Float.parseFloat(entrada);
                            while (altura < 0.40) {
                                System.out.println("la altura no es valida");
                                System.out.print("Ingrese la altura de la persona en metros: ");
                                altura = scanner.nextFloat();
                            }
                            Persona persona1 = new Persona(nombre, edad, peso, altura, sexo);
                            Persona persona2 = new Persona(nombre, edad, sexo);
                            Persona persona3 = new Persona();
                            persona3.setNombre(nombre);
                            persona3.setEdad(edad);
                            persona3.setPeso(peso);
                            persona3.setAltura(altura);
                            persona3.setSexo(sexo);

                            tipoPeso1 = persona1.calcularIMC();
                            System.out.println("Persona 1 - " + comprobarPeso(tipoPeso1));
                            tipoPeso2 = persona2.calcularIMC();
                            System.out.println("Persona 2 - " + comprobarPeso(tipoPeso2));
                            tipoPeso3 = persona3.calcularIMC();
                            System.out.println("Persona 3 - " + comprobarPeso(tipoPeso3));

                            esMayorDeEdad = persona1.esMayorDeEdad();
                            if (esMayorDeEdad) {
                                System.out.println("La persona 1 es mayor de edad");
                            }
                            esMayorDeEdad = persona2.esMayorDeEdad();
                            if (esMayorDeEdad) {
                                System.out.println("la persona 2 es mayor de edad");
                            }
                            esMayorDeEdad = persona3.esMayorDeEdad();
                            if (esMayorDeEdad) {
                                System.out.println("La persona 3 es mayot de edad");
                            }

                            System.out.println(persona1.toString());
                            System.out.println(persona2.toString());
                            System.out.println(persona3.toString());


                        } catch (Exception e) {
                            System.out.println("Ocurrio un error " + e);
                        }
                        break;
                    case 17:

                        break;
                    case 18:
                        break;
                    case 19:
                        System.exit(0);
                        break;

                }
            } catch (Exception ex) {
                out.println("Ingrese una opcion valida");
            }
        } while (seleccion != 19);
    }
    public static String comprobarPeso(int n) {
        String respuesta = "La persona esta en sobrepeso";
        if (n == -1) {
            respuesta = "La persona esta por debajo de su peso ideal";
        } else if (n == 0) {
            respuesta = "La persona esta en su peso ideal";
        }
        return respuesta;
    }

}
