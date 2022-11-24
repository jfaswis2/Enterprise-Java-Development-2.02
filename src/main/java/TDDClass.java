import java.util.ArrayList;
import java.util.List;

public class TDDClass {

    public static List<Integer> oddArray(int n) {
        List<Integer> integers = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if (i % 2 != 0) {
                integers.add(i);
            }
        }
        return integers;
    }

    public static boolean keyWords(String input) {
        String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
                "synchronized", "boolean", "do", "if", "private", "this", "break",
                "double", "implements", "protected", "throw", "byte", "else", "import", "public",
                "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
                "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
                "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};

        String[] inputArray = input.replace(",", "").replace(".", "").split(" ");

        for (String i : inputArray) {
            for (String j : keywords) {
                if (i.equals(j)) return true;
            }
        }
        return false;
    }
}
