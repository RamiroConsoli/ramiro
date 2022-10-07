use tp
select c.nombre,c.apellido,v.monto from cliente as c inner join venta as v on c.idcliente=v.idcliente; 
select p.nombre,p.fechacrea  from rubro as r inner join producto as p on r.idrubro=p.idrubro where p.fechacrea='2022-10-06';
select v.cantidad,v.codprod from producto as p inner join venta as v on p.codigo=v.codprod;
select c.nombre,c.apellido, v.cantidad,v.fecha from cliente as c inner join venta as v on c.idcliente=v.idcliente where month(v.fecha)=10 and year(v.fecha)=2022;
select v.idventa,v.fecha,p.nombre from venta as v inner join producto as p on p.codigo=v.codprod where p.idrubro=2;
select r.rubro,v.fecha from rubro as r inner join producto as p on r.idrubro=p.idrubro inner join venta as v on p.codigo=v.codprod where month(v.fecha)<8 or year(v.fecha)<2022;
-- se considero como fecha la del 06-10 para ver los productos del dia