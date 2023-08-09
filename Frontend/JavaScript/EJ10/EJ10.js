const frase = prompt("Ingrese la frase")

function flecha(frase) {
    let fraseInvertida = "";

    for(let i = frase.length -1; i >= 0; i--){
        fraseInvertida += frase[i];
    }

    return fraseInvertida;
}

let flechaInvertida = flecha(frase);
console.log(flechaInvertida)