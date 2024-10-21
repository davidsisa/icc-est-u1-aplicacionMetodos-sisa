package models;

public class Person {
    private String nombre;
    private int age;
    public Person(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
