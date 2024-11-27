import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        int[] num = {1,3,6,8,19,9,10};
        Stack stack = new Stack();
        for (int i=0;i<num.length;i++){
            stack.push(num[i]);
        }
        System.out.println(stack);// yeh saare stack visible dega
        System.out.println(stack.peek());// yeh stack main se top waala dega
        System.out.println(stack.pop());// yeh stack main se top waala dega
        System.out.println(stack);// yeh saare stack visible dega
        System.out.println(stack.peek());// yeh stack main se top waala dega
        System.out.println(stack.isEmpty());// yeh stack main se top waala dega

    }
}

