public class Main {

    public static void main(String[] args) {
        System.out.println(
                toString(
                        new Blue()
                )
        );
    }

    public static String toString(Color o) {
        return switch (o) {
            case Red r -> "Red";
            case Green g -> "Green";
            case Blue b -> "Blue";
            default -> "";
        };
    }
}
