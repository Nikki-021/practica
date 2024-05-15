package com.example.semana6

//constructor primario y secundario
class Coche(val marca: String) {
    constructor(marca: String, modelo: String) : this(marca){
    }

}