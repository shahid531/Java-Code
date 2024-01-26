public class Duck implements Features, Fly {
    @Override
    public void walk() {
        System.out.println("walking");
    }

    @Override
    public void run() {
        System.out.println("running");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
