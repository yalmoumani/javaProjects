// 1. Java String Program to Print Even-Length Words
package javaProjects.Basics;
public class EvenLegthWords{
    public static void printWords(String s) {

        // Split string into words
        String[] w = s.split(" ");

        // Create an array to store the length of each word
        int[] len = new int[w.length];

        // Calculate the length of each
      	// word and store in the array
        for (int i = 0; i < w.length; i++) {
            len[i] = w[i].length();
        }

        // Check if the length of each word
      	// is even and print if true
        for (int i = 0; i < w.length; i++) {
            if (len[i] % 2 == 0) {
                System.out.println(w[i]);
            }
        }
    }

    public static void main(String[] args) {
      
        String s = "i love java";
        printWords(s);
    }

   
}

// 2. Java String Program to Insert a String into Another String

public class InsertString{
    public static void Sentence1(String s1){
                   
    }
}

