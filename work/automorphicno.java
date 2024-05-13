package com.company;

public class automorphicno {
    public static void main(String[] args) {
        int n=25;
        int square=n*n;
        int temp=n;
        int cod=0;
        while(temp>0){
            cod++;
            temp/=10;
        }
        int mod=(int)Math.pow(10,cod);
        int modval=square%mod;
       // square==modVal

    }
}
