package Collection.Stack;

import java.util.Stack;


//Java 中的集合框架提供了一個名為 Stack 的Class，
// 為我們提供了在堆疊中執行所有基本操作的方法。 下面用了push(), pop(); peek();

public class Stack_01 {


    public static void main(String[] args) {


        Stack<String> stack = new Stack<>();

        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        stack.push("Item 4");
        stack.push("Item 5");

        System.out.println("Topmost Element of the stack: " + stack.peek());

        stack.pop();

        System.out.println("After popping one item:");
        System.out.println("Topmost Element of the stack: " + stack.peek());
    }
}
