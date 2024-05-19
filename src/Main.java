import Models.Persona;

import java.util.HashMap;
import java.util.Map;
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

        //System.out.println(p1.toString());

        //ACA COMIENZO A PROBAR METODOS DE MAP
        Map<String,Persona> mapaPersona = new HashMap<>(); // <KEY,VALUE>

        //PUT
        mapaPersona.put(p1.getDni(), p1);

        //CONTAINS VALUE (TRUE OR FALSE)
        boolean estaOno= mapaPersona.containsValue(p1);
        if(estaOno == true){
            System.out.println("esta");
        }else{
            System.out.println("no esta");
        }
        //VALUES DEL MAP
        System.out.println(mapaPersona.values());

        //KEY SET = DEVUELVE LA KEY QUE CONTENGA MAP
        System.out.println("KEY:"+mapaPersona.keySet());

        String empleado = String.valueOf(String.valueOf(mapaPersona.get("1225")));



    }
}

