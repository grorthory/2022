//Participants: Alex & Graham

import java.awt.*;

public class LetterCounter {

    static public void main(String[] unused){
        String[] filenames = {"2701-0.txt"};
        int[] letters = new int[26];
        for (int i = 0; i<filenames.length; i=i+1) {
            StdOut.println(filenames[i]);
            In file = new In(filenames[i]);
            while (!file.isEmpty()){
                String s = file.readLine().toLowerCase();
                for (int j = 0; j<s.length(); j=j+1) {
                    char c = s.charAt(j);
                    if(c>=97&&c<=122) {
                        letters[c - 97] = letters[c - 97] + 1;
                    }
                }
            }
        }
        int biggestY = 0;
        for (int i = 0; i < 26; i = i + 1) {
            if (letters[i]>biggestY){
                biggestY=letters[i];
            }
            StdOut.print((char) (i + 97));
            StdOut.println(": " + letters[i]);
        }
        StdOut.println(biggestY);
        StdDraw.setXscale(-5, 27);
        StdDraw.setYscale(0-(biggestY*0.1), biggestY*1.1);
        for (int i = 0; i < 26; i = i+1){
            StdDraw.setPenColor(Color.red);
            StdDraw.filledRectangle(i, letters[i]/2, .4, letters[i]/2);
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.rectangle(i, letters[i]/2, .4, letters[i]/2);
            StdDraw.text(i, 0-biggestY*0.05, String.valueOf((char)(i+97)));
        }
        StdDraw.text(-2, 0, "0");
        StdDraw.text(-2, biggestY*1.05, String.valueOf(biggestY));
        StdDraw.rectangle(12.5, biggestY/2, 13.5, biggestY/2);

    }

}
