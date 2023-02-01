import java.util.Stack;

public class Exam {
    public static void main(String[] args) {
        // Stack yapısı oluşturalım (Last-In-First-Out)
      
      /*Örnek olarak, bir sınavda sınavı alan öğrencilerin isimlerini bir Stack yapısında saklayalım.
      Öğrenciler sınavı almaya başladıklarında, isimleri Stack'e eklenir. Öğrenciler sınavı bitirdiklerinde, isimleri Stack'den çıkarılır.*/
      
        Stack<String> students = new Stack<>();

        // Öğrenciler sınava girer
        students.push("Ahmet");
        students.push("Mehmet");
        students.push("Ali");
        students.push("Osman");

        // Sınav biter
        System.out.println("Sınavı alan öğrenciler: " + students);
        System.out.println("Son giren öğrenci: " + students.peek()); // "Osman"
        
        // Öğrenciler sınavı bitirir
        students.pop();
        students.pop();
        students.pop();
        students.pop();

        System.out.println("Sınavı alan öğrenciler: " + students);  // []
    }
}
