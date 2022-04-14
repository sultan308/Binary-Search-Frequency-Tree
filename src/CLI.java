import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        BST bst = new BST();
        int value;
        int freq;
        while(running)
        {
            String input = sc.next();
            switch(input.trim()) {
                case "0":
                    running = false;
                    break;
                case "1":
                    value = sc.nextInt();
                    bst.add(value);
                    break;
                case "2":
                    value = sc.nextInt();
                    System.out.println(bst.findFreq(value));
                    break;
                case "3":
                    System.out.println(bst.getMax());
                    break;
                case "4":
                    System.out.println(bst.getMin());
                    break;
                case "5":
                    System.out.println(bst.preOrder());
                    break;
                case "6":
                    System.out.println(bst.postOrder());
                    break;
                case "7":
                    System.out.println(bst.inOrder());
                    break;
                case "8":
                    value = sc.nextInt();
                    bst.remove(value);
                    break;
                default:
                    running =true;
            }
        }
    }
}
