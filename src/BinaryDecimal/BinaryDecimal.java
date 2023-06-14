package BinaryDecimal;

public class BinaryDecimal {

    public static void main(String[] args) {

        //String binary = "110";
        String binary = "111";

        int base = 2;
        int exponent = 0;
        int power = 1;
        int decimal = 0;
        int i = binary.length() - 1;

        while (i >= 0){
            if(binary.charAt(i) == '1'){
                for(int j = 0; j < exponent; j++){
                    power *= base;
                }
                decimal += power;
                power = 1;
            }
            i--;
            exponent++;
        }
        System.out.println("Decimal Number: " + decimal);
    }
}