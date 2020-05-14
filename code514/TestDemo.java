package code514;


import java.util.Stack;

public class TestDemo {



    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if (ch=='{'||ch=='['||ch=='('){
                stack.push(ch);
            }
            if (ch=='}'||ch==']'||ch==')'){
                if (stack.empty()){         //右括号多
                    return false;
                }
                char ch1=stack.peek();
                if (ch1=='{'&&ch=='}'||ch1=='['&&ch==']'||ch1=='('&&ch==')'){
                    stack.pop();              //如果匹配移除栈顶
                }else {
                    return false;//不匹配情况
                }
            }
        }
        if (stack.empty()){//左括号多
            return true;
        }
        return false;
    }
}
