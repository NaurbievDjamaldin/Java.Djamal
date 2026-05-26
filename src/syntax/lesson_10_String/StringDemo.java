package syntax.lesson_10_String;

public class StringDemo {
    public static void main(String[] args) {
        String strName = "Djamal";
        String  strLastName = new String("Naurbiev");
        System.out.println(strName + " " + strLastName);
        //equals - для сравнения строк
        String  firstString = "Hello";
        var swcondString = "World";
        System.out.println(firstString.equals(swcondString));

        String  firstString_One = "Java";
        var swcondString_One = "java";
        System.out.println("Is two strings equals: " + firstString_One.equals(swcondString_One));
        // equalsIgnoreCase - игнорирует регистор
        System.out.println("Is two strings equals(ignoreCase): " + firstString_One.equalsIgnoreCase(swcondString_One));

        //получение размера строки
        System.out.println("The length of strName: " + strName.length());

        // Получение подстроки indexOf
        String greeting = "Hello, World!";
        //indexOf("W") - вычесляет индекс W и ! , индекс W = 7 , ! = 12
        String substring = greeting.substring(greeting.indexOf("W"), greeting.indexOf("!"));
        System.out.println(substring);

        //Проверка наличия подстроки .contains
        System.out.println("The string contains \"World\": " + greeting.contains("World"));


    }
}
