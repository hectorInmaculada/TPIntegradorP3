package com.example.tpintegradorp3

fun main(){

    var chasis1 = Chasis("MT17","Estructura de Metal")//CReacion del objeto chasis
    var colectivo1 = Colectivo("Urbano",21,"Climabuss",chasis1)//creo el objeto colectivo
    var pedido: Int = 10

    colectivo1.pedido= pedido
    colectivo1.ingreso()
    colectivo1.hojaDeRuta()
    println(colectivo1)
    colectivo1.salida()

    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")

    var chasis2 = Chasis("MT15","Titanio")//CReacion del objeto chasis
    var colectivo2 = Colectivo("Urbano",28,"ClimaBuss",chasis2)

    colectivo2.pedido = pedido
    colectivo2.ingreso()
    colectivo2.hojaDeRuta()
    println(colectivo2)
    colectivo2.salida()

    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")

    var chasis3 = Chasis("MT17","Alecion de Hierro")
    var pintura =Pintura("Rojo","Bicapa",chasis3,"Urbano",31,"CLimaBuss")
    pintura.pedido = pedido
    pintura.ingreso()
    pintura.hojaDeRuta()
    println(pintura)
    pintura.salida()

    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")

    var chasis4 = Chasis("MT12","Titanio")
    var motor = Motor(6000,"GasOil",chasis4,"Urbano",247,"Tecno Clima")
    motor.pedido = pedido
    motor.ingreso()
    motor.hojaDeRuta()
    println(motor)
    motor.salida()

    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")

    var chasis5 = Chasis("MT28","Aleacion de Cinc")
    var terminacion = Terminacion(46,"Sellados","LED","Electronico",chasis5,"Urbano",91,"ClimaBuss")
    terminacion.pedido = pedido
    terminacion.ingreso()
    terminacion.hojaDeRuta()
    println(terminacion)
    terminacion.salida()
}