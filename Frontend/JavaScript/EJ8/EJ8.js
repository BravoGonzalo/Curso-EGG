let suma = 0;
let cons = true;
while (cons == true) {
    let num = parseFloat(prompt("Ingrese los numeros que quiera. Para salir ponga 0."))
    suma+= num;
    if(num === 0){
        cons = false;
    }
}
alert("La suma de todo fue: " + suma)