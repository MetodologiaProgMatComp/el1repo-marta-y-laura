package Ejercicio6_6;

public abstract class Animal {
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
    public abstract String greets();
}
