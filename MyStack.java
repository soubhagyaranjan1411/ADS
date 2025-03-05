
public class MyStack {
    public static void main(String[] args) {
        java.util.Stack<Object> n = new java.util.Stack<>();
        n.push(1);
        n.push(1);
        n.push("Srj");
        System.out.println(n);
        System.out.println(n.peek());
        n.pop();
        System.out.println(n);
        System.out.println(n.isEmpty());
        n.pop();
        n.pop();
        System.out.println(n.isEmpty());
    }
}