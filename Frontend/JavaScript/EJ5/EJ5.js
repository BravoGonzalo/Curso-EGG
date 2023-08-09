let num1 = prompt("Ingrese el primer numero");
let num2 = prompt("Ingrese el segundo numero");
let def = prompt("Que desea hacer? s = sumar r = restar m = multiplicar d = dividir")

switch (def) {
    case "s":
        let suma = num1+ num2;
        document.write(suma)
        break;
    case "r":
        let resta = num1 - num2;
        document.write(resta)
        break;
    case "m":
        let multiplicar = num1 * num2;
        document.write(multiplicar)
        break;
    case "d":
        let dividir = num1 / num2;
        document.write(dividir)
        break;
    default:
        alert("Opcion no valida")
}
