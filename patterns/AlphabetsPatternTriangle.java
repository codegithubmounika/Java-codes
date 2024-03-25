package patterns;

public class AlphabetsPatternTriangle {
    public static void pattern33(int n){
        char al='a';
        int count=0;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                // System.out.print(al);
                if(count%2!=0){
                    System.out.print(Character.toUpperCase(al)+" ");//charcter.touppercase():used the converting single char into capital
                }
                else{
                    System.out.print(al+" ");
                }
                al++;
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern33(5);
    }
}
