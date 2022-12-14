import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

public class homework_012 {

    public static void main(String[] args) {
        LinkedList<Integer> array = generatorArray();
        System.out.println(array);
        array = reverse(array);
        System.out.println(array);
        
    }

    public static LinkedList<Integer> generatorArray() {
        LinkedList<Integer> newArray = new LinkedList<>();
        int amount = (int) (Math.random()*15)+5; // [5:20]
        boolean flag = true;
        int value;
        for (int i = 0; i < amount; i++) {
            while (flag){
                value = (int) (Math.random()*50)+1; // [1:50]
                if (newArray.indexOf(value)==-1) {
                    newArray.add(value);
                    flag = false;
                }
            }
            flag = true;
        }
        return newArray;
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> array) {
        LinkedList<Integer> resultArray = new LinkedList<>();
        int first;
        int size = array.size();
        
        for (int i = 0; i < size; i++) {
            first = array.getLast();
            resultArray.addLast(first);
            array.removeLast();        
        }
        return resultArray;
    }
}