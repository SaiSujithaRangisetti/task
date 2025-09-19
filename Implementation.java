package Tasks;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose which to test:");
        System.out.println("1. Custom Stack\n2. Custom List");
        System.out.print("Choice: ");
        int option = sc.nextInt();

        if (option == 1) {
            // Stack operations
            System.out.print("Enter size of stack: ");
            int size = sc.nextInt();
            CIEStack stack = new CIEStack(size);

            while (true) {
                System.out.println("\nChoose operation:");
                System.out.println("1. Push\n2. Pop\n3. Peek\n4. isEmpty\n5. isFull\n6. Display\n7. Exit");
                System.out.print("Choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        int val = sc.nextInt();
                        if (stack.Push(val)) {
                            System.out.println("Pushed: " + val);
                        } else {
                            System.out.println("Stack Overflow!");
                        }
                        break;
                    case 2:
                        int popped = stack.Pop();
                        if (popped != -1)
                            System.out.println("Popped: " + popped);
                        break;
                    case 3:
                        int peeked = stack.Peek();
                        if (peeked != -1)
                            System.out.println("Top element: " + peeked);
                        break;
                    case 4:
                        System.out.println(stack.isEmpty() ? "Stack is Empty" : "Stack is NOT Empty");
                        break;
                    case 5:
                        System.out.println(stack.isFull() ? "Stack is Full" : "Stack is NOT Full");
                        break;
                    case 6:
                        stack.Display();
                        break;
                    case 7:
                        System.out.println("Exiting Stack...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } else if (option == 2) {
            // List operations
            CustomList<String> list = new CustomList<>();

            System.out.print("How many elements do you want to add? ");
            int count = sc.nextInt();
            sc.nextLine();  // consume newline

            for (int i = 0; i < count; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                String element = sc.nextLine();
                list.add(element);
            }

            System.out.println("\nYour CustomList elements:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Element at index " + i + ": " + list.get(i));
            }

            // Optionally test removal
            System.out.print("\nDo you want to remove an element? (yes/no): ");
            String response = sc.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                System.out.print("Enter index to remove (0 to " + (list.size() - 1) + "): ");
                int removeIndex = sc.nextInt();
                try {
                    String removed = list.remove(removeIndex);
                    System.out.println("Removed element: " + removed);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid index.");
                }

                System.out.println("\nList after removal:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Element at index " + i + ": " + list.get(i));
                }
            }
        } else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }
}
