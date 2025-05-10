package org.programs.dependencyinjection;

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        // Code to send email
        System.out.println("Email sent: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        // Code to send SMS
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private final MessageService messageService;

    // Constructor-based dependency injection
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating dependencies
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();

        // Injecting dependencies through constructor
        NotificationService notificationServiceWithEmail = new NotificationService(emailService);
        NotificationService notificationServiceWithSMS = new NotificationService(smsService);

        // Using the service
        notificationServiceWithEmail.sendNotification("Hello from email!");
        notificationServiceWithSMS.sendNotification("Hello from SMS!");
    }
}
