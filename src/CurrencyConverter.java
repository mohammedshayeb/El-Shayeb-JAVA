import javax.swing.JOptionPane;

public class CurrencyConverter {
    public static void main(String[] args) {
        try {
            // Prompt the user to enter the first number
            String input1 = JOptionPane.showInputDialog("Enter the first number:");

            // Prompt the user to enter the second number
            String input2 = JOptionPane.showInputDialog("Enter the second number:");

            // Convert the input strings to numbers
            double number1 = Double.parseDouble(input1);
            System.out.println(number1);
            double number2 = Double.parseDouble(input2);
            System.out.println(number2);

            // Prompt the user to choose the desired operation
            Object[] options = {"+", "-", "*", "/"};
            int choice = JOptionPane.showOptionDialog(null,
                    "Choose operation:", "Operation Selection",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
System.out.println(choice);
            // Perform the selected operation
            
            double result = 0.0;
            switch (choice) {
                case 0:
                    result = number1 + number2;
                    break;
                case 1:
                    result = number1 - number2;
                    break;
                case 2:
                    result = number1 * number2;
                    break;
                case 3:
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Division by zero!");
                        System.exit(1);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid operation!");
                    System.exit(1);
            }

            // Display the result
            JOptionPane.showMessageDialog(null, "Result: " + result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.");
            System.exit(1);
        }


    }
}
