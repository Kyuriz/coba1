public class Bandara {
    // Deklarasi atribut
    private String statusPenerbangan;
    private int jamKeberangkatan;
    private int hariIndex;
  
    // Konstruktor
    public Bandara() {
      statusPenerbangan = "OFF";
      jamKeberangkatan = 0;
      hariIndex = 0;
    }
  
    // Selector
    public String getStatusPenerbangan() {
      return statusPenerbangan;
    }
  
    public String getNamaJamKeberangkatan() {
        // Menyimpan jam keberangkatan dengan format jam:menit
        String jam[] = {
            "7:15", "8:10", "9:45", "10:30", "12:00"
        };
        return jam[jamKeberangkatan - 1];
    }

    public String getNamaTujuan() {
      String tujuan[] = {"France, Air Asia", "North Korea, Lion Air", "Japan, Garuda Indonesia", 
                         "Rusia, Citilink", "South Korea, Batik Air "};
      return tujuan[jamKeberangkatan - 1];
    }
  
    public String getNamaHari() {
      String hari[] = {"Senin", "Selasa", "Rabu", 
                           "Kamis", "Jumat", "Sabtu", "Minggu"};
      return hari[hariIndex - 1];
    }
  
    // Mutator
    public void setStatusPenerbangan(String status) {
      statusPenerbangan = status;
    }
  
    public void setJamKeberangkatan(int jam) {
      jamKeberangkatan = jam;
    }
  
    public void sethariIndex(int index) {
      hariIndex = index;
    }
}