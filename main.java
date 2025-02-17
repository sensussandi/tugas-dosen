public class Main {
    public static void main(String[] args) {
        helloWorld();
        greetings("Mahasiswa");
        farewell("Mahasiswa");
    }

    public static void helloWorld() {
        System.out.println("Hello, world!");
    }

    public static void greetings(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Menambahkan fitur farewell
    public static void farewell(String name) {
        System.out.println("Goodbye, " + name + "!");
    }
}
