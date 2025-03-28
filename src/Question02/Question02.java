package Question02;

public class Question02 {
    public static void main(String[] args) {
        Stack stackS = new Stack(6);
        String wordArray[] = {"Department", "of", "Statistics", "and", "Computer", "Science"};
        for (String a : wordArray) {
            stackS.push(a);
        }
        System.out.println("");
        String fOut = "";
        while (!stackS.isStackEmpty()) {
            fOut += stackS.pop();
            fOut += " ";
            System.out.println("Output : " + fOut);
        }

    }
}
