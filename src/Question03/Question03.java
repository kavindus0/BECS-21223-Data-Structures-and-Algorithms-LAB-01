package Question03;

public class Question03 {

    public boolean IsPalindromeOrNot;
//    Write a program to check whether a given string is palindrome using Stack Operations.
//    Example: madam, mom, rotator (Any word that reads the same forward or backward)


    public boolean palindromeChecker(String obj) {
        char[] c = obj.toCharArray();
         Stack stackS = new Stack(c.length);
        for (char a:obj.toCharArray()){
            stackS.push(a);
        }
    System.out.println("Word: "+obj);
    while (!stackS.isStackEmpty()) {
        for (char a : obj.toCharArray()) {
            if (a != stackS.pop()) {
                IsPalindromeOrNot = false;
            } else {
                IsPalindromeOrNot = true;
            }

        }
    }

    return IsPalindromeOrNot;
    }

}

