package org.example.jetBrainsAcademy.lesson11;


class JavaArgumentTest {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3};
        System.out.println("address in memory " + tab);
        System.out.println("values: " + tab[0] + " " + tab[1] + " " + tab[2]);

        method(tab);   // copy of reference

        System.out.println("main again");
        System.out.println("address in memory " + tab);
        System.out.println("values: " + tab[0] + " " + tab[1] + " " + tab[2]);

        methodChangeValue(tab);

        System.out.println("main again");
        System.out.println("address in memory " + tab);
        System.out.println("values: " + tab[0] + " " + tab[1] + " " + tab[2]);

    }

    private static void method(int[] tab) {
        System.out.println("method copy of reference");
        System.out.println("address in memory " + tab);
        System.out.println("values: " + tab[0] + " " + tab[1] + " " + tab[2]);

        // bad example and code style with tab = new
        // https://checkstyle.sourceforge.io/config_coding.html#FinalLocalVariable
        tab = new int[]{4, 5, 6};
        System.out.println("pass new in method");
        System.out.println("address in memory " + tab);
        System.out.println("values: " + tab[0] + " " + tab[1] + " " + tab[2]);

    }

    private static void methodChangeValue(int[] tab) {
        System.out.println("Method change Value");
        System.out.println("address in memory " + tab);
        tab[0] = 9;
        System.out.println("values: " + tab[0] + " " + tab[1] + " " + tab[2]);

    }
}