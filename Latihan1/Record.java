package Latihan1;

 public class Record {
 private String nama;
 private int idNim, idNilai;
 
 public Record() {}
 public Record(String nama, int idNim, int idNilai) {
	 this.nama = nama;
	 this.idNim = idNim;
	 this.idNilai = idNilai;
 }

 public int getIdNim() {return idNim; }
 public void setIdNim(int idNim) {
	 this.idNim = idNim;
 }
 
 public int getIdNilai() {return idNilai; }
 public void setIdNilai(int idNilai) {
	 this.idNilai = idNilai;
 }
 
 public String getNama() {return nama;}
 public void setNama(String nama) {this.nama = nama;}
 	
 @Override public String toString()
 {

     // Returning the record
     return "Record{"
         + "Nama=" + nama + ", Nim=" + idNim
         + ", Nilai=" + idNilai + '}';
 }
}

