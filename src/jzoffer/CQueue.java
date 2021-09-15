/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
package jzoffer;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public CQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value){
        stack1.push(value);
    }
    public int deleteHead(){
        //stack2为空，将stack1所有元素压入stack1
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        //stack2为空，且无元素压入，则CQueue为空
        if(stack2.isEmpty()){
            return -1;
        }
        //stack2不为空，直接从栈顶弹出
        return stack2.pop();
    }
}
