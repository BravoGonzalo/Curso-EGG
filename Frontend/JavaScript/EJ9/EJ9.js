const frase = prompt("Ingrese la frase.")


function mostrarFraseConEspacio(frase) {

    let fraseConEspacios = " ";
    for (let i = 0; i < frase.length; i++) {
        fraseConEspacios += frase[i];

        if (i !== frase.length - 1) {
            fraseConEspacios += " ";
        }
    }
    return fraseConEspacios;
}

let fraseConEspacios = mostrarFraseConEspacio(frase)
console.log(fraseConEspacios)