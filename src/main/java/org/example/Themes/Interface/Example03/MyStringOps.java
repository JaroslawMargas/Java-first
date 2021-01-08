package org.example.Themes.Interface.Example03;

//interfejs funkcyjny reprezentujący operacje na lancuchach
interface StringFunc {
    String func(String n);
}

// ta klasa definiuje metodę statyczną o nazwie strReverse()
class MyStringOps {

    //metoda statyczna odwracająca kolejność znaków w łańcuchu
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);
        return result;
    }
}

class MethodRefDemo {

    //ta metoda ma pierwszy parametr, którego typem
    //jest interfeks funkcyjny, a zatem można do niej przekazać
    //dowolną instancję tego interfejsu, w tym także referencję
    //do metody
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Wyrazenia lambda zwiekszaja mozliwosci Javy ;)";
        String outStr;

        //tutaj do wywołania metody stringOps() zostaje
        //przekazana referencja do metody strReverse

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Poczatkowy  lancuch: " + inStr);
        System.out.println("Lancuch odwrocony: " + outStr);
    }
}
