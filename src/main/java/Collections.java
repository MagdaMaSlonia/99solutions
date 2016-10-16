import java.util.HashMap;
import java.util.Map;

public class Collections {


    public Collections() {
        //tictactoe();
        //chess();
        //digitsToWords("35001922");
        //morse("I never saw a purple cow");
        //deMorse(".. / -. . ...- . .-. / ... .- .-- / .- / .--. ..- .-. .--. .-.. . / -.-. --- .-- ");
        //morseHash("I never saw a purple cow");
        deMorseHash(".. / -. . ...- . .-. / ... .- .-- / .- / .--. ..- .-. .--. .-.. . / -.-. --- .-- ");
    }

    private void deMorseHash(String toDecode) {

        HashMap<String, String> morse = new HashMap<String, String>();

        morse.put("a" , ".-");
        morse.put("b" , "-...");
        morse.put("c" , "-.-.");
        morse.put("d" , "-..");
        morse.put("e" , ".");
        morse.put("f" , "..-.");
        morse.put("g" , "--.");
        morse.put("h" , "....");
        morse.put("i" , "..");
        morse.put("j" , ".---");
        morse.put("k" , "-.-");
        morse.put("l" , ".-..");
        morse.put("m" , "--");
        morse.put("n" , "-.");
        morse.put("o" , "---");
        morse.put("p" , ".--.");
        morse.put("q" , "--.-");
        morse.put("r" , ".-.");
        morse.put("s" , "...");
        morse.put("t" , "-");
        morse.put("u" , "..-");
        morse.put("v" , "...-");
        morse.put("w" , ".--");
        morse.put("x" , "-..-");
        morse.put("y" , "-.--");
        morse.put("z" , "--..");
        morse.put(" " , "/");

        String words [] = toDecode.split(" / ");

        for (String word : words) {

            String letters [] = word.split(" ");

            for(String letter : letters) {


                for (Map.Entry<String, String> entry : morse.entrySet()) {
                    if (entry.getValue().equals(letter)) {
                        System.out.print(entry.getKey());
                    }
                }
            }
            System.out.print(" ");
        }
    }

    private void morseHash(String toCode) {

        HashMap<String, String> morse = new HashMap<String, String>();

        morse.put("a" , ".-");
        morse.put("b" , "-...");
        morse.put("c" , "-.-.");
        morse.put("d" , "-..");
        morse.put("e" , ".");
        morse.put("f" , "..-.");
        morse.put("g" , "--.");
        morse.put("h" , "....");
        morse.put("i" , "..");
        morse.put("j" , ".---");
        morse.put("k" , "-.-");
        morse.put("l" , ".-..");
        morse.put("m" , "--");
        morse.put("n" , "-.");
        morse.put("o" , "---");
        morse.put("p" , ".--.");
        morse.put("q" , "--.-");
        morse.put("r" , ".-.");
        morse.put("s" , "...");
        morse.put("t" , "-");
        morse.put("u" , "..-");
        morse.put("v" , "...-");
        morse.put("w" , ".--");
        morse.put("x" , "-..-");
        morse.put("y" , "-.--");
        morse.put("z" , "--..");
        morse.put(" " , "/");

        String [] letters = toCode.split("");

        for ( String letter : letters) {

            System.out.print(morse.get(letter.toLowerCase()));
        }
    }

    private void deMorse(String toDecode) {

        String lettersDict = "ABCDEFGHIJKLMNOPQRSTUVW";

        String morseCode [] = {".-","-...","-.-.","-..",".","..-.","--.", "....",
                 	    "..", ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                 	    "...","-","..-","...-",".--","-..-","-.--","--.."};

        String [] words = toDecode.split(" / ");

        for(String word: words) {
            String[] letters = word.split(" ");

            for (String letter : letters) {

                for(int i = 0; i < morseCode.length ; i++) {
                    if(letter.toUpperCase().equals(morseCode[i])) {
                        System.out.print(Character.toString(lettersDict.charAt(i)).toLowerCase());
                    }
                }

            }
            System.out.print(" ");
        }
    }


    private void morse(String toCode) {
        String lettersDict = "ABCDEFGHIJKLMNOPQRSTUVW";

        String [] morseCode = {".-", "-…", "-.-.", "-.. .", "..-.", "–.",
                                "…." ,"..", ".—", "-.-", ".-..", "—",
                                "-.", "—", ".–.", "–.-", ".-.", "…", "–",
                                "..-", "…-", ".–", "-..-","-.–","__.." };

        String [] words = toCode.split(" ");

        for(String word: words) {

            String[] letters = word.split("");

            for(String letter : letters) {

                for(int i = 0; i < lettersDict.length() ; i++) {
                    if(letter.toUpperCase().equals(Character.toString(lettersDict.charAt(i)))) {
                        System.out.print(morseCode[i]);
                    }
                }
            }
            System.out.print(" / ");
        }
    }

    //Three Five Oh Oh One Nine Two Two
    private void digitsToWords(String s) {
        String [] dictionary = {"Oh", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String digits [] = s.split("");

        for(String digit : digits) {
            int position = Integer.parseInt(digit);
            System.out.print(dictionary[position] + " ");
        }
    }

    private void chess() {
        String[][] grid = new String [8][8];

        for(int i = 0; i<grid.length; i++) {
            for (int j = 0; j<grid.length; j++) {

                if(isParzyste(i, j)) {
                    grid[i][j] = "O";
                } else if(isNieParzyste(i, j)) {
                    grid[i][j] = "X";
                }
            }
        }
        printArray(grid);
    }

    private boolean isNieParzyste(int i, int j) {
        return (i+j) % 2 == 1;
    }

    private boolean isParzyste(int i, int j) {
        return (i+j) % 2 == 0;
    }

    void tictactoe() {
        String [][] grid = new String[3][3];

        for(int i = 0; i<grid.length; i++) {
            for (int j = 0; j<grid.length; j++) {
                grid[i][j] = "X";
            }
        }
        printArray(grid);
    }

    private void printArray(String[][] grid) {
        for(int i = 0; i<grid.length; i++) {
            System.out.print("|");
            for (int j = 0; j<grid.length; j++) {
                System.out.print(grid[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }
}