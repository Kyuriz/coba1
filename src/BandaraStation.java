import java.io.*;

class BandaraStation {

    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    // Program utama
    public static void main(String arg[]) {
        // Ciptakan objek
        Bandara bandara = new Bandara();

        // Penciptaan objek untuk pembacaan data dari keyboard
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(istream);

        int jamKeberangkatan = 0;
        int hariIndex = 0;

        try {
            // Baca jam keberangkatan dan maskapai
            System.out.println();
            System.out.print(CYAN + "Pilih Jam Keberangkatan"+ YELLOW+"\n1. 7:15  \n2. 8:10  \n3. 9:45  \n4. 10:30  \n5. 12:00 "+CYAN+"\nPilih :" + RESET);
            String cString = bufRead.readLine();
            jamKeberangkatan = Integer.parseInt(cString);

            System.out.println();
            System.out.print(CYAN + "Pilih Hari "+ YELLOW+"\n1. Senin  \n2. Selasa  \n3. Rabu  \n4. Kamis  \n5. Jumat \n6. Sabtu \n7. Minggu"+CYAN+" \nPilih :" + RESET);
            String vString = bufRead.readLine();
            
            hariIndex = Integer.parseInt(vString);

            // Manipulasi objek
            bandara.setStatusPenerbangan("TAKE OFF");  // hidupkan penerbangan
            bandara.setJamKeberangkatan(jamKeberangkatan); // set jam keberangkatan
            bandara.sethariIndex(hariIndex);  // set maskapai

            // Menampilkan hasil
            System.out.println();
            System.out.println(GREEN + "================================================================" + RESET);
            System.out.println(GREEN + "Status Penerbangan: " + RESET + bandara.getStatusPenerbangan());
            System.out.println(GREEN + "Jam Keberangkatan : " + RESET + bandara.getNamaJamKeberangkatan());
            System.out.println(GREEN + "Tujuan, Maskapai  : " + RESET + bandara.getNamaTujuan());
            System.out.println(GREEN + "Hari              : " + RESET + bandara.getNamaHari());
            System.out.println(GREEN + "================================================================" + RESET);
        } 
        catch (IOException err) {
            System.out.println(RED + "Proses pembacaan gagal!" + RESET);
        } 
        catch (NumberFormatException err) {
            System.out.println(RED + "Nilai input tidak valid!" + RESET);
        }
    }
}
