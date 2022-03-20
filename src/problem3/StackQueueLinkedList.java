package problem3;

import java.util.LinkedList;

public class StackQueueLinkedList {

    public static void main(String[] args){
       LinkedList<Integer> queueList = new LinkedList<>();
       for(int i =0; i < 10; i++)
       {
           queueList.add(i);
       }
       System.out.println("printing initial queue");
       System.out.println(queueList);
       System.out.println("Enqueuing queue");
       queueList.add(11);
       System.out.println(queueList);
       System.out.println("dequeuing queue");
       queueList.removeFirst();
       System.out.println(queueList);

       LinkedList<Integer> stackedList = new LinkedList<>();
        for(int i =0; i < 10; i++)
        {
            stackedList.add(i);
        }
        System.out.println("printing inital stack");
        System.out.println(stackedList);
        System.out.println("pushing integer to stack");
        stackedList.addFirst(11);
        System.out.println(stackedList);
        System.out.println("popping integer off stack");
        stackedList.removeFirst();
        System.out.println(stackedList);
    }
}
