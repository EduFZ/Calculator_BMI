package br.com.empresa.liveimc

import kotlin.math.pow

fun bmiCalculate(weight: Double, height: Double): Double {

    return weight / height.pow(2.0)

}

fun bmiStatus(bmi: Double): String {

    return if (bmi <= 18.5) {
        "Você está abaixo do peso!"
    } else if (bmi >=18.6 && bmi < 25) {
        "Você está no peso ideal! Parabéns!!!"
    } else if (bmi >= 25 && bmi > 30) {
        "Você está levemente acima do peso!"
    } else if (bmi >= 30 && bmi < 35){
        "Obesidade grau I"
    } else if ( bmi >= 35 && bmi < 40) {
        "Obesidade grau II (severa)"
    } else {
        "Obesidade grau III (mórbida)"
    }

}