import Models.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona(null,null,null,null,null);
        Persona p2=new Persona();
        Persona p3=new Persona();
        Scanner scanner =new Scanner(System.in);
        System.out.println(" el nombre");
        p1.setName(scanner.nextLine());
        System.out.println("Ingrese la edad");
        p1.setAge(scanner.nextInt());
        System.out.println("Ingrese el sexo");
        p1.setGenre(scanner.next().charAt(0));
        System.out.println("Ingrese la altura");
        p1.setHeight(scanner.nextDouble());
        System.out.println("Ingrese el peso");
        p1.setWeight(scanner.nextDouble());

        System.out.println(p1.toString());


    }
}

