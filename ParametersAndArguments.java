public class ParametersAndArguments {
    
    // Method to calculate the area of a rectangle
    public static int calculateArea(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        // Declare variables
        int roomWidth = 10;
        int roomHeight = 15;

        // Calculate the area
        int area = calculateArea(roomWidth, roomHeight);

        // Print the result
        System.out.println("The calculated area is: " + area);
    }
}