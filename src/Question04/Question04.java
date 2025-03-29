package Question04;

// Write a program that reads a string
//and prints the vowels i
// in ascending order of the alphabet using two stacks.Example:Input:DIALOGUE Output:A E I O U
public class Question04 {


public void VowelChecker(String inpString){

    Stack stack = new Stack(inpString.length());

    char[] inpStringArray = inpString.toCharArray();
   for (char c : inpStringArray) {
    stack.push(c);
   }

   System.out.println(stack);


}



}