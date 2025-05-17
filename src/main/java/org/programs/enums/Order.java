package org.programs.enums;

enum OrderStatus {
    PENDING,
    PROCESSING,
    COMPLETED,
    FAILED
}

class OrderParent{
    void display() {
    System.out.println("Order Parent class..");
    }

}
class Order extends OrderParent{
    private int orderId;
    private OrderStatus orderStatus;

    public Order(int orderId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
    @Override
    void display() {
        System.out.println("Order class..");
    }
    public static void main(String[] args) {
        Order myOrder = new Order(123, OrderStatus.PENDING);
        System.out.println("Order status: " + myOrder.getOrderStatus()); // Output: Order status: PENDING
        myOrder.setOrderStatus(OrderStatus.PROCESSING);
        System.out.println("Order status: " + myOrder.getOrderStatus()); // Output: Order status: PROCESSING
        myOrder.setOrderStatus(OrderStatus.COMPLETED);
        System.out.println("Order status: " + myOrder.getOrderStatus());
        myOrder.setOrderStatus(OrderStatus.FAILED);
        System.out.println("Order status: " + myOrder.getOrderStatus());
        myOrder.display();
    }
}