package syntax.lesson_6_casting;

public class Variables {
    public static void main(String[] args) {
        // byte -128..127, больше 127 не пропустит/ 2^8 степени = 1 byte
        //System.out.println(integer.parseInt("11111111", 2)); - парсинг интеджер из целых чисел
        byte byteNumber = 127;
        System.out.println("The byte Number: "+byteNumber);
        //Short -32768..32767 больше 32767 не пропустит/ 2^16 степени = 2 bytes
        short shortNumber = 500;
        System.out.println("The short Number: "+shortNumber);
        //int (- 2 млрд .. 2 млрд)
        int intNumber = 500000000;
        System.out.println("The int Number: "+intNumber);
        //long 8 bytes
        long longNumber = 999_999_999L;
        System.out.println("The long Number: "+longNumber);
        //float 4 bytes
        float floatNumber = 3.14F;
        System.out.println("The float Number: "+floatNumber);
        //double 8 bytes
        double doubleNumber = 3.14;
        System.out.println("The double Number: "+doubleNumber);

        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.isNaN(1.0/0.0));

        // char - символный тип данных
        char charSymbol = 'A';
        System.out.println("The char variables: "+charSymbol);
        // Правда или Ложь
        boolean booleanVariable;
        booleanVariable = true;
        booleanVariable = false;
        System.out.println("The boolean variable is "+booleanVariable);

        int firstVar, lastVar;

        //casting

        short varForCasting = byteNumber;
        System.out.println("After casting varForCasting: "+ varForCasting);

        int intNewVar = varForCasting;
        System.out.println("After casting intNewVar: "+ intNewVar);

        int intVariable=6_000_012;
        byte byteNewVar = (byte) intVariable;
        System.out.println("After casting byteNewVar: "+ byteNewVar);

        var doubleVar = 4.18;
        int newInteger = (int) doubleVar;
        System.out.println("After casting newInteger: "+ newInteger);












    }
}
