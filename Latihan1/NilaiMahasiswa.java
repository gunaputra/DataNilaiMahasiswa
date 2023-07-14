package Latihan1;
import java.util.Scanner;

public class NilaiMahasiswa {
	public static void main(String [] args) {
		String idNama;
		int idNilai, idNim, delNim, upNim, finNim;
		
	DataMahasiswa db = new DataMahasiswa();
	Record record = new Record();
	
//	record.setIdNim(2101);
//	record.setIdNilai(100);
//	record.setNama("Udin");
	
	db.add(record);
	
	Scanner input = new Scanner(System.in);
	
	int option = 0;
	
	do {
		menu();
		option = input.nextInt();
	switch (option) {
	
// case 1	
	case 1:
		
		System.out.println("Masukkan NIM: ");
		idNim = input.nextInt();
		input.nextLine();
		
		System.out.println("Masukkan Nama: ");
		idNama = input.nextLine();
		
		System.out.println("Masukkan Nilai: ");
		idNilai = input.nextInt();
		input.nextLine();
		
		record = new Record(idNama, idNim, idNilai);
		db.add(record);
		System.out.println(record.toString());
		
		break;
		
//case 2			
	case 2:
		System.out.println("Masukkan NIM: ");
		delNim = input.nextInt();
		db.delete(delNim);
		
		break;
		
//case 3
	case 3:
		System.out.println("Masukkan NIM: ");
		upNim = input.nextInt();
		db.update(upNim, input);
		
		break;
		
//case 4
	case 4:
		System.out.println("Masukkan NIM: ");
		finNim = input.nextInt();
		if (!db.find(finNim)) {
			System.out.println("NIM Tidak Terdaftar!");
		}
		
		break;
	
//case 5
	case 5:
		db.display();
		
		break;
		
//case 6
	case 6:
		System.out.println("Menutup Aplikasi...");
		System.exit(0);
		
		break;
	
//default	
	default:
		System.out.println("Input Salah!");
		
		break;
		}
	}
	while (option !=6);
}

public static void menu() {
	//Tampilan Console
	System.out.println("====== Menu =======");
	System.out.println("1: Masukkan Data");
	System.out.println("2: Hapus Data");
	System.out.println("3: Perbarui Data");
	System.out.println("4: Cari Data");
	System.out.println("5: Tampilkan Data");
	System.out.println("6: Keluar");
	System.out.println("===================");
	System.out.println("Masukkan pilihan: ");
	}
}