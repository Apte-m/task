package task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonant = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            if (isVowel(inputText.charAt(i))) {
                vowels.append(inputText.charAt(i)).append(" ");
            } else if (inputText.charAt(i) != ' ') {
                consonant.append(inputText.charAt(i)).append(" ");
            }
        }
        System.out.print(vowels + "\n" + consonant);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}