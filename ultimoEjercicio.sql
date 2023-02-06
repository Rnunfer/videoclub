select A.id_almacen, count(I.id_almacen) as conteoAlmacen
					from categoria C left join pelicula_categoria P_C on C.id_categoria = P_C.id_categoria 
					left join pelicula P on P_C.id_pelicula = P.id_pelicula 
                    left join inventario I on P.id_pelicula = I.id_pelicula
                    left join almacen A on I.id_almacen = A.id_almacen
                    group by C.id_categoria, A.id_almacen;