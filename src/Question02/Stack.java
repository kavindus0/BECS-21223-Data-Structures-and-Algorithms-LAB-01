package Question02;
public class Stack {
    private int top;
    private int maxSize;
    private String[] StrArr;

    public Stack(int size) {
        this.maxSize = size;
        StrArr = new String[maxSize];
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

    public void push(String newValue){
        if (isStackFull()){
            System.out.println("Quest.Question02.Stack Already Full");
        }
        else {
            System.out.println("Inserting "+newValue);
            StrArr[++top] = newValue;
        }
    }

    public String pop(){
        if (isStackEmpty()){
            System.out.println("Quest.Question02.Stack is Already Empty");
            return StrArr[top];
        }
        else {
            // System.out.println("Retrieving Value");
            return StrArr[top--];
        }

    }


}
