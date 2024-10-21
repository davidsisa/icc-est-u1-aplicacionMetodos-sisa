import controllers.*;
import views.View;

public class Main {
    public static void main(String[] args) throws Exception {
         //CREAR VISTA
         View view = new View();
         //CREAR LAS CLASES CON METODOS
         SortingMethods sortingmethods = new SortingMethods();
         SearchMethods searchmethods = new SearchMethods();
         //CREAR EL CONTROLADOR
         Controller controller = new Controller(view, sortingmethods, searchmethods);
    }
}
