/**
 * https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
package jzoffer;

import java.util.Stack;

class MinStack {

    private Stack<Integer> stack1;
    private Stack<Integer> minStack;
    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack1 = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(minStack.isEmpty()||x<minStack.peek()){
            minStack.push(x);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (!stack1.isEmpty()&&!minStack.isEmpty()){
            stack1.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
