import java.util.LinkedList;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class homework_013 {
    public static void main(String[] args) {
        LinkedList<Integer> array = homework_012.generatorArray();
        System.out.println(array+"\n");
        
        enqueue1(array, 111);
        System.out.println("список после enquere1()\n" + array);
        System.out.println();

        enqueue2(array, 0);
        System.out.println("список после enquere2()\n" + array);
        System.out.println();
    
        System.out.println("удаленный dequeue() элемент\n" + dequeue(array));
        System.out.println("Список\n" + array);
        System.out.println();

        System.out.println("Значение полученное от first()\n" + first(array));
        System.out.println("Список\n" + array);
    }

    public static void enqueue1(LinkedList<Integer> arr, int elem) {
        // не совсем понял о чем речь
        // поэтому реализую два метода 
        // этот метод добавляет новый элемент в конец массива
        arr.addLast(elem);
    }

    public static void enqueue2(LinkedList<Integer> arr, int index) {
        // этот метод перемещает элемент из любого места в списке в конец
        int val = arr.get(index);
        arr.remove(index);
        arr.addLast(val);
    }

    public static int dequeue(LinkedList<Integer> arr) {
        int result = arr.getFirst();
        arr.removeFirst();
        return result;
    }

    public static int first(LinkedList<Integer> arr) {
        return arr.getFirst();
    }
}
