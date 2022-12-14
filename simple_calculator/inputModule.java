package simple_calculator;

import java.util.Scanner;


public class inputModule {
    public static String inputExpression() {

        Scanner newInput = new Scanner(System.in);

        System.out.print("Введите выражение: ");

        while (true) {
            if (newInput.hasNextLine()){
                String expression = newInput.nextLine();
                if (!expression.isEmpty()){
                    return expression;
                }
                else{
                    clearScreen();
                    commandOutput();
                }
                
            }
        }
    }


    public static void commandOutput() {
        System.out.println("exit для завершения программы");
        System.out.println("+ используется для сложения");
        System.out.println("- используется для вычитания");
        System.out.println("* используется для умножения");
        System.out.println("/ используется для деления");
        System.out.println("Пример: 1+3");
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 

    public static Integer exitCheck(String str) {
        String exit = "exit";
        String cancel = "cancel";
        if (exit.equalsIgnoreCase(str)){
            return -1;
        } 
        if (cancel.equalsIgnoreCase(str)) {
            return -2;
        }
        else {
            return 1;
        }
    }

}
