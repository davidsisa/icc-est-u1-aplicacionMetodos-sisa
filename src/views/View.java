package views;
import java.util.Scanner;
import models.Person;
public class View {
    private Scanner scanner;

    public View(){
        scanner = new Scanner (System.in);
    }
    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1. Ingresar el numero de personas: ");
        System.out.println("100 , salir");
        System.out.println("Ingrese una opcion");
        return scanner.nextInt();
    }
    public int inputIn(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public Person inputPerson(){
        String name = inputName();
        int age = inputAge();
        return new Person(name,age);
    }
    public String inputName(){
        System.out.println("Ingrese el nombre");
        return scanner.next();
    }
    public int inputAge(){
        return inputIn("Ingrese la edad: ");
    }
    public void showMesagge (String mensaje){
        System.out.println(" " + mensaje);
    }
    public int selecSortingMethod() {
        System.out.println("**************Ingrese la condicion a ordenar ******");
        System.out.println("1. Por nombre ");
        System.out.println("2. Por edad   ");
        System.out.println("Ingrese una opcion");
        return scanner.nextInt();
    }
}
