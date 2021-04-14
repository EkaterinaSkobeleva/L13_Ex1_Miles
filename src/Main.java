public class Main {
    public static void main(String[] args) {
        double ticketPrice = 5308.45;
        double moneyForMile = 20;
        long bonusMiles = Math.round(ticketPrice / moneyForMile);
        System.out.println(bonusMiles);
    }
}