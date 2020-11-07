public class Main {
    public static void main(String[] args) {
        Customer drake = new Customer();
        drake.setMembership(new Silver());
        System.out.println(drake.toString());
        drake.setMembership(new Gold());
        System.out.println(drake.toString());

    }
}
