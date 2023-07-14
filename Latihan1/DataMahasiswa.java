package Latihan1;
import java.util.Scanner;
import java.util.LinkedList;

public class DataMahasiswa {

	LinkedList<Record> list;
	
	public DataMahasiswa() {
		list = new LinkedList<>();
	}
	
	public void add(Record record){
		if (!find(record.getIdNim())) {
			list.add(record);
		}
		else {
			System.out.println("Nim sudah ada!");
		}
	}
	
	public boolean find(int idNim){
		for (Record I: list){
			if (I.getIdNim() == idNim){
				System.out.println(I);
				return true;
			}
		}
		return false;
	}
	
	public void delete(int recIdNim){
		Record recordDel = null;
		for (Record II: list){
			if (II.getIdNim() == recIdNim){
				recordDel = II;
			}
		}
		
		if (recordDel == null){
			System.out.println("NIM Salah!");
		}
		else {
			list.remove(recordDel);
			System.out.println("NIM Berhasil Dihapus!");
		}
	}
	
	public Record findRecord(int idNim){
		for (Record I : list){
			if (I.getIdNim() == idNim){
				return I;
			}
		}
		return null;
	}
	
	public void update(int id, Scanner input){
		if (find(id)) {
			Record rec = findRecord(id);
			
			System.out.println("Masukkan NIM: ");
			int idNim = input.nextInt();
			input.nextLine();
			
			System.out.println("Masukkan Nilai: ");
			int idNilai = input.nextInt();
			input.nextLine();
			
			System.out.println("Masukkan Nama: ");
			String nama = input.nextLine();
			
			rec.setIdNim(idNim);
			rec.setIdNilai(idNilai);
			rec.setNama(nama);
			System.out.println("Data Berhasil di Update!");
		} else {
			System.out.println("Data Tidak Ditemukan!");
		}
	}
	
	public void display () {
		if (list.isEmpty()) {
			System.out.println("Tidak Ada Data Dalam List!");
		}
		for (Record record : list){
			System.out.println(record.toString());
		}
	}
}