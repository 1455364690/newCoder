package offer;
import javax.annotation.Resource;
import	java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author sunjh
 * @date 2019/9/27 22:48
 */
public class FindOdd {
    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));
        //System.out.println(list.remove(new Integer(2)));
    }
    public static String ReverseSentence(String str) {
        if("".equals(str)){
            return "";
        }
        Stack<String> stack = new Stack<>();
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(' ' == str.charAt(i)){
                if(buffer.length()!=0){
                    stack.push(buffer.toString());
                    buffer = new StringBuffer();
                }
                stack.push(" ");
                continue;
            }else{
                buffer.append(str.charAt(i));
            }
        }
        if (buffer.length()>0){
            stack.push(buffer.toString());
        }
        buffer = new StringBuffer(stack.pop());
        while(!stack.isEmpty()){
            buffer.append(stack.pop());
        }
        return buffer.toString();
    }
}
