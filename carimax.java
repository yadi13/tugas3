public class cariMAX {
    public static void main (String[] args){
    int angka1 = 40;
    int angka2 = 80;
    int angka3 = 30;
    
    int max = 0;
    
    max = angka1 >= max ? angka1 : max;
    max = angka2 >= max ? angka2 : max;
    max = angka3 >= max ? angka3 : max;
    
    System.out.println("Angka yang paling besar adalah" +max);
    }
}
