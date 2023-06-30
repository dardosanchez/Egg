/*
a) A continuación, realizar las siguientes consultas sobre la base de datos personal:
*/ 

/* 1. Obtener los datos completos de los empleados. */
SELECT * From Empleados;

/* 2. Obtener los datos completos de los departamentos. */
select * from departamentos;

/* 3. Listar el nombre de los departamentos. */
select nombre_depto from departamentos;

/* 4. Obtener el nombre y salario de todos los empleados. */
select nombre, sal_emp from empleados;

/* 5. Listar todas las comisiones. */ 
SELECT comision_emp From Empleados;

/* 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’. */
Select * from Empleados where cargo_emp = "Secretaria";

/* 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente. */
select * from Empleados where cargo_emp = "Vendedor" order by nombre asc;

/* 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor. */
Select nombre, cargo_emp from empleados order by sal_emp asc ;

/* 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real” */
Select nombre_jefe_depto from departamentos where ciudad = "Ciudad Real";

/* 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados. */
select nombre as Nombre , cargo_emp as Cargo from Empleados;

/* 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor. */
SELECT sal_emp, comision_emp FROM empleados WHERE id_depto = 2000;

/* 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético. */
select nombre as Nombre, (sal_emp + comision_emp + 500) as "Total a Pagar" From empleados where id_depto = 3000 order by nombre asc; 

/* 13. Muestra los empleados cuyo nombre empiece con la letra J. */
select nombre as Nombre from Empleados where nombre like 'J%';

/* 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000. */
select nombre as Nombre, sal_emp as Salario, comision_emp as Comision, (sal_emp + comision_emp) as "Salario Total" From Empleados where comision_emp > 1000;

/* 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión. */
select nombre as Nombre, sal_emp as Salario, comision_emp as Comision, (sal_emp + comision_emp) as "Salario Total" From Empleados where comision_emp = '';

/* 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo. */ 
select nombre,comision_emp,sal_emp From Empleados where comision_emp > sal_emp;

/* 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo. */
select nombre,comision_emp, ((sal_emp/30)*100) as "30% del sueldo" From Empleados where comision_emp >= ((sal_emp/30)*100);

/* 18. Hallar los empleados cuyo nombre no contiene la cadena “MA” */
select nombre From Empleados where nombre NOT LIKE '%MA%';

/* 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento. */
select nombre_depto From departamentos where nombre_depto IN ("Ventas" , "Investigación" , "Mantenimiento");

/* 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento. */
select nombre_depto From departamentos where nombre_depto NOT IN ("Ventas" , "Investigación" , "Mantenimiento");

/* 21. Mostrar el salario más alto de la empresa. */
select MAX(sal_emp) From Empleados;

/* 22. Mostrar el nombre del último empleado de la lista por orden alfabético. */
select nombre from Empleados order by nombre desc LIMIT 1; 

/* 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos. */
select max(sal_emp) as "Salario mas alto", min(sal_emp) as "Salario mas bajo", (max(sal_emp) - min(sal_emp)) as Diferencia From Empleados;

/* 24. Hallar el salario promedio por departamento. */
SELECT id_depto, AVG(sal_emp) AS "Salario Promedio" FROM empleados GROUP BY id_depto;

/* Consultas con Having
25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos. */ 
select nombre_depto,(Select count(*) from empleados where empleados.id_depto = departamentos.id_depto) as num_Empleados 
from departamentos having num_Empleados>3;

/* 26. Hallar los departamentos que no tienen empleados  */
select nombre_depto,(Select count(*) from empleados where empleados.id_depto = departamentos.id_depto) as num_Empleados 
from departamentos having num_Empleados=0;

/*
Consulta Multitabla (Uso de la sentencia JOIN/LEFT JOIN/RIGHT JOIN)
27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada departamento. */

select nombre,nombre_depto,nombre_jefe_depto From empleados join departamentos on empleados.id_depto = departamentos.id_depto; 

/*
Consulta con Subconsulta
28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento. */

select nombre,sal_emp,nombre_depto From empleados join departamentos 
on empleados.id_depto=departamentos.id_depto 
where empleados.sal_emp>= (select AVG(sal_emp))
order by nombre_depto;







