import java.util.Scanner;

public class KalkulatorPajak {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pph, gaji, gajiTahun, pkp, ptkp, ptkpIstri, ptkpAnak, ptkpTotal;
		
		System.out.print("Masukan Gaji Bersih/Bulan : ");
		gaji = input.nextDouble();
		gajiTahun = gaji * 12;
		System.out.print("Apakah Sudah Menikah?(1 = sudah, 0 = belum) : ");
		ptkpIstri = input.nextInt();
		System.out.print("Berapa Anak Yang Dimiliki (0 - 3)?");
		ptkpAnak = input.nextInt();
		
		ptkp = 54000000;
		ptkpTotal = ptkp + (4500000*ptkpIstri) + (4500000*ptkpAnak);
		
		 if (gajiTahun< ptkpTotal){
            System.out.println("Kamu bebas pajak");
            input.close();
            return;
        }
		
		pkp = gajiTahun - ptkp;
		if (pkp < 50000000){
			pph = pkp * 0.05;
		} else if(gajiTahun < 250000000){
			pph = pkp * 0.15;
		} else if(gajiTahun < 500000000){
			pph = pkp * 0.25;
		} else{
			pph = pkp * 0.50;
		} 
		
		System.out.println("PTKP anda : "+ ptkp);
		System.out.println("pajak yang harus dibayar pertahun adalah : " + pph);
	}
}