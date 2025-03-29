
package Question04;

import java.util.ArrayList;
import java.util.Collection;

// Write a program that reads a string
//and prints the vowels i
// in ascending order of the alphabet using two stacks.Example:Input:DIALOGUE Output:A E I O U
public class Question04 {
    int aCount=0;
    int eCount=0;
    int iCount=0;
    int oCount=0;
    int uCount=0;

    
 char[] vowelList = {'a','e','i','o','u'};

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
    
    Stack outputStack = new Stack(charArrayList.size());
    for (char c : charArrayList) {
        outputStack.push(c);
    }
    System.out.println(outputStack);


    


}
}