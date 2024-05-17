package Models;

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

    public Persona(String name, Integer age, String dni, Character genre, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.dni = dni;
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

    public void imc(Persona p){
        Double result =weight/(height*height);
        if(result<20){
            System.out.println("Bajo peso");
        }else if(result>=20 && result<=25){
            System.out.println("Peso normal");
        }else{
            System.out.println("sobre peso");
        }
    }
    public Boolean age(Persona p){
        boolean result;
        if(age>18){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    private Character checkGenre(Persona p){
        if(genre != 'h' 'm'){

        }
    }

}

//Los métodos que se implementaran son:
// calcularIMC(): calculara si la persona esta en su peso ideal (peso en
//kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la
//función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
//significa que esta por debajo de su peso ideal la función devuelve un 0 y si
//devuelve un valor mayor que 25 significa que tiene sobrepeso, la función
//devuelve un 1. Te recomiendo que uses constantes para devolver estos
//valores.
//■ esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//■ comprobarSexo(char sexo): comprueba que el sexo introducido es
//correcto. Si no es correcto, sera H. No sera visible al exterior.
//■ toString(): devuelve toda la información del objeto.
//■ generaDNI(): genera un número aleatorio de 8 cifras, genera a partir
//de este su número su letra correspondiente. Este método sera
//invocado cuando se construya el objeto. Puedes dividir el método
//para que te sea más fácil. No será visible al exterior.
//■ Métodos set de cada parámetro, excepto de DNI.