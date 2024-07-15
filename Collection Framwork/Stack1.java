import java.util.Stack;

public class Stack1 { // Class name changed to avoid conflict

  public static void main(String[] args) {
    Stack<Object> stack = new Stack<>(); // Use generics for type safety

    System.out.println("Empty Stack: " + stack);

    stack.push(101);
    stack.push("Kavita");
    stack.push(6734);
    stack.push(-87.43f);

    System.out.println("After adding elements: " + stack);

    System.out.println("Iterating through the stack:");
    for (Object element : stack) { // Use enhanced for loop for cleaner iteration
      System.out.println(element);
    }

    System.out.println("Popped element: " + stack.pop()); // Print the popped element
    System.out.println("Stack after pop: " + stack);

    stack.pop();
    System.out.println("Stack after pop: " + stack);

    stack.pop();
    System.out.println("Stack after pop: " + stack);
  }
}
