package syntax.lesson_7_final;
// Объявление пакета, в котором находится класс Final.
// Это помогает организовать код и избежать конфликтов имен.

public class Final {
    // Объявление публичного класса Final. Имя класса совпадает с именем файла.

    public static void main(String[] args) {
        // Точка входа в программу. Метод main запускается при старте программы.
        // String[] args – массив аргументов командной строки.

        final int firsInt = 4,  secondInt = 8;
        // Объявляем две константы типа int: firsInt = 4, secondInt = 8.
        // Ключевое слово final значит, что их значение нельзя изменить после присвоения.

        System.out.println("firsInt= " + firsInt+", secondInt= "+secondInt);
        // Выводим в консоль значения переменных firsInt и secondInt.
        // Конкатенация строк с помощью +.

        // final var не изменяемая переменная, т.е значение не может быть изменено.
        final var nameOfBoss = "Djamal Naurbiev";
        // Используем var для автоматического определения типа (String),
        // final – значение переменной неизменяемо.
        // nameOfBoss хранит имя начальника.

        System.out.println(nameOfBoss);
        // Выводим значение nameOfBoss в консоль.
    }
}