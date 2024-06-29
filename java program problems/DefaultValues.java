public class DefaultValues {
    int defaultInt;
    byte defaultByte;
    short defaultShort;
    long defaultLong;
    double defaultDouble;
    float defaultFloat;
    char defaultChar;

    public static void main(String[] args) {
        DefaultValues defaults = new DefaultValues();
        System.out.println("Default int: " + defaults.defaultInt);
        System.out.println("Default byte: " + defaults.defaultByte);
        System.out.println("Default short: " + defaults.defaultShort);
        System.out.println("Default long: " + defaults.defaultLong);
        System.out.println("Default double: " + defaults.defaultDouble);
        System.out.println("Default float: " + defaults.defaultFloat);
        System.out.println("Default char: [" + defaults.defaultChar + "]");
    }
}
