package syntax.lesson_9_AND_OR;

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 3;

        //операции сравнения
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a <= b;

        // And(и) - &&, OR(или) - ||
        boolean aIsGreaterThanB = a > b;//True
        boolean aIsEqualOfB = a == b;//False
        // false - оба должны выводить True если вывод правда
        System.out.println(aIsGreaterThanB && aIsEqualOfB);
        // True - хотя бы одно вырожение должно быть правда чтоб было True
        System.out.println(aIsGreaterThanB || aIsEqualOfB);

        boolean logicalAND = aIsGreaterThanB && aIsEqualOfB;//Коньюнция
        boolean logicalOR = aIsGreaterThanB || aIsEqualOfB;//Дезъюнкция
        System.out.println("The result of expression: 10 > 3 AND 10 == 3 is "+logicalAND);
        System.out.println("The result of expression: 10 > 3 OR 10 == 3 is "+logicalOR);
    }
}

