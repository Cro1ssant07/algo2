import java.util.*;

public class MencariElemenGanda {
    // Fungsi untuk mencari elemen ganda pada array 1D
    public static void findDuplicates1D(int[] array) {
        Map<Integer, List<Integer>> elementIndices = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            elementIndices.computeIfAbsent(array[i], k -> new ArrayList<>()).add(i);
        }

        System.out.println("Duplikasi pada array 1D:");
        for (Map.Entry<Integer, List<Integer>> entry : elementIndices.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Elemen " + entry.getKey() + " ditemukan pada indeks: " + entry.getValue());
            }
        }
    }

    // Fungsi untuk mencari elemen ganda pada array 2D
    public static void findDuplicates2D(int[][] array) {
        Map<Integer, List<String>> elementIndices = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String index = "[" + i + "][" + j + "]";
                elementIndices.computeIfAbsent(array[i][j], k -> new ArrayList<>()).add(index);
            }
        }

        System.out.println("Duplikasi pada array 2D:");
        for (Map.Entry<Integer, List<String>> entry : elementIndices.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Elemen " + entry.getKey() + " ditemukan pada indeks: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        // Contoh array 1D
        int[] array1D = {1, 2, 3, 1, 4, 5, 2, 6, 3};
        findDuplicates1D(array1D);

        // Contoh array 2D
        int[][] array2D = {
            {1, 2, 3},
            {4, 1, 5},
            {6, 2, 3}
        };
        findDuplicates2D(array2D);
    }
}