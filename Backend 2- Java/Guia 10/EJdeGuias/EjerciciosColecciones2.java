import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EjerciciosColecciones2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        //Agrego...
        nombres.add("Gonzalo");
        nombres.add("Bauty");
        nombres.add("Santiago");
        nombres.add("Estela");
        nombres.add("Carla");
        //elimino
        nombres.remove(2);

        HashSet<Integer> numeros = new HashSet<>();
        //Agrego...
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        //elimino
        numeros.remove(4);
        HashMap<Integer, String> DNI = new HashMap<>();
        //Agrego...
        DNI.put(12345678, "Gonzalo");
        DNI.put(12345679, "Bauty");
        DNI.put(23456789, "Santiago");
        DNI.put(34567891, "Estela");
        DNI.put(37567891, "Tamara");
        //elimino
        DNI.remove(456);
    }
}
