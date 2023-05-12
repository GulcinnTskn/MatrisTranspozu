import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 2x3'lük bir matris oluşturuyoruz.
        int[][] matris = {{1, 2, 3}, {4, 5, 6}};

        // Matrisin satırları ve sütunlarının sayısını alıyoruz.
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        // Transpozu alınacak matrisi ekrana bastırıyoruz.
        System.out.println("Matris:");
        for (int i = 0; i < satirSayisi; i++) {
            System.out.println(Arrays.toString(matris[i]));
        }

        // Transpozunu alacağımız matrisi oluşturuyoruz.
        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        // Transpoz matrisinin elemanlarını hesaplıyoruz.
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Transpozu alınmış matrisi ekrana bastırıyoruz.
        System.out.println("Transpoz Matris:");
        for (int i = 0; i < sutunSayisi; i++) {
            System.out.println(Arrays.toString(transpozMatris[i]));
        }
    }
}
