package com.example.ejerciciosetyget

class Empleado(private val name:String,private val edad:Int){

    private var dni = ""
    private var direccion = ""
    private var estadoCivil = ""
    private var telefono = ""
    private var codigo = ""
    private var psotal = ""
    private var sexo = ""

    fun setDni(value: String) {
        this.dni = value
    }

    fun getDni():String {
        return dni
    }
    fun setDireccion(value: String) {
        this.direccion = value
    }

    fun getDireccion():String {
        return direccion
    }
    fun setEstado(value: String) {
        this.estadoCivil = value
    }

    fun getEstado():String {
        return estadoCivil
    }
    fun setCelular(value: String) {
        this.telefono = value
    }

    fun getCelular():String {
        return telefono
    }
    fun setCoddig(value: String) {
        this.codigo = value
    }

    fun getCoddig():String {
        return codigo
    }
    fun setPostal(value: String) {
        this.psotal = value
    }

    fun getPostal():String {
        return psotal
    }
    fun setSex(value: String) {
        this.sexo = value
    }

    fun getSex():String {
        return sexo
    }
}