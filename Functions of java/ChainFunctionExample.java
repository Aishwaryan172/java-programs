public class ChainFunctionExample {

    private String message;

    public ChainFunctionExample setMessage(String message) {
        this.message = message;
        return this; // Return the current instance for chaining
    }

    public ChainFunctionExample uppercase() {
        this.message = this.message.toUpperCase();
        return this; // Return the current instance for chaining
    }

    public ChainFunctionExample addExclamation() {
        this.message = this.message + "!";
        return this; // Return the current instance for chaining
    }

    public void displayMessage() {
        System.out.println("Message: " + this.message);
    }

    public static void main(String[] args) {
        ChainFunctionExample example = new ChainFunctionExample();
        
        // Method chaining example
        example.setMessage("hello")
               .uppercase()
               .addExclamation()
               .displayMessage();
    }
}