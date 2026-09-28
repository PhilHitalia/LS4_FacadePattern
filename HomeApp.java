public class HomeApp {
    public static void main(String[] args) {
        HomeInterface myHome = new HomeInterface();
        
        myHome.turnOnAll();
        System.out.println();
        myHome.turnOffAll();
    }
}