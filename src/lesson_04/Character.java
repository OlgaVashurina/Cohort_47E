package lesson_04;

public class Character {
    public static void main(String[] args) {

        // хранятся символы 1 символ, но это и числовой тип тоже.
        // хранятся коды символов, которые берутся из юникод. Хранится чило, по этому числу джава может преобразить в символ.
        // каждому символу соотвт.число, код символа.
        // с ним можно и как с числами и как с символами Сложить .делить. выводить. умножать
        // 2 байта занимает тип чар от 0 до 65 000 только плюс
// гибрид и как символ и как число
        //                 char phiCharacter = '\u03A6'; // число в десятиричном представлениее
        char a = 'A'; // переменная хранит букву А латинского алфавита
        char a1 = 65; //  в переменной так же распечаталась переменная буква в системе исчисления

// можно либо символ либо число
        char a2 = 0x41; // присваиваем число в 16-иричном формате . указывает что после 0ч будет число в шестнадцатиричном
        char a3 = '\u03A6';


        System.out.println(" А: " + a + "; a1: " + a1); //
        System.out.println(" a2: " + a2 + "; a3: " + a3); //

        char digit0 = 48;
        System.out.println(" digit0: " + digit0);

        // digit0 = digit0 + 5; // чар чар инт (все числа костируются к широкому типу в чар больше помещается
        // кастируется к инту  - у тебя слева чар а у меня справа инт

        digit0 += 5;
        System.out.println(" digit0: " + digit0);
        char letter = 97; //a
        letter++;
        System.out.printf("Буква" + letter);
        // от 0 до 9 коды от 48 до 57
        // от а до z коды от 97 до 122
        // от A до Z коды от 65 до 90

        char x1 = 12853;
        System.out.printf("Символ" + x1);

        int digit = 48;

       // System.out.printf(digit0++);
       // System.out.printf(digit0++);

    }
}
