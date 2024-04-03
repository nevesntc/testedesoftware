package com.example;
public class IMC {
        public String calcularIMC(double peso, double altura, String genero) {
            double imc = peso / (altura * altura);
    
            if (genero.equalsIgnoreCase("mulher")) { //1
                return calcularCondicaoMulheres(imc); //2
            } else if (genero.equalsIgnoreCase("homem")) {//3
                return calcularCondicaoHomens(imc);//4
            } else {
                return "Gênero inválido";//5
            }
        }
    
        public String calcularCondicaoMulheres(double imc) {
            if (imc < 19.1) {//6
                return "Abaixo do peso";//7
            } else if (imc < 25.8) {//8
                return "No peso normal";//9
            } else if (imc < 27.3) {//10
                return "Marginalmente acima do peso";//11
            } else if (imc < 32.3) {//12
                return "Acima do peso ideal";//13
            } else {
                return "Obeso";//14
            }
        }
    
        public String calcularCondicaoHomens(double imc) {
            if (imc < 20.7) {//15
                return "Abaixo do peso";//16
            } else if (imc < 26.4) {//17
                return "No peso normal";//18
            } else if (imc < 27.8) {//19
                return "Marginalmente acima do peso";//20
            } else if (imc < 31.1) {//21
                return "Acima do peso ideal";//22
            } else {
                return "Obeso";//23
            }
        }

    }
    
//complexidade ciclomática 23 + 1 = 24.
