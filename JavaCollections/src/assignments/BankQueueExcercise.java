package assignments;


// Implement the BankQueue class and methods. Look at the main method
// for clues on what the methods need to do

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class BankQueue {

    Deque<String> customers = new LinkedList<>();

    public void addCustomer(String customerName) {
        customers.add(customerName);
    }

    //
    public String removeNextCustomer() {
        return customers.removeFirst();

    }

    public int getNumCustomers() {
        return customers.size();

    }

    public String peekNextCustomer() {
       return customers.peekFirst();
    }

    public String peekLastCustomer() {
       return customers.peekLast();

    }

    public void displayCustomers() {
       Iterator<String> iterator = customers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

public class BankQueueExcercise {
    public static void main(String[] args) {
        BankQueue queue = new BankQueue();

        // Add some customers to the queue
        queue.addCustomer("Christie");
        queue.addCustomer("Rowling");
        queue.addCustomer("Steel");

        // Display the number of customers in the queue
        System.out.println("Number of customers in the queue: " + queue.getNumCustomers());

        // Display the name of the next customer in the queue
        System.out.println("Next customer in the queue: " + queue.peekNextCustomer());

        // Display the name of the last customer in the queue
        System.out.println("Last customer in the queue: " + queue.peekLastCustomer());

        // Display the names of all the customers in the queue
        System.out.println("Customers in the queue:");
        queue.displayCustomers();

        // Remove the next customer from the front of the queue
        String nextCustomer = queue.removeNextCustomer();
        System.out.println("Removed customer: " + nextCustomer);

        // Display the updated number of customers in the queue
        System.out.println("Number of customers in the queue: " + queue.getNumCustomers());
    }
}
