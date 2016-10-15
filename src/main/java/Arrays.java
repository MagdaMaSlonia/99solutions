
public class Arrays {

    public Arrays() {

        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String [] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};

        //printArray(breakfast);
        //lastElement(breakfast);
        //lastButOne(breakfast);
        //reverse(breakfast);
        //isPalindrome(palindromic);
        //isPalindrome(breakfast);
        //int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        //compress(nums);
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
        pack(letters);

    }

    private void pack(char[] letters) {
        String word = Character.toString(letters[0]);

        for (int i = 1; i < letters.length; i++) {

            if(letters[i] != letters[i-1]) {

                System.out.print(word + ", ");
                word = Character.toString(letters[i]);
            }
            else {
                word = word + Character.toString(letters[i]);
            }
        }
        System.out.print(word);
    }

    private void compress(int[] nums) {
        int length = nums.length;
        boolean isFirst;

        for(int digit = 0; digit < length; digit++){
            isFirst = true;
            for(int i = 0; i < digit; i++) {
                if(nums[i]==nums[digit]) {
                    isFirst = false;
                }}
            if(isFirst)
                System.out.println(nums[digit]);
        }
    }

    private void isPalindrome(String[] array) {
        int maxLength = array.length;
        if (maxLength % 2 == 0) {

            for(int counter = 0; counter < maxLength/2 ; counter ++ ) {
                //System.out.print(array[counter] + " " + array[maxLength-counter-1]);
                if(!array[counter].equals(array[maxLength-counter-1])) {
                    System.out.println("False");
                    return;
                }
            }
            System.out.println("True");
        }
        else {
            System.out.println("Array should be divided by 2");
            System.out.print("False");
        }
    }

    private void reverse(String[] breakfast) {
        for (int i = breakfast.length - 1 ; i >= 0 ; i--) {
            System.out.println(breakfast[i]);
        }
    }

    private void lastButOne(String[] breakfast) {
        int maxElem = breakfast.length;
        System.out.println(breakfast[maxElem-2]);
    }

    private void lastElement(String [] breakfast) {
        int maxElem = breakfast.length - 1;
        System.out.println(breakfast[maxElem]);
    }

    private void printArray(String [] breakfast) {
        for(String food: breakfast) {
            System.out.println(food);
        }
    }
}