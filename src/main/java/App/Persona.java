package App;

public class Persona {
    private final char sexoPorDefecto = 'H';
    private String nombre;
    private int edad, DNI, peso;
    private float altura;
    private char sexo;

    public Persona() {
        this.edad = 0;
        this.altura = 0;
        this.nombre = "";
        this.peso = 0;
        this.sexo = comprobarSexo(this.sexo);
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.altura = 0;
        this.peso = 0;
        generaDNI();
    }

    public Persona(String nombre, int edad, int peso, float altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = comprobarSexo(sexo);
        generaDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int calcularIMC() {
        int respuesta = 0;
        double IMC = (this.peso / Math.pow(this.altura, 2));
        if (IMC < 20) {
            respuesta = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            respuesta = 0;
        } else {
            respuesta = 1;
        }
        return respuesta;
    }

    public boolean esMayorDeEdad() {
        if (this.edad < 18) {
            return false;
        }
        return true;
    }

    private char comprobarSexo(char sexo) {
        char s = sexoPorDefecto;
        if ("M".equals(sexo)) {
            s = 'M';
        }
        return s;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo;
    }

    private void generaDNI() {
        this.DNI = (int) (100000000 * Math.random());
    }


}
