package com.example.tpintegradorp3
//se de clara la clase motor
open class Motor(var cilindrada : Int,var tipoCombustible : String,chasis: Chasis,modelo: String,linea: Int,aireAcondicionado: String) : Colectivo(modelo ,linea ,aireAcondicionado ,chasis){


    //sobreescritura del metodo hoja de ruta

    override fun hojaDeRuta(){
        println("ººººº< Pedido >ºººº")
        println(" Modelo: $modelo.")
        println(" Linea: $linea.")
        println(" Aire Acondicionado: $aireAcondicionado ")
        println(" Tipo de Chasis: ${this.chasis.modeloChasis}.")
        println(" Material del Chasis: ${this.chasis.material}.")
        println(" Cilindrada del Motor: $cilindrada")
        println(" Tipo de Combustible: $tipoCombustible")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

    }

    //se sobreescribe el metodo de la clase colectivo
    override fun ingreso(){
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
        println("El Colectivo de la Linea Nª $linea ingreso a la Fabrica con un Motor ${cilindrada} Cilindros.")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

    }

    //se sobreescribe el metodo de la clase colectivo
    override fun salida(){
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
        println("El Colectivo de la Linea Nª $linea paso por la Fabrica con un perfecto funcionamiento.")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
    }

    override fun toString(): String {
        return "¡ El Colectivo de la Linea $linea  tiene un Motor $cilindrada Cilindros, \n con un combustible $tipoCombustible .!"
    }
}