//hazır fonksiyon kullanmak(java.util.random) yasak olduğu için kendim doldurdum.
public class ÖDEV7 {
    
    public static void main(String[] args) {
        int[][] matris = {
            {22, 14, 56},
            {31, 1, 46},
            {5, 2, 98}
        }; //değerler değiştirilebilir.
        
        // Matrisin kendisini yazdıran kod
        System.out.println("2 Boyutlu Matrisin ilk hali:");
        yazdir(matris);
        
        // Matrisin küçükten büyüğe şekilde sıralanmış halini yazan kod
        matrisisirala(matris);
        System.out.println("Sıralanmış Matris:");
        yazdir(matris);
    }
    
    //VOİDLER(METODLAR) VE YAPTIKLARI İŞLER
    
    //MATRİSİ SIRALAYAN METOD
    public static void matrisisirala(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;
        int[] gecici = new int[satirSayisi * sutunSayisi];
        
        int index = 0;
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                gecici[index++] = matris[i][j];
            }
        }
        
        //TEK BOYUTLU DİZİYİ SIRALAR
        diziyisirala(gecici);
        
        //SIRALANMIŞ ELEMANLARI MATRİSE YERLEŞTİRİR
        index = 0;
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                matris[i][j] = gecici[index++];
            }
        }
    }
    
    //MATRİSİ EKRANA YAZDIRAN METOD 
    public static void yazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
    //DİZİYİ KÜÇÜKTEN BÜYÜĞE SIRALAYAN METOD
    public static void diziyisirala(int[] dizi) {
        int n = dizi.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (dizi[j] > dizi[j+1]) {
                    //DEĞİŞTİRME(swap)
                    int gecici = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = gecici;
                }
            }
        }
    }
    
}
