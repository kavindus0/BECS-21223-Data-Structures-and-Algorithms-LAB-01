package Question01;
public class Question01 {
    public static void main(String[] args) {
        Stack stackS = new Stack(5);
        char wordArray[] = {'a','b','c','d','e'};
        for (char a: wordArray) {
            stackS.push(a);
        }
        System.out.println("");
        while (!stackS.isStackEmpty()){
            System.out.println(stackS.pop());
        }

    }
}
