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
        System.out.println("The string contains \"World\": " + greeting.contains("world"));

        // toUpperCase() - все буквы переменной greeting становятся заглавными
        String greetingWithUpperCase = greeting.toUpperCase();
        System.out.println(greetingWithUpperCase);
        System.out.println("The string contains \"World\": " + greetingWithUpperCase.contains("WORLD"));

        // toLowerCase() - все буквы переменной greeting становятся строчными
        String greetingWithLowerCase = greeting.toLowerCase();
        System.out.println(greetingWithLowerCase);
        System.out.println("The string contains \"World\": " + greetingWithLowerCase.contains("world"));

        //удаление пробелов (trim)
        var login = "    Djamal_Naurbiev     ";
        System.out.println(login);
        String loginAfterTrim = login.trim();
        System.out.println(loginAfterTrim);

        //replace - замена знако, в данном примере заменили "_" на "."
        var loginAfterReplace = login.trim().replace("_", ".");
        System.out.println("loginAfterReplace " + loginAfterReplace);


        // StringBuffer - для многопоточного программирования
        StringBuilder sb = new StringBuilder("     Hello,");
        sb.append("Djamal");
        sb.append(" ");
        sb.append("Naurbiev!              ");
        System.out.println(sb);


    }
}
