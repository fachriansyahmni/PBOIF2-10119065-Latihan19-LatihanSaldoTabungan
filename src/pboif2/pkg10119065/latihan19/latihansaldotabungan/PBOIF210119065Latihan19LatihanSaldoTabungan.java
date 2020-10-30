package pboif2.pkg10119065.latihan19.latihansaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

 /*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan saldo tabungan 
 */
public class PBOIF210119065Latihan19LatihanSaldoTabungan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.print("Saldo Awal: Rp. ");
        int saldoAwal = sc.nextInt();  
        System.out.print("Bunga/Bulan(%): ");
        int bunga = sc.nextInt();  
        System.out.print("Lama (bulan): ");
        int totalBulan = sc.nextInt();  
        
        for(int i = 1; i <= totalBulan;i++){
           System.out.println("Saldo di bulan ke-"+i+" "+kursIndonesia.format(hitungSaldo(saldoAwal,bunga)));
           saldoAwal = hitungSaldo(saldoAwal,bunga);
        }
        
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
    public static int hitungSaldo(int saldo, int bunga){
        int Bunga = (saldo * bunga) / 100;
        int saldoTabungan = saldo + Bunga;
        return saldoTabungan;
    }
}
