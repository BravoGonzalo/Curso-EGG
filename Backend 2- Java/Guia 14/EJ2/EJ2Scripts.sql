select nombre from producto;

select nombre, precio from producto;

select * from producto;

select nombre,round(precio) from producto;

select codigo_fabricante from producto p inner join fabricante f on p.codigo_fabricante = f.codigo;