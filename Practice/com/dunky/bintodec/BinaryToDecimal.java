package com.dunky.bintodec;

class BinToDec{
    public int convertToDec(String binary){
        int result = 0;
        for (int i = 0; i < binary.length(); i++){
            if(binary.charAt(binary.length()-i) == '1' ){
                result += Math.pow(2, i - 1);
            }
        }
        return result;
    }
}
public class BinaryToDecimal {
    public static void main(String[] args){

        BinToDec binaryDecimal = new BinToDec();
        System.out.println(binaryDecimal.convertToDec("100101"));

    }
}
