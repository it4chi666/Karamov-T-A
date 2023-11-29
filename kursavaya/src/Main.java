import javax.swing.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SpecialCharactersUI appUI = new SpecialCharactersUI();
                appUI.initUI();
            }
        });
    }

    public static HashSet<Character> findSpecialCharacters(String text) {
        HashSet<Character> specialCharacters = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                specialCharacters.add(ch);
            }
        }

        return specialCharacters;
    }
}
