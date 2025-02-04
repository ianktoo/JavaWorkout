public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        // Check if kiloByte is less than 0
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            // calculate
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB" );

        }
        // needs to calculate the megabytes and remaining kilobytes from kilobytes parameter
        // needs to print the message in the format "XX KB = YY MB and ZZ KB"
        // XX = kiloBytes
        // YY = megaBytes
        // ZZ = remaining kilobytes
        // 1MB = 1024 KB


        // if kilobyte is less than 0, then print  invalid value
    }
}
