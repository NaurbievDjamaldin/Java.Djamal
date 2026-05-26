package syntax.lesson_13_null;

public class NullDemo {
    public static void main(String[] args) {


        String nullabeString = null;
        //nullabeString.length();
        // так нельзя Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "String.length()" because "nullabeString" is null
        //at syntax.lesson_13_null.NullDemo.main(NullDemo.java:8)
        System.out.println(nullabeString);
        Integer nullableInt = null; // Integer - класс обертка
        System.out.println(nullableInt);
    }
}
