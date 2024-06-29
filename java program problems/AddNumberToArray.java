
    public class AddNumberToArray {
        public static void main(String[] args) {
            // Initial array
            int[] initialArray = {1, 2, 3, 4, 5};
    
            // Number to add
            int numberToAdd = 6;
    
            // Create a new array with an additional element
            int[] newArray = new int[initialArray.length + 1];
    
            // Copy elements from the initial array to the new array
            for (int i = 0; i < initialArray.length; i++) {
                newArray[i] = initialArray[i];
            }
    
            // Add the new number to the end of the new array
            newArray[newArray.length - 1] = numberToAdd;
    
            // Print the updated array
            System.out.println("Updated array:");
            for (int number : newArray) {
                System.out.print(number + " ");
            }
        }
    }
    

