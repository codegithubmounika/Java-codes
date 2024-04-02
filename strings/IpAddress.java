package strings;

public class IpAddress {
    //leetcode question no- 1108. Defanging an IP Address
    public static void ipAdress(String arr){
        String sc=arr;
        StringBuilder n=new StringBuilder("");//appending elements into the n
        for(int i=0;i<sc.length();i++){
            if(sc.charAt(i)=='.'){
                n.append("[.]");
                
            }
            else{
                n.append(sc.charAt(i));
            }
        }
        System.out.println(n);

    }
    public static void main(String[] args) {
        ipAdress("1.1.1");
    }
}
