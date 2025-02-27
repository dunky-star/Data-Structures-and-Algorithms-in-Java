package com.dunky.bintodec;

// Converting Binary number to Decimal.
class BinToDec{
    public int convertToDec(String binary){
        int result = 0;
        for (int i = 1; i < binary.length(); i++){
            if(binary.charAt(binary.length()-i) == '1' ){
                result += Math.pow(2, i - 1);
            }
        }
        return result;
    }
}
public class BinaryToDecimal {
    public static void main(String args[]){

        BinToDec binaryDecimal = new BinToDec();
        System.out.println("\nThe decimal number is: " + binaryDecimal.convertToDec("10110"));

    }
}
