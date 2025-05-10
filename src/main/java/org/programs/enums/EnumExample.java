package org.programs.enums;

// Define an enum called "Status"
enum Status {
    PENDING,
    PROCESSING,
    COMPLETED,
    REJECTED
}

public class EnumExample {
    public static void main(String[] args) {
        // Declare a variable of type "Status" and assign it a value
        Status orderStatus = Status.COMPLETED;

        // Use a switch statement to check the value of the enum
        switch (orderStatus) {
            case PENDING:
                System.out.println("Order is pending.");
                break;
            case PROCESSING:
                System.out.println("Order is being processed.");
                break;
            case COMPLETED:
                System.out.println("Order is completed.");
                break;
            case REJECTED:
                System.out.println("Order is rejected.");
                break;
            default:
                System.out.println("Unknown order status.");
        }

        // Iterate over all the values of the enum
        System.out.println("\nAll possible order statuses:");
        //Enhanced For loop
        for (Status status : Status.values()) {
            System.out.println("Status = "+status +" Ordinal = "+status.ordinal());
        }
    }
}