package com.example.practica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // validarEdadPersona()
        // tablaMultiplicar()
        // calcularIva()
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
    var numero = 4
    println("Tabla de multiplicar de numero $numero")
    for(num in 1..numero ){
        var result =  numero * num
        println("$numero * $num = $result")
    }
}

//- Mostrar el listado de paralelo de la materia de Plataformas móviles y los
// subgrupos por proyectos (Mostrar los resultados ordenados).

// calculo del 12% del iva

fun calcularIva(){
    var total = 100
    var iva = total * 0.12
    println("El 12% de $total es $iva ")
}

// validacion de la cedula

fun validacionCedula(){
    val cedula = listOf(1,1,0,4,8,1,3,2,5,6)
    val validacion = listOf(2,1,2,1,2,1,2,1,2)


    var result = 0

    for (i in 0..validacion.size){
        var aux = cedula[i] * validacion[i]
        if(aux > 10){
            var values = aux.toString().split("")
            var newlist = values.subList(1,3)
            for

            println("meme ${newlist}, $aux")
        }
        println(aux)

        result += aux
    }
    println("resultado $result")

}