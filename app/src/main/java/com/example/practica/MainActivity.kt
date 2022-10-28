package com.example.practica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validarEdadPersona()
        tablaMultiplicar()
        listaPlataformas()
        vehiculo()
        calcularIva()
        validacionCedula()
    }
}

/*
- Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
*/



// - Validar si una persona es mayor o menor de edad
fun validarEdadPersona(){

    var edad = 18
    if (edad > 0 && edad <18) {
      println("Usuario menor de edad")
    }else if(edad >= 18) {
        println("Usuario mayor de edad")
    }

}

// - Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
fun tablaMultiplicar(){
    var numero = 6
    var tabla = arrayListOf("")
    var cadena = ""
    println("Tabla de multiplicar de numero $numero")
    println("Tabla ascendente")

    for(num in 1..12 ){
        var result =  numero * num
        cadena = "$numero * $num = $result"
        tabla.add(cadena)
    }
    println(cadena)
    var tablaDescendente = tabla.asReversed()
    println("Tabla descendente")
    for(item in tablaDescendente){
        println(item)
    }
}

//- Mostrar el listado de paralelo de la materia de Plataformas móviles y los
// subgrupos por proyectos (Mostrar los resultados ordenados).
fun listaPlataformas(){
    val nombres = mapOf(
        "Eric Alvarado" to "P1",
        "Miguel Caraguay" to "P1",
        "Carlos Castillo" to "P2",
        "Erick Cuenca" to "P2",
        "Anthony Espinoza" to "P1",
        "Jhoselin Guachizaca" to "P1",
        "Steven Jara" to "P1",
        "Sofia Jaramillo" to "P1",
        "Andres Jimenez" to "P2",
        "Diego Leiva" to "P1",
        "Mateo Martinez" to "P2",
        "Pablo Montaño" to "P1",
        "Rommel Ojeda" to "P2",
        "Joselito Ordeoñez" to "P1",
        "Bryan Rodriguez" to "P2",
        "Pablo Saraguro" to "P2",
        "Isaias Silva" to "P1")

    println("Listado de paralelo")
    for(item in nombres.toSortedMap()){
        println(item.key)
    }

    var grupos = nombres.toSortedMap()
    println("\nListado de grupos")
    for(item in grupos){
        println("${item.key} -> ${item.value}")
    }
}


// - Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
class Vehiculo {
    var marca: String = ""
    var anio: Int = 0
    var tipoVehiculo: String = ""
    var placa: String =""
}

fun vehiculo(){
    var vehiculo = Vehiculo()
    vehiculo.marca = "Hyundai"
    vehiculo.anio = 2012
    vehiculo.tipoVehiculo = "Particular"
    vehiculo.placa= "LBB-1234"
    var cadena = "Caracteristicas del vehiculo:\nMarca:${vehiculo.marca}\nAÑO:${vehiculo.anio}"+
            "\nTipo:${vehiculo.tipoVehiculo}\nPlaca:${vehiculo.placa}"
    println(cadena)
}
// calculo del 12% del iva
fun calcularIva(){
    var total = 100
    var iva = total * 0.12
    println("El 12% de $total es $iva ")
}

// validacion de la cedula
fun validacionCedula(){
    val cedula = listOf(1,1,0,5,7,2,1,9,1,2)
    val validacion = listOf(2,1,2,1,2,1,2,1,2)

    var result = 0

    for (i in 0..validacion.size-1){
        var aux = cedula[i] * validacion[i]
        if(aux >= 10){
            aux = aux - 9
        }
        result += aux
    }

    var valorRestar = ((result/10)+1)*10
    var valorComprobarCedula = cedula.last()
    var resultadoResta = valorRestar - result

    println("resultado $result")
    println("resta de $result - $valorRestar")
    if(valorComprobarCedula == resultadoResta){
        println(" $valorComprobarCedula == $resultadoResta Cedula valida" )
    }else{
        println("Cedula invalida")
    }
}
