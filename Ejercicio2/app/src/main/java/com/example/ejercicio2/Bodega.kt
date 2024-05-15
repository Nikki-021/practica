package com.example.ejercicio2

//3. crear la Clase Bodega.
//4. asignarle un constructor vacío.
//5. como propiedades que tenga una lista de Producto.
class Bodega {
    constructor()
    val listaProductos = mutableListOf<Producto>()


    // 6. crear una función que agregue cosas a la lista. pidiendo un producto por
    //parámetro. (identificar el valor. y si existe modificar el Stock de lo contrario
    //agregarlo )
    fun agregarProducto(producto: Producto) {
        val index = listaProductos.indexOfFirst { it.nombre == producto.nombre }
        if (index != -1) {
            listaProductos[index].stock += producto.stock
        } else {
            listaProductos.add(producto)
        }
    }
    //7. crear una funcion que elimine productos de la lista ( tiene que revisar que ese
    //producto exista en la lista. de lo contrario devolver un valor avisando que no*
    //se encontro)

    fun eliminarProducto(producto: Producto): String {
        val index = listaProductos.indexOfFirst { it.nombre == producto.nombre }
        return if (index != -1) {
            listaProductos.removeAt(index)
            "El producto ${producto.nombre} se elimino"
        } else {
            "El producto ${producto.nombre} no se encontro en la lista"
        }
    }


}
