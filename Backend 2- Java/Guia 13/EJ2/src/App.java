import entidades.Arreglos;

public class App {
    public static void main(String[] args) throws Exception {
        Arreglos vec = new Arreglos(3,4,5);

        try{
            int valor = vec.getValor(5);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error, no existe ese indice." + e.getMessage());
        }
    }
}
