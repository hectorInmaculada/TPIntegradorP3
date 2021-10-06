package com.example.tpintegradorp3
//se crea la clase pintura que define los colores y tipo de pintura

open class Pintura (var color: String,var tipoPintura: String,chasis: Chasis,modelo: String,linea: Int,aireAcondicionado: String): Colectivo(modelo,linea,aireAcondicionado,chasis){


//sobreescritura del metodo hoja de ruta

    override fun hojaDeRuta(){
            println("ººººº< Pedido >ºººº")
            println(" Modelo: $modelo.")
            println(" Linea: $linea.")
            println(" Aire Acondicionado: $aireAcondicionado ")
            println(" Tipo de Chasis: ${this.chasis.modeloChasis}.")
            println(" Material del Chasis: ${this.chasis.material}.")
            println(" Color de la unidad: $color")
            println(" Tipo de Pintura: $tipoPintura")
            println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

    }
    //se sobreescribe el metodo de la clase colectivo
    override fun ingreso(){
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
        println("El Colectivo $modelo de la Linea $linea Ingreso a la Cabina de Pintura. ")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

    }
    //se sobreescribe el metodo de la clase colectivo
    override fun salida(){
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
        println("El Colectivo $modelo se Pinto de forma satisfactoria.")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
    }



    override fun toString(): String {
        return "¡ El Colectivo de la Linea $linea tiene color : $color y el tipo de Pintura es $tipoPintura !"
    }

}