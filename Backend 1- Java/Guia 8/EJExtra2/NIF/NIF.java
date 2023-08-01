package NIF;

public class NIF {
    public long NumeroDNI;
    public char NIF;

    public void NIFF(long NumeroDNI, char NIF) {
        this.NIF = NIF;
        this.NumeroDNI = NumeroDNI;
    }

    public void setNombreDNI(char NIF) {
        this.NIF = NIF;
    }

    public void setNumeroDNI(long NumeroDNI) {
        this.NumeroDNI = NumeroDNI;
    }

    public long getNumeroDNI() {
        return NumeroDNI;
    }

    public char getNIF() {
        return NIF;
    }
    
    public char mostrarletra() {

        long resto = getNumeroDNI() % 23;
        int restoINT = (int) resto;

        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        char letra = ' ';

        if (resto > 0 && resto < 22) {
            letra = letras[restoINT];
        }
        return letra;

    }
}
