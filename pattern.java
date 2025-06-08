public class pattern {

    public static void main(String[] args) {
        convinceHer();
    }

    public static String[] whyAreYouAngry() {
        return new String[]{
            "I said something stupid 🙈",
            "I forgot something important 😢",
            "I messed up somehow (again) 😅"
        };
    }

    public static String apology() {
        return "I'm really really sorry 😞\nPlease forgive me? 🥺";
    }

    public static void convinceHer() {
        System.out.println("Hey, bestie 💖");
        System.out.println("I know you're upset. Here's my guess why:");

        for (String reason : whyAreYouAngry()) {
            System.out.println("- " + reason);
        }

        System.out.println("\nNo excuses. Just one thing:");
        System.out.println(apology());

        System.out.println("\nIf yes, smile 😊. If not, I'll keep trying 💪");
    }
}
