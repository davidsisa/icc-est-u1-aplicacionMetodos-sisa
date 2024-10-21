
package controllers;
import models.Person;
import views.View;
public class Controller {
    private View view;
    private SortingMethods sortingmethods;
    private SearchMethods searchmethods;
    private Person[] personas;
    public Controller(View view, 
                    SortingMethods sortingmethods, 
                    SearchMethods searchmethods){
        this.view = view;
        this.sortingmethods = sortingmethods;
        this.searchmethods = searchmethods;
        System.out.println("Controller create");

    }
    public void start (){
        int option = 0;
        do { 
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                break;
                case 2:
                    addPerson();
                break;
                case 100:
                    System.out.println("Adios");
                break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (option != 0);

    }
    public void inputPersons(){
        System.out.println("Ingrese el numero de personas: ");
        int numeroPersonas = view.inputIn("Ingrese el numero de personas :");
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson();
        }
    }
    public void addPerson(){
        int numeroPersonas = view.inputIn("Ingrese el numero de personas a adicionar: ");
        Person[] personasTotales = new Person[personas.length + numeroPersonas];
        for (int i = 0; i < personas.length; i++) {
            personasTotales[i] = personas[i];
        }
        for (int i = personas.length; i < personasTotales.length; i++) {
            personas[i] = view.inputPerson();
        }
    }
    personas = personasTotales;
}
