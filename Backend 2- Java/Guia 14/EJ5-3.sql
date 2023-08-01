select * from personajes;

update personajes
set aparicion = 1938
where id_personaje = 12;

delete
from personajes
where id_personaje = 10;

select nombre_real from personajes;

select nombre_real from personajes where nombre_real like 'B%';