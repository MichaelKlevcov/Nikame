import java.util.Random;

import static Utils.Utils.generateText;
import static Utils.Utils.incrementCounter;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        String[] texts = new String[100000];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = generateText("abc", 3 + random.nextInt(3));
        }

        Thread palindrome = new Thread(()); -> {
             for (String text : texts) {
                 boolean b1 = !isSameChar(text);
                 boolean b = b1;
                 if (isPalindrome(text)) &&) {
                    incrementCounter(text.length());
                }
            }
        }}

    private static boolean isSameChar(String text) {
        return false;
    }

    private static boolean isPalindrome(String text) {
        return false;
    }

    ;
        palindrome.start();

        Thread sameChar = new Thread(()) -> {
        String[] texts;
        for (String text : texts) {
               if (isSomeChar(text))  {
                   incrementCounter(text.length());
               }
            }
        }

    private boolean isSomeChar(String text) {
        return false;
    }
};
        sameChar.start();

        Thread ascendingOrder = new Thread(()) -> {
             for (String text : texts) {
               if (isSomeChar(text)) && isAscendingOrder(text)) {
                   instantCounter(text.length());
               }
             }
        }};
        ascendingOrder.start();

        sameChar.join();
        ascendingOrder.join();
        palindrome.join();

        System.out.println("красивых слов с длиной 3" + counter 3);
        System.out.println("красивых слов с длиной 4" + counter 4);
        System.out.println("красивых слов с длиной 5" + counter 5);
    }
}