package com.example.tpintegradorp3
//clase padre

open class Colectivo {//se utiliza la propiedad open para acceder a la clase mediante Herencia
        //se declaran los atributos propios de la clase

        var modelo : String = ""
        var linea : Int = 0
        var aireAcondicionado : String = ""
        var chasis : Chasis = Chasis("","")//relacion de composicion de clases
        var pedido:Int=0
            get() = field
            set(value) {
                chequeoPedido(value)
                field = value
            }

        //creacion del constructor
        constructor(modelo: String, linea: Int, aireAcondicionado: String,chasis: Chasis) {
                this.modelo = modelo
                this.linea = linea
                this.aireAcondicionado = aireAcondicionado
                this.chasis.modeloChasis = chasis.modeloChasis
                this.chasis.material = chasis.material
            }

                //se llama al metodo mediante el atributo pedido.
                fun chequeoPedido(pedido: Int){
                    if(pedido<10){
                        println("El Pedido es : $pedido")
                        println("El Pedido minimo de unidades es 10 Colectivos.")

                    }else{
                        println("El Pedido es : $pedido")
                        println("Ahora Puede solicitar la fabricacion de las unidades")
                    }
                }

        //Se crean los metodos y se le referencian con la palabra reservada open para aplicar la herencia.

        open fun ingreso(){
            println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
            println("El Colectivo $modelo esta en proceso de fabricacion.¡")
            println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

        }

        open fun salida(){
            println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
            println("El Colectivo $modelo se Fabrico de forma satisfactoria.")
            println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")
        }

        open fun hojaDeRuta(){
            println("ººººº< Pedido >ºººº")
            println(" Modelo: ${this.modelo}.")
            println(" Linea: ${this.linea}.")
            println(" Aire Acondicionado: ${this.aireAcondicionado} ")
            println(" Tipo de Chasis: ${this.chasis.modeloChasis}.")
            println(" Material del Chasis: ${this.chasis.material}.")
            println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº")

        }

            override fun toString(): String {
                return "El Colectivo Modelo: ${this.modelo} de la Linea numero: ${this.linea}" +
                ", \ntiene instalado un equipo de Aire Acondiconado de ${this.aireAcondicionado}"
            }

}