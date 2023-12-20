import java.util.Scanner;
import java.util.Arrays;
public class Frekans {


    // Arrayin(dizinin) içine bakar ve value değişkeninin içinde olup olmadığını kontrol eder
    public static boolean isDuplicate(int[] array, int value ){
        for(int i = 0; i < array.length;i++){
            if(array[i] == value) return false;
        }
        return true;
    }

    // Bir array'in(dizideki) tüm elemanlarının kopyalarını siler,
    public static int[] unique(int[] array){
        int [] unique = new int[array.length];
        int count = 0;
        for(int i = 0; i < array.length;i++){
            if(isDuplicate(unique,array[i])){
                unique[count++] = array[i];
            }
        }
        return unique;
    }

    // Bir array içinde bir (value)değerden kaç tane olduğunu kontrol eder
    public static int count(int[] array, int value){
        int count = 0;
        for(int i = 0;i< array.length;i++){
            if(array[i]== value) count++;
        }
        return count;
    }

// Bir aray içinde kaç tane hiçbiriyle benzemeyen( unique ) elemanı olduğunu bulmak için
    public static int uniqueCount(int[] array){
        int [] unique = new int[array.length];
        int count = 0;
        for(int i = 0; i < array.length;i++){
            if(isDuplicate(unique,array[i])){
                unique[count++] = array[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength;

        System.out.print("Array uzunluğunu girin:  ");
        arrayLength = input.nextInt();

        int [] frekansArray = new int[arrayLength];

        // myArray i kullanıcıdan aldığımız değerlerle oluşturuyoruz.

        for(int i = 0; i < arrayLength;i++){
            System.out.print("Arrayın "+ (i+1) +". elemanını girin:  ");
            frekansArray[i] = input.nextInt();
        }
        // hiç eşi olmayan elemanların olduğu array
        int [] uniqueArray = new int[frekansArray.length];
        uniqueArray = unique(frekansArray);

        // kaç tane unique eleman varmış arrayde anlamak için  o sayıya göre uniqueArrayimizi kuracağız.
        int count = uniqueCount(uniqueArray);
        
        // UNİQUE ARRAY i oluşturduk
        uniqueArray = Arrays.copyOf(uniqueArray,count);
        System.out.println("Dizi: "+Arrays.toString(frekansArray));
        System.out.println("Tekrar Sayıları: ");

        for(int i = 0; i<uniqueArray.length;i++){
            System.out.println(uniqueArray[i]+" Sayısı "+count(frekansArray,uniqueArray[i])+" kere tekrar edildi");
        }
        }
    }

