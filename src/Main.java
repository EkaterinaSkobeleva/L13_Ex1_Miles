public class Main {
    public static void main(String[] args) {
        double ticketPrice = 6809;
        double moneyForMile = 20;
        int bonusMiles = (int) Math.floor(ticketPrice / moneyForMile);
        System.out.println(bonusMiles);
    }
}