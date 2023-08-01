package Servicios;

import java.util.Scanner;

import Entidades.Cadena;

public class CadenaServicio {
    Cadena ff = new Cadena();
    Scanner input = new Scanner(System.in);

    public void mostrarVocales() {
        int vocal = 0;
        String frase = ff.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            char vocales = frase.charAt(i);
            switch (vocales) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocal++;
                    break;
            }
        }
        System.out.println("La cantidad de vocales que tiene es: " + vocal);
    }

    public String invertirFrase() {
        String frase = ff.getFrase();
        char[] caracteres = frase.toCharArray();
        int longitud = caracteres.length;

        for (int i = 0; i < longitud / 2; i++) {
            char temporal = caracteres[i];
            caracteres[i] = caracteres[longitud - i - 1];
            caracteres[longitud - i - 1] = temporal;
        }
        return new String(caracteres);
    }

    public String vecesRepetido(String letra) {
        char caracter = letra.charAt(0);
        int repetido = 0;

        for (int i = 0; i < ff.getLongitud(); i++) {
            char letras = ff.getFrase().charAt(i);
            if (caracter == letras) {
                repetido++;
            }
        }
        System.out.println("El caracter ingresado esta repetido: " + repetido + " en la frase ''casa blanca''");
        return new String(letra);
    }

    public void compararLongitud(String frase) {

        if (ff.getLongitud() == frase.length()) {
            System.out.println("La longitud de la frase ingresada es IGUAL a la de ''casa blanca''");
        } else if (ff.getLongitud() < frase.length()) {
            System.out.println("La longitud de la frase ingresada es MENOR a la de ''casa blanca''");
        } else {
            System.out.println("La longitud de la frase ingresada es MAYOR a la de ''casa blanca''");
        }
    }

    public void unirFrases(String frase) {
        System.out.println(ff.getFrase() + " " + frase);
    }

    public void reemplazar(String letra) {
        char frasepred = ff.getFrase().charAt(0);
        for (int i = 0; i < ff.getLongitud(); i++) {
            char reemplazar = letra.charAt(i);
            if (frasepred == 'a') {
                frasepred = reemplazar;
            }
        }
        System.out.println("La frase modificada es: " + frasepred);

    }

}
