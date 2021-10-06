package com.example.tpintegradorp3
//se crea la clase terminacion y se procede a heredar de la clase padre colectivo

class Terminacion(var cantidadAsientos: Int,var vidrios: String, var luces: String,var cartel: String,chasis: Chasis,modelo: String,linea: Int,aireAcondicionado: String): Colectivo(modelo, linea, aireAcondicionado , chasis ){


    //sobreescritura del metodo hoja de ruta

    override fun hojaDeRuta(){
        println("ººººº< Pedido >ºººº")
        println(" Modelo: $modelo.")
        println(" Linea: $linea.")
        println(" Aire Acondicionado: $aireAcondicionado ")
        println(" Tipo de Chasis: ${this.chasis.modeloChasis}.")
        println(" Material del Chasis: ${this.chasis.material}.")
        println(" Cantidad de asientos: $cantidadAsientos")
        println(" Tipo de Vidrios: $vidrios")
        println(" Tipo de Luces: $luces")
        println(" Tipo de Cartel: $cartel")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

    }

    //se sobreescribe el metodo de la clase colectivo
    override fun ingreso(){
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
        println("El Colectivo de la Linea: $linea ingreso a la seccion de Terminacion¡")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

    }

    //se sobreescribe el metodo de la clase colectivo
    override fun salida(){
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
        println("El Colectivo  de la Linea:$linea fue terminado en la seccion Terminacion.")
        println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
    }

    override fun toString(): String {
        return "¡ El Colectivo de la Linea $linea  tiene Vidrios $vidrios , una cantidad de acientos de $cantidadAsientos, \n" +
                " la tecnologia de luces que utiliza es $luces , y el tipo de Cartel es $cartel . !"
    }

}