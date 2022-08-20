package br.com.empresa.liveimc

import kotlin.math.pow

fun bmiCalculate(weight: Double, height: Double): Double {

    return weight / height.pow(2.0)

}

fun bmiStatus(bmi: Double): String {

    return ""

}