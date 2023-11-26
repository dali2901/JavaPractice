package Collection.Stack;

import java.util.ArrayList;
import java.util.List;

//正常來說，push 操作是將一個元素新增到堆疊的最頂部位置，而 pop 操作刪除堆疊的最頂部元素。

//下方是用ArrayList 模擬  使用 Push Pop 堆疊

//寫一個StackPushPopExample
// push() 方法：用 int 當元素 並新增到我們建立的List的第一個位置。遵循Stack後進先出的概念，將每個元素新增到第一個位置，並移動舊元素。
//pop() 方法：首先檢查堆疊是否為空，如果不是，則刪除列表第0 index的元素 (用第第0 index元素模擬堆疊的最頂部元素
//peek()方法:   返回堆疊頂中最頂部的元素
// getAllItems() 方法:  拿取所有List元素
public class Stack_Use_ArrayList_Simulate {


    public static void main(String[] args) {
        StackPushPopExample stackPushPopExample = new StackPushPopExample(5);

        stackPushPopExample.push(2);
        stackPushPopExample.push(3);
        stackPushPopExample.push(4);
        stackPushPopExample.push(7);
        stackPushPopExample.push(1);
        System.out.println("Topmost Element of the stack: " + stackPushPopExample.peek());
        System.out.println("All Stack Items:");

        for (Integer allItem : stackPushPopExample.getAllItems()) {
            System.out.println(allItem);
        }

        stackPushPopExample.pop();
        System.out.println("All Stack Items After popping one item:");

        for (Integer allItem : stackPushPopExample.getAllItems()) {
            System.out.println(allItem);
        }
    }
}


class StackPushPopExample {
    private final List<Integer> intStack;


    public StackPushPopExample(int stackSize) {
        intStack = new ArrayList<>(stackSize);
    }

    public void push(int item) {
        intStack.add(0, item);
    }

    public int pop() {
        if (!intStack.isEmpty()) {
            int item = intStack.get(0);
            intStack.remove(0);
            return item;
        } else {
            return -1;
        }
    }

    public int peek() {
        if (!intStack.isEmpty()) {
            return  intStack.get(0);
        }else {
            return -1;
        }
    }

    public List<Integer> getAllItems(){
        return intStack;
    }

}

