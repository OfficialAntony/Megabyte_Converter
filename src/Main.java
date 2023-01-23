public class Main {
    public static void main (String[]args){
        printMegaByteAndKiloBytes(2500);
    }
    public static void printMegaByteAndKiloBytes(int KiloBytes){
        String xx = "KiloBytes",YY ="megabyte",ZZ ="remaining kilobyte";
        if (KiloBytes >=0) {
            int divide =1024;
            int Calculate = KiloBytes/ divide;
            int rem = KiloBytes -(Calculate * divide);
            System.out.print(KiloBytes + " " + xx + " = " + Calculate + YY +" and "+ ZZ+" = "+rem);
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}