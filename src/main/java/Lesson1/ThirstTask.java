package Lesson1;

public class ThirstTask {

    public static void main(String[] args) {
        String s = " a goo byu ";
        String st = reverseWords(s);
        System.out.println(st);
    }

    public static String reverseWords(String s) {
        int i = 0;
        int n = s.length();
        String result = new String();

        while (i < n) { // пока не конец строки
            while (i < n && s.charAt(i) == ' ')
                i++; // если не конец строки и символ строки НЕ буква, то двигаем указатель начало слова вправо
            if (i >= n) break; // если указатель больше длины строки - выходим
            int j = i + 1; // когда пробелы кончаются надо встать на букву, поэтому +1
            while (j < n && s.charAt(j) != ' ')
                j++; // если буква, то двигаем указхатель конца слова вправо, пока не встретим пробел
            String sub = s.substring(i, j); // создаем новую строку равную длине слова из старой строки s (от указателя начала слова до указателя конца слова)
            if (result.length() == 0) result = sub; // если длшина рез-щей строки равна 0, то в неё помещаем одно слово
            else result = sub + " " + result; // иначе добавляем пробел
            i = j + 1; // начало след. слова будет = конец текущего слова +1
        }
        return result; // возвращаем результирующую строку
    }
}
