//Elsie Urena
package sortinput;
import java.util.*;
public class SortInput {
    private static boolean isUniqueChar(String s){
        // Fill this part out
        //This method tells the user if there are duplicate letters by using 
        //true or false
        String temp = "";
    for (int i = 0; i < s.length(); i++){
        char current = s.charAt(i);
        if (temp.indexOf(current) < 0){
            temp = temp + current;
        } else {
            temp = temp.replace(String.valueOf(current), "");
             System.out.print(false + "   ");
             return false;
        }
      }
        System.out.print(true + "    ");
        return true;
    }
    private static String sortWord(String s){
        s=s.toLowerCase();
        char[] c = s.toCharArray();
        //Sorts the array alphabetically 
        Arrays.sort(c);
        //prints it sorted as well as converting upperCase toLowerCase
        System.out.println(String.valueOf(c));
        insertionSort(c);
        return "";
    }
    public static void insertionSort(char[] word) {
        if (word == null || word.length == 0)
            return;
        for (int i=0; i<word.length; i++) {
            char temp = word[i];
            int j = i;
            while (j>0 && word[j-1]>temp) {
                word[j] = word[j-1];
                j--;
            }
            word[j] = temp;
        }
        return;
    }
    public static void main(String[] args)throws Exception {
        //lines 43 to 46 scan the file
         java.io.File myFile;
        myFile=new java.io.File("C:\\Users\\reneg\\Desktop\\input.txt");
        System.out.println("Does this file exist?"+" "+ myFile.exists());
        Scanner scanner = new Scanner(myFile);
        // read in words and determine whether it is composed of unique 
        //characters
        //49 and below goes through each line and calls the other methods to do 
        //it's job
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            isUniqueChar(s);
            sortWord(s);
        }
      scanner.close();
    }
}