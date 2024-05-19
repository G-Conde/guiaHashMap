package Models;

import java.util.Random;

public class Persona {
    private String name = null;
    private Integer age = 0;
    private String dni = null;
    private Character genre = null;
    private Double weight = 0.0;
    private Double height = 0.0;

    public Persona() {
    }

    public Persona(String name, Integer age, Character genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public Persona(String name, Integer age, Character genre, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.dni = generaDNI();
        this.genre = genre;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Character getGenre() {
        return genre;
    }

    public void setGenre(Character genre) {
        this.genre = genre;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer imc(Persona p) {
        double indice = p.getWeight() / (p.getHeight() * p.getHeight());
        Integer result = 0;

        if (indice < 20) {
            result = -1;
        } else if (indice > 25) {
            result = 1;
        }
        return result;
    }

    public Boolean age(Persona p) {
        Boolean result=null;
        if (p.getAge() > 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private void checkGenre(Persona p) {
        Character aux=p.getGenre();
        if ( aux != 'h' &&  aux !='m'){
            System.out.println("Genero incorrecto:"+p.getGenre());
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                ", genre=" + genre +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    // Método para generar el DNI
    private String generaDNI() {
        int numero = generaNumeroAleatorio();
        char letra = calculaLetra(numero);
        return String.format("%08d", numero);
    }

    // Genera un número aleatorio de 8 cifras
    private int generaNumeroAleatorio() {
        Random rand = new Random();
        return 10000000 + rand.nextInt(90000000);
    }

    // Calcula la letra del DNI
    private char calculaLetra(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(numero % 23);
    }


}


