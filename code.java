//Heres the code
public class Armstrong {
    public static void main(String[] args) {
        int number = 371; // Replace with your desired number
        int originalNumber = number;
        int remainder, result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // Cubing each digit
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
