select * from empleados;

select * from departamentos;

select nombre_depto from departamentos;

select nombre,sal_emp from empleados;

select comision_emp from empleados order by comision_emp asc;

select * from empleados where cargo_emp = 'Secretaria';

select * from empleados where cargo_emp = 'Vendedor' order by nombre asc;

select nombre,cargo_emp from empleados order by sal_emp desc;

select nombre_jefe_depto from departamentos where ciudad = 'Ciudad Real';

select nombre as NOMBRE, cargo_emp as CARGO from empleados;

select sal_emp,comision_emp from empleados where id_depto = 2000 order by comision_emp desc;

select nombre,(sal_emp + comision_emp + 500) as pagar_total from empleados order by nombre asc;

select nombre from empleados where nombre like 'J%';

select sal_emp,comision_emp,(sal_emp + comision_emp) as salario_total from empleados where comision_emp > 3000;

select sal_emp,comision_emp,(sal_emp + comision_emp) as salario_total from empleados where comision_emp = 0;

select * from empleados where  comision_emp > sal_emp;

select * from empleados where comision_emp <= 0.30 % sal_emp; 

select * from empleados where nombre not like 'MA';

select nombre_depto from departamentos where nombre_depto in ("Ventas", "Investigación", "Mantenimiento");

select nombre_depto from departamentos where not nombre_depto in ("Ventas", "Investigación", "Mantenimiento");

select max(sal_emp) from empleados;

select nombre from empleados order by nombre asc limit 1;

select max(sal_emp) as SAL_ALTO, min(sal_emp) as SAL_BAJO, max(sal_emp) - min(sal_emp) as SAL_DIF from empleados;

select id_depto,avg(sal_emp) from empleados group by id_depto;

select id_depto,count(id_emp) from empleados group by id_depto having count(id_emp) > 3;

select id_depto from empleados group by id_depto having count(id_emp) = 0;

select * from empleados where sal_emp > (select avg(sal_emp) from empleados) order by id_depto;