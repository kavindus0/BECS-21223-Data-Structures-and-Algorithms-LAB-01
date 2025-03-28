package Question01;
public class Stack {
    private int top;
    private int maxSize;
    private char[] charArr;

    public Stack(int size) {
        this.maxSize = size;
        charArr = new char[maxSize];
        top=-1;
    }

    public boolean isStackEmpty(){
        return top==-1;
    }


    public boolean isStackFull(){
        return top==maxSize-1;
    }

    public int getTop() {
        return top;
    }

    public void push(char newValue){
        if (isStackFull()){
            System.out.println("Stack Already Full");
        }
        else {
            System.out.println("Inserting "+newValue);
            charArr[++top] = newValue;
        }
    }

    public char pop(){
        if (isStackEmpty()){
            System.out.println("Stack is Already Empty");
            return charArr[top];
        }
        else {
            System.out.println("Retrieving Value");
            return charArr[top--];
        }
    }

}
