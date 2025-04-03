package Question05;

public class Question05 {
    Stack stackforBin = new Stack(32);
    Stack stackforOctal = new Stack(32);
    StackString stack = new StackString(32);

    public void binaryConvert(int no){
        while(!(no==0)){
            stackforBin.push((char) (no%2));
            no /=2;
        }
        while (!stackforBin.isStackFull()){
            stackforBin.push(0);
        }
        while (!stackforBin.isStackEmpty()){
            System.out.printf(stackforBin.pop()+"");
        }
        System.out.println();
    }

    public void octalConvert(int no){
        while(!(no==0)){
            stackforOctal.push((char) (no%8));
            no /=8;
        }
        while (!stackforOctal.isStackFull()){
            stackforOctal.push(0);
        }
        while (!stackforOctal.isStackEmpty()){
            System.out.printf(stackforOctal.pop()+"");
        }
        System.out.println();

    }

    public void hexaConvert(int no) {
        while (!(no == 0)) {
            if (no % 16 == 10) {
                stack.push("A");
                no /= 16;
            } else if (no % 16 == 11) {
                stack.push("B");
                no /= 16;
            } else if (no % 16 == 12) {
                stack.push("C");
                no /= 16;
            } else if (no % 16 == 13) {
                stack.push("D");
                no /= 16;
            } else if (no % 16 == 14) {
                stack.push("E");
                no /= 16;
            } else if (no % 16 == 15) {
                stack.push("F");
                no /= 16;
            } else {
                stack.push(String.valueOf(no % 16));
                no /= 16;
            }
        }
            while (!stack.isStackFull()) {
                stack.push(String.valueOf(0));
            }
            while (!stack.isStackEmpty()) {
                System.out.printf(stack.pop() + "");
            }
            System.out.println();


    }
}