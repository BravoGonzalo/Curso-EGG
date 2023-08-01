
import java.util.ArrayList;

public class EjerciciosColecciones3 {
    public String libro1 = "Quijote";
    public String libro2 = "Principito";
    public String libro3 = "Resplandor";

    public static void main(String[] args) {
        ArrayList<EjerciciosColecciones3 > Libros = new ArrayList<>();
        EjerciciosColecciones3  var = new EjerciciosColecciones3 ();
        Libros.add(var);
        for(EjerciciosColecciones3  mostrar : Libros){
            System.out.println(mostrar);
        }
    }

    @Override
    public String toString() {
        return "Titulo1=" + libro1 + ", Titulo2=" + libro2 + ", Titulo3=" + libro3 ;
    }

}
