public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\n");

        String x = "hello world";
        System.out.println(x.substring(6, 9));

        System.out.println(intToRoman(4) + " should be IV");
        System.out.println(intToRoman(9) + " should be IX");
        /*System.out.println(intToRoman(1) + " should be I");
        System.out.println(intToRoman(3) + " should be III");
        System.out.println(intToRoman(5) + " should be V");
        System.out.println(intToRoman(50) + " should be L");
        System.out.println(intToRoman(2723) + " should be MMDCCXXIII");
        System.out.println(intToRoman(4) + " should be IV");
*/
    }
    
    public static int subtractiveForm(String s){
        int counter = 0;
        //System.out.println(s + "   " + s.length());
        //String x = "abcd";
        /*if(s.charAt(x.length()-1) == s.charAt(x.length()-1)){
            System.out.println("HELLO" + x.charAt(x.length()-1) + "  " +  x.charAt(x.length()-1));
        }*/
        
        for(int i = s.length(); i > s.length()-4; i--){
            //System.out.println(x.charAt(s.length()-1) + "  " + x.charAt(s.length()-1-counter) + "  " + counter);
            if(s.charAt(s.length()-1) == s.charAt((s.length() - 1 - counter))){
                counter++;
            }
            else{
                break;
            }
        }
        //System.out.println(counter);
        return counter;
    }
    public static String subtractFormTotal(String s){
        System.out.println(s.substring(0, s.length()-3));
        return s;
    }

    public static String intToRoman(int num){
        String total = "";
        int counter = 0;

        while(num > 0){



            if(num >=1000){
                total = total.concat("M");
                num -= 1000;
            }
            else if(num >= 500){
                total = total.concat("D");
                num -= 500;
            }
            else if(num >= 100){
                total = total.concat("C");
                num -= 100;
            }
            else if(num >= 50){
                total = total.concat("L");
                num -= 50;
            }
            else if(num >= 10){
                total = total.concat("X");
                num -= 10;
            }
            else if(num >= 5){
                total = total.concat("V");
                num -= 5;
            }
            else{
                total = total.concat("I");
                num -= 1;
            }
            counter ++;
            if(counter > 3){
                counter = subtractiveForm(total);
                if(counter == 4){
                    total = subtractFormTotal(total);
                }
            }
        }


        return total;
    }
}
