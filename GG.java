import java.util.Scanner;

public class GG {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);

        System.out.print("Введите выражение: ");
        // isEmpty()
        while (true) {
            if (newInput.hasNextLine()){
                String expression = newInput.nextLine();
                newInput.close();
                System.out.println(expression);
            }
        }
    }    
}
