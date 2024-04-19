import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        simonMartinez(;
        crearMascota();
        consultarMascotas();

        printName();

        nombre();
        nuevoNombre();

    }


    static void crearMascota() {
        Mascota m1 = new Mascota("Tobias", "Snouzer", "Canino", 5);
        mascotas.add(m1);//agregamos la mascota a las lista de mascotas
        Mascota m2 = new Mascota("Lilu", "Pequinez", "Canino", 15);
        mascotas.add(m2);//agregamos la mascota a las lista de mascotas
    }

    static void consultarMascotas() {
        System.out.println("----Lista de Mascotas--------");
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre());
        }
    }

    static void printName(){
        System.out.println("Modificado por: Paula");
    }


    //Metodo para imprimir mi nombre
    static void nombre(){
        System.out.println("Nombre: Jose Alejandro Jimenez Vasquez");
        System.out.println("Número de documento: 1020302386");
        System.out.println("Grupo: Jueves 9-12m");
    }

    static void nuevoNombre() {
        System.out.println("Nombre: Maria Alejandra Ocampo Giraldo");
        System.out.println("Número de documento: 1036928998");
        System.out.println("Grupo: Jueves 9-12am");
    }
    static void simonMartinez() {
        System.out.println("Nombre: Simon Martinez");
        System.out.println("Número de documento: 1001367561");
        System.out.println("Grupo: miercoles 9-12am");
    }

    static void juanDiegoOcampo() {
        System.out.println("Nombre: Juan Diego Ocampo");
        System.out.println("Número de documento: 1017923386");
        System.out.println("Grupo: viernes 6-9am");
    }


    static void eliminarMascotas() {
    }


}
