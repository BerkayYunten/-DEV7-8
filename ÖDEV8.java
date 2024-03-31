import java.util.Arrays; 
import java.util.Random; //random = 4...

public class ÖDEV8 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int boyut = random.nextInt(6); // 0-5 aralığında rastgele bir sayı seçip dizinin boyutunu belirler. değiştirilebilir.
       
        int[][] dizi = new int[boyut][boyut];//iki boyutlu dizi
        
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                dizi[i][j] = random.nextInt(10); // 0-9 aralığında rastgele sayılarla dizileri doldurur. değiştirilebilir.
            }
        }
        
        for (int i = 0; i < boyut; i++) {
            Arrays.sort(dizi[i]); //dizileri sıralar.
        }
       
        System.out.println("Sıralanmış Dizi:");
        for (int i = 0; i < boyut; i++) {
            System.out.println(Arrays.toString(dizi[i]));
        }
        
        // Diziyi çarpıp toplama
        int carpimToplam = 0;
        for (int i = 0; i < boyut; i++) {
            int carpim = 1;
            for (int j = 0; j < boyut; j++) {
                carpim *= dizi[i][j];
            }
            carpimToplam += carpim;
        }
        System.out.println("Çarpım Toplamı: " + carpimToplam);
    }
}