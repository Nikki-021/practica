package com.example.ejercicio2

//8. crear la clase empleado. quien va a tener como constructor el campo DNI,
//nombre
//9. asignarle propiedades acordes a un empleado con valores predefinidos.

class Empleado(val dni: String, val nombre: String) {
    var name = ""
    var surname = ""
    var nacimiento = ""
    var domicilio = ""
    var cp = ""
    var sex = ""

    //10. las funciones de esta clase Empleado van a ser, cargarStock( esta va a
    //trabajar con la clase Bodega)

    fun cargarStock(bodega: Bodega, producto: Producto) {
        bodega.agregarProducto(producto)
    }

    //11. VenderProducto( eliminaría stock de la bodega )

    fun venderProducto(bodega: Bodega, nombreProducto: String, cantidad: Int): Boolean {
        val index = bodega.listaProductos.indexOfFirst { it.nombre == nombreProducto }
        return if (index != -1 && bodega.listaProductos[index].stock >= cantidad) {
            bodega.listaProductos[index].stock -= cantidad
            true
        } else {
            false
        }
    }
}