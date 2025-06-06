package Question04;
import java.util.ArrayList;
import java.util.Collection;
public class Question04 {
    int aCount=0;
    int eCount=0;
    int iCount=0;
    int oCount=0;
    int uCount=0;


public void VowelChecker(String inpString){

    Stack stackForWord = new Stack(inpString.length());
    Stack stackForVowel = new Stack(inpString.length());

    char[] inpStringArray = inpString.toCharArray();
   for (char c : inpStringArray) {
    stackForWord.push(c);
   }

    ArrayList<Character> charArrayList = new ArrayList<>();


   
    for (char c : inpStringArray) {
        if (c=='a' && aCount == 0) {
            charArrayList.add(c);
            aCount++;
            } else if(c=='e'&& eCount==0){
                charArrayList.add(c);
                eCount++;
            } else if(c=='i'&& iCount==0){
                charArrayList.add(c);
                iCount++;
            } else if(c=='o'&& oCount==0){
                charArrayList.add(c);
                oCount++;
            } else if(c=='u'&& uCount==0){
                charArrayList.add(c);
                uCount++;
            }       
        }

        java.util.Collections.sort(charArrayList);

    for (Character character : charArrayList.reversed()) {
        stackForVowel.push(character);
    }
    while (!stackForVowel.isStackEmpty()) {
        System.out.printf(stackForVowel.pop()+"");
    }
    System.out.println();
}
}