public class Strings {


    public Strings() {
        //countWords("To jest moj super dlugi string");
        //countEs("I never saw a purple cow");
        //countChars("1984 by George Orwell.");
        //reverse("I never saw a purple cow");
        //isPalindrome("I never saw a purple cow");
        //isPalindrome("rotavator");
        //isPalindrome("Rise to vote, Sir!");
        //star("I never saw a purple cow");
        //spellOut("I never saw a purple cow");
        //encode("Hello World");
        decode("9 14,5,22,5,18 19,1,23 1 16,21,18,16,12,5 3,15,23");
    }

    private void decode(String toDecode) {

        StringBuilder decodedWord = new StringBuilder();

        String [] words = toDecode.split(" ");

        for (String word : words) {
            String [] letters = word.split(",");
            for (String letter : letters) {
                Integer asci = Integer.parseInt(letter);

                decodedWord.append(Character.toString((char)(asci.intValue() + 96)));
            }
            decodedWord.append(" ");
        }
        System.out.print(decodedWord);

    }

    private boolean isWhiteSpace(String toDecode, int i) {
        return Character.toString(toDecode.charAt(i)).equals(" ");
    }

    private void encode(String toEncode) {
        //8,5,12,12,15 23,15,18,12,4
        String code = "ABCDEFGHIJKLMNOPQRSTUVW";
        for (int i = 0; i < toEncode.length(); i++) {
            String letter = Character.toString(toEncode.charAt(i)).toUpperCase();
            if(!letter.equals(" ")) {
                System.out.print(code.indexOf(letter) + 1 + ", ");
            }
        }
    }

    private void spellOut(String sent) {
        //I N-E-V-E-R S-A-W A P-U-R-P-L-E C-O-W
        StringBuilder spellword = new StringBuilder();
        for (int i = 0; i < sent.length(); i ++) {
            spellword.append(Character.toString(sent.charAt(i)).toUpperCase());
            if(inScope(sent, i) && notWhiteSpace(sent, i+1)) {
                spellword.append("-");
            }
        }
        System.out.println(spellword);
    }

    private boolean notWhiteSpace(String sent, int i) {
        return !isWhiteSpace(sent, i);
    }

    private boolean inScope(String sent, int i) {
        return i+1 < sent.length();
    }

    private void star(String sent) {

        String starword = sent.replaceAll("[aeiou]", "*");
        System.out.println(starword);
    }

    private void isPalindrome(String word) {

        String trimedSentence = word.replaceAll("\\W", "" );
        String lowerCase = trimedSentence.toLowerCase();
        System.out.println(lowerCase);

        int maxLength = lowerCase.length();

        boolean itsPalindrom = true;

        for (int i = 0; i < maxLength; i++) {
            //System.out.println(lowerCase.charAt(i) + " " + lowerCase.charAt(maxLength-i-1));

            if(isParzyste(maxLength) && i == isSrodek(maxLength)) {
                continue;
            }

            if (lowerCase.charAt(i) != lowerCase.charAt(maxLength-i-1)) {
                itsPalindrom = false;
                System.out.println("False");
                break;
            }
        }
        if(itsPalindrom) {
            System.out.println("True");
        }
    }

    private int isSrodek(int maxLength) {
        return (maxLength/2)+1;
    }

    private boolean isParzyste(int maxLength) {
        return maxLength % 2 > 0;
    }

    private void reverse(String s) {
        StringBuilder reverseWord = new StringBuilder();
        for(int i = s.length()-1 ; i >= 0  ; i--) {
            reverseWord.append(s.charAt(i));
        }
        System.out.print(reverseWord);
    }

    private void countChars(String sentence) {
        String trimedSentence = sentence.replaceAll("\\W", "" );
        System.out.print(trimedSentence.length());
    }

    private void countEs(String s) {
        int counts = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(Character.toString(s.charAt(i)).equals("e")) {
                counts++;
            }
        }
        System.out.print(counts);
    }

    private void countWords(String sentence) {
        String[] wordsArray = sentence.split(" ");
        System.out.print(wordsArray.length);
    }
}
