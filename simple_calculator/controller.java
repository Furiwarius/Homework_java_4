package simple_calculator;
import java.util.logging.*;
import java.io.IOException;

public class controller {
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(controller.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler consolLogger = new FileHandler("calculator_log.xml");
        logger.addHandler(consolLogger);
        XMLFormatter xml = new XMLFormatter();
        consolLogger.setFormatter(xml);
        
        boolean flag = true;
        inputModule.commandOutput();
        while (flag){
            String newInput = inputModule.inputExpression();
            
            switch (inputModule.exitCheck(newInput)) {
                case -1:
                    flag=false;
                    break;
                case -2:
                    flag=false;
                    break;
                case 1:
                    int conclusion = treatmentModule.processing(newInput);
                    logger.info(createLog(newInput, conclusion));
                    System.out.println(conclusion);
                    break;
            }
        }
    }

    public static String createLog(String input, int conclusion) {
        StringBuilder log = new StringBuilder("Expression: ");
        log.append(input);
        log.append("=");
        log.append(conclusion);
        return log.toString();
    }
}

