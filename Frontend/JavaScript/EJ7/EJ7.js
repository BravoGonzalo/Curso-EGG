const numeroPositivo = parseFloat(10)
var sum = 0;

while (sum <= numeroPositivo) {
    const numero = parseFloat(prompt("Ingrese numero a sumar"));
    sum+= numero;
}
alert("Se ha llegado al limite :)");