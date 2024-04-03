package com.example;
public class ExamesLaboratoriais {

    public static String trigliceridesCalculo(int x) {
        if (x < 150) { // 1
            return "nível desejável"; // 2
        } else if (x < 199) { // 3
            return "nível limítrofe"; // 4
        } else if (x < 499) { // 5
            return "nível alto"; // 6
        } else {
            return "nível muito alto"; // 7
        }
    }

    public static String colesterolTotal(int y) {
        if (y < 200) { // 8
            return "nível desejável"; // 9
        } else if (y < 239) { // 10
            return "limítrofe"; // 11
        } else {
            return "elevado"; // 12
        }
    }

    public static String colesterolHDL(int z) {
        if (z < 40) { // 13
            return "baixo"; // 14
        } else if (z < 60) { // 15
            return "normal"; // 16
        } else {
            return "desejável"; // 17
        }
    }

    public static String colesterolLDL(int x) {
        if (x < 100) { // 18
            return "ótimo"; // 19
        } else if (x < 129) { // 20
            return "desejável"; // 21
        } else if (x < 159) { // 22
            return "limítrofe"; // 23
        } else if (x < 189) { // 24
            return "alto"; // 25
        } else {
            return "muito alto"; // 26
        }
    }

    public static String colesterolVLDL(int z) {
        if (z < 30) { // 27
            return "desejável"; // 28
        } else if (z < 40) { // 29
            return "limítrofe"; // 30
        } else {
            return "elevado"; // 31
        }
    }

    public static String glicose(int z) {
        if (z < 60) { // 32
            return "hipoglicemia"; // 33
        } else if (z < 99) { // 34
            return "desejável"; // 35
        } else if (z < 125) { // 36
            return "glicemia de jejum inapropriada"; // 37
        } else {
            return "diabetes"; // 38
        }
    
    }
}
