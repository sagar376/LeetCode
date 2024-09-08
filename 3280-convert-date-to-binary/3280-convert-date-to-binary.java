class Solution {

    public String convertDateToBinary(String date) {
        // Extract year, month, and day from the date string
        int year = Integer.parseInt(date.substring(0, 4)); // Extract year
        int month = Integer.parseInt(date.substring(5, 7)); // Extract month
        int day = Integer.parseInt(date.substring(8, 10)); // Extract day

        // Convert each component to its binary representation
        String yearBinary = binary(year);
        String monthBinary = binary(month);
        String dayBinary = binary(day);

        // Concatenate the binary representations
        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }

    String binary(int num) {
        if (num == 0) {
            return "0"; // Handle the case where the input number is 0
        }

        StringBuilder bin = new StringBuilder(); // Use StringBuilder for efficient string concatenation

        while (num > 0) {
            int rem = num % 2; // Get the remainder (0 or 1)
            bin.insert(0, rem); // Insert the remainder at the start of the string
            num /= 2; // Divide the number by 2
        }

        return bin.toString(); // Convert StringBuilder to String
    }
}
