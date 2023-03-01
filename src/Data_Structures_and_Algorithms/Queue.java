package Data_Structures_and_Algorithms;

class QueueImplement {
    String names[];     // Array called 'names'
    int head;           // An integer to keep track of the index of the first element in the queue
    int tail;           //  An integer to keep track of the index where the next element should be added to the queue

    public QueueImplement(){     //  Constructor method initializes the names array with a capacity of 10 and sets both head and tail to 0
        names = new String[10];
        head = 0;
        tail = 0;
    }

    public boolean isEmpty(){       // 'isEmpty' method checks whether the queue is empty by comparing head and tail and if they are equal the Queue is empty
        if (head == tail){
            return true;
        }
        return false;
    }

    public boolean isFull(){        //  'isFull' method checks whether the queue is full by comparing tail to the length of the names array and if they are equal the queue is full
        if (tail == names.length){
            return true;
        }
        return false;
    }

    public void enQueue(String name){   // 'enQueue' method adds an element to the end of the queue
        if (isFull()){
            System.out.println("The Queue is full");    // If the queue is full it prints a message saying that The Queue is full
        }
        else {
            names [tail++] = name;  //  Otherwise, it adds the element to the end of the queue and increments tail
        }
    }

    public String deQueue(){    // 'deQueue' method removes and returns the first element in the queue
        if (isEmpty()){
            System.out.println("No values to be removed");  // If the queue is empty, it prints a message saying that there are no elements to be removed and returns null
            return null;
        }
        else {
            return names[head++];   // Otherwise, it returns the first element in the queue and increments head
        }
    }

    public void peek(){         // 'peek' method returns the value in front of the queue without removing it
        System.out.println("The value in front is " + names[head]); // It simply prints the first element in the queue
    }

    public void display(){      // This method prints all the elements of the queue from the front to the rear
        for (int c=head; c < tail; c++) {
            System.out.println("Name is "+names[c]);
        }
    }
}
public class Queue {
    public static void main (String [] args){
        QueueImplement queueImplement = new QueueImplement();
        queueImplement.isEmpty();
        queueImplement.isFull();
        queueImplement.enQueue("Jhon");
        queueImplement.enQueue("Player");
        queueImplement.enQueue("Jhonny");
        queueImplement.enQueue("Walker");
        queueImplement.enQueue("Vodka");
        queueImplement.enQueue("Whisky");
        queueImplement.enQueue("Rum");
        queueImplement.enQueue("Brandy");
        queueImplement.enQueue("Gin");
        queueImplement.enQueue("Beer");
        queueImplement.deQueue();
        queueImplement.peek();
        queueImplement.display();
    }
}