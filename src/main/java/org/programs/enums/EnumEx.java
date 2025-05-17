package org.programs.enums;

enum Status2 {
    OPEN("Open"),
    CLOSED("Closed");

    private String displayName;

    Status2(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

public class EnumEx {
    public static void main(String[] s) {
        System.out.println(Status2.OPEN.getDisplayName() + " ordinal = " + Status2.OPEN.ordinal()); // Output: Open
        System.out.println(Status2.CLOSED.getDisplayName() + " ordinal = " + Status2.CLOSED.ordinal()); // Output: Open

        int num = 123;
        String strNum = String.valueOf(num); // strNum will be "123"
        System.out.println("strNum = " + strNum);

        double pi = 3.14159;
        String strPi = String.valueOf(pi); // strPi will be "3.14159"
        System.out.println("strPi = " + strPi);

        boolean flag = true;
        String strFlag = String.valueOf(flag); // strFlag will be "true"
        System.out.println("strFlag = " + strFlag);

        char[] charArray = {'a', 'b', 'c'};
        String strArray = String.valueOf(charArray); // strArray will be "abc"
        System.out.println("strArray = " + strArray);

        Object obj = null;
        String strObj = String.valueOf(obj); // strObj will be "null"
        System.out.println("strObj = " + strObj);
    }
}