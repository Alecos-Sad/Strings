package TxtProcessing;

import java.util.Arrays;

public class Demo {
    /**
     * Метод для подсчета количества появлений
     * символа в тексте:
     */
    static int count(CharSequence txt, char smb) {
        int res = 0;
        for (int k = 0; k < txt.length(); k++) {
            if (txt.charAt(k) == smb) {
                res++;
            }
        }
        return res;
    }

    /**
     * Метод для подсчета количества слов:
     */
    static int words(CharSequence txt) {
        return count(txt, ' ') + 1;
    }

    /**
     * Метод для поиска символа в тексте
     */
    static int[] find(String txt, char smb) {
        int[] res = {-1};
        int[] t;
        int k = 0;
        while (k < txt.length()) {
            if (txt.charAt(k) == smb) {
                res[0] = k;
                break;
            }
            k++;
        }
        while (k < txt.length() - 1) {
            k++;
            if (txt.charAt(k) == smb) {
                t = new int[res.length + 1];
                System.arraycopy(res, 0, t, 0, res.length);
                t[res.length] = k;
                res = t;
            }
        }
        return res;
    }

    /**
     * Метод для поиска разных букв в тексте
     */
    static char[] getSymbs(String txt) {
        String str = txt.toLowerCase();
        StringBuilder res = new StringBuilder();
        char s;
        for (int k = 0; k < str.length(); k++) {
            s = str.charAt(k);
            switch (s) {
                case ' ':
                case '.':
                case ',':
                case '?':
                case '!':
                case ':':
                case ';':
                case '-':
                    continue;

            }
            if (!res.toString().contains("" + s)) {
                res.append(s);
            }
        }
        return res.toString().toCharArray();
    }

    public static void main(String[] args) {
        String txt = "Я помню чудное мгновение";
        System.out.println(txt);
        char smb = 'н';
        System.out.printf("Поиск символа '%1$c' в тексте: %2$s\n", smb, Arrays.toString(find(txt, smb)));
        smb = 'ю';
        System.out.printf("Поиск символа '%1$c' в тексте: %2$s\n", smb, Arrays.toString(find(txt, smb)));
        smb = 'а';
        System.out.printf("Поиск символа '%1$c' в тексте: %2$s\n", smb, Arrays.toString(find(txt, smb)));
        String A = new String(txt);
        StringBuffer B = new StringBuffer(txt);
        StringBuilder C = new StringBuilder(txt);
        smb = 'о';
        System.out.printf("Букв '%1$c' в тексте: %2$s\n", smb, count(A, smb));
        smb = 'м';
        System.out.printf("Букв '%1$c' в тексте: %2$s\n", smb, count(B, smb));
        smb = 'ы';
        System.out.printf("Букв '%1$c' в тексте: %2$s\n", smb, count(C, smb));
        System.out.println("Слов тексте: " + words(txt));
        System.out.println("Буквы в тексте: " + Arrays.toString(getSymbs(txt)));
    }
}
