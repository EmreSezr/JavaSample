import java.util.LinkedList;
import java.util.Queue;

public class Bank {
    public static void main(String[] args) {
        // Queue yapısı oluşturalım (First-In-First-Out)
      /*Java'da bir banka senaryosunda müşterilerin işlemlerini gerçekleştirmek için kuyruk yapısı*/
        Queue<String> customers = new LinkedList<>();

        // Müşteriler bankaya gelir
        customers.add("Ahmet");
        customers.add("Mehmet");
        customers.add("Ali");
        customers.add("Osman");

        System.out.println("Bekleyen müşteriler: " + customers); // [Ahmet, Mehmet, Ali, Osman]
        System.out.println("İlk müşteri: " + customers.peek()); // "Ahmet"
        
        // Banka çalışanları işlemleri yapar
        customers.remove();
        customers.remove();
        customers.remove();
        customers.remove();

        System.out.println("Bekleyen müşteriler: " + customers); // []
