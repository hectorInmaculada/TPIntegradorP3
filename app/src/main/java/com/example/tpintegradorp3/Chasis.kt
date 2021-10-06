package com.example.tpintegradorp3

class Chasis  {
    var modeloChasis : String = ""
    var material : String = ""

    constructor(modeloChasis: String, material : String) {
        this.modeloChasis = modeloChasis
        this.material = material
    }

    override fun toString(): String {
        return "El Chasis es de Material $material , y su Modelo es: $modeloChasis . "
    }

}