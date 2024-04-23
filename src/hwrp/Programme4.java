package hwrp;

public class Programme4 {

        // 4.1 Declare two instance and two static variables
        private int instanceVar1 = 10;
        private String instanceVar2 = "Hello";
        private static double staticVar1 = 3.14;
        private static boolean staticVar2 = true;

        // 4.2 Declare one instance method
        public void instanceMethod() {
            // 4.4 Call instance and static variables inside the print statement
            System.out.println("Inside instance method:");
            System.out.println("Instance variable 1: " + instanceVar1);
            System.out.println("Instance variable 2: " + instanceVar2);
            System.out.println("Static variable 1: " + staticVar1);
            System.out.println("Static variable 2: " + staticVar2);
        }

        // 4.3 Declare one static method
        public static void staticMethod() {
            // 4.4 Call instance and static variables inside the print statement
            System.out.println("Inside static method:");
            // In a static method, instance variables cannot be accessed directly
            // So, we need to create an object to access instance variables
            Programme4 example = new Programme4();
            System.out.println("Instance variable 1: " + example.instanceVar1);
            System.out.println("Instance variable 2: " + example.instanceVar2);
            System.out.println("Static variable 1: " + staticVar1);
            System.out.println("Static variable 2: " + staticVar2);
        }

        // 4.5 Declare the Main method
        public static void main(String[] args) {
            // 4.6 Call both instance and static methods into the Main method and run the program
            Programme4 instance = new Programme4();
            instance.instanceMethod(); // Call instance method
            staticMethod(); // Call static method
        }
    }



