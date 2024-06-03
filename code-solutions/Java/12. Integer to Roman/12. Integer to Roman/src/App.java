public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\n");

        String x = "hello world";
        System.out.println(x.substring(6, 9));

        System.out.println(intToRoman(4) + " should be IV");
        System.out.println(intToRoman(9) + " should be IX");
        System.err.println(intToRoman(3000) + " should be MMM");
        /*System.out.println(intToRoman(1) + " should be I");
        System.out.println(intToRoman(3) + " should be III");
        System.out.println(intToRoman(5) + " should be V");
        System.out.println(intToRoman(50) + " should be L");
        System.out.println(intToRoman(2723) + " should be MMDCCXXIII");
        System.out.println(intToRoman(4) + " should be IV");
*/
    }
    

    public static String intToRoman(int num){
        String total = "";
        while(num>=1000){
            total = total.concat("M");
            num -= 1000;
        }
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        total = total.concat(hundreds[(num%1000)/100]);
        total = total.concat(tens[(num%100)/10]);
        total = total.concat(units[num%10]);
        return total;
    }
}
