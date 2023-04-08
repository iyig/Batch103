package praticejava;

public class C015_Arrays {

    /*
    Aşağıdaki multi dimensional arrayların iç arraylerinde aynı indexe sahip elemanların toplamını yazdıran bir
    program yazın
    int arr1[][]= {{1,2},{3,4,5}
    int arr2[][]={{7,8,9},{10,11},{12}
 */

    public static void main(String[] args) {
        int arr1[][] = {{1, 2}, {3, 4, 5}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int sinir = 0;
        int toplam = 0;
        if (arr1.length <= arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                sinir = arr1[i].length;

                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(i + "," + j + "indexindeki elemanların toplamı" + toplam);
                }
            }
        } else {

            for (int i = 0; i < arr2.length; i++) {
                sinir = arr1[i].length;

                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(i + "," + j + "indexindeki elemanların toplamı" + toplam);
                }
            }
        }

    }
}

