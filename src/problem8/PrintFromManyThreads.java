package problem8;

public class PrintFromManyThreads {
    public static void main(String[]args){
        Thread threadone  = new Thread(){
          @Override
          public void run(){
              System.out.println(1);
              System.out.println(4);
              System.out.println(7);
          }
        };
        Thread threadTwo = new Thread(){
            @Override
            public void run(){
                System.out.println(2);
                System.out.println(5);
                System.out.println(8);
            }
        };
        Thread threadThree = new Thread(){
            @Override
            public void run(){
                System.out.println(3);
                System.out.println(7);
                System.out.println(9);

            }
        };
        synchronized(PrintFromManyThreads.class){
            threadone.start();
            threadTwo.start();
            threadThree.start();
        }
    }
}
