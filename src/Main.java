import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        TreeSet<Person> persoane = new TreeSet<>();

        persoane.add(new Person("AXX", 5));
        persoane.add(new Person("VXX", 100));
        persoane.add(new Person("ZXX", 10));

        // Afișarea persoanelor cu vârsta mai mare de 60 de ani
        System.out.println("Persoanele cu vârsta mai mare de 60:");
        for (Person persoana : persoane) {
            if (persoana.getAge() > 60) {
                System.out.println(persoana);
            }
        }
    }
}