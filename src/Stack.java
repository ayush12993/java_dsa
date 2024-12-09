public class Stack {
    public int[] stack = new int[5];
    public int top=0;
    public int poppedElement=0;
    public int peekElement=0;

    public void push(int num){
        stack[top]=num;
        top++;
    }

    public int pop(){
        top--;
        poppedElement=stack[top];
        stack[top]=0;

        return poppedElement;
    }

    public int peek(){
        top--;
        peekElement=stack[top];
        top++;
        return peekElement;
    }
    public void preview(){
        for (int num: stack){
            System.out.print(num+" ");
        }
    }
}
