package HuffMancode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoding {
    //creating the 2 hashmaps for the encoder and encoder
    static HashMap<Character,String> encoder=new HashMap<>();
    static HashMap<String,Character> decoder=new HashMap<>();

    //creating the node and which implementes the comapre for comparing the to take the frequency
    private class Node implements Comparable<Node> {
        Character data;
        int cost;//frequency
        Node left;
        Node rite;
    

        Node(Character data,int cost){
            this.data=data;
            this.cost=cost;
            this.left=null;
            this.rite=null;
        }

        @Override//comparing the cost value of the nodes
        public int compareTo(Node other) {
          return this.cost - other.cost;
        }

    }
    public HuffmanCoding(String feeder)throws Exception{
        //creating frequency map by iterating through the string
        HashMap<Character, Integer> fmap = new HashMap<>();
        for(int i=0;i<feeder.length();i++){
            //checking if the key exist or not 
            char cc=feeder.charAt(i);
            if(fmap.containsKey(cc)){
                //if exist
                int ov=fmap.get(cc);
                ov+=1;
                fmap.put(cc,ov);
            }
            else{
                fmap.put(cc, 1);
            }
        }
            
        Heap<Node> minHeap = new Heap<>();//creating the minheap
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();//craeting the set for each entnity in frequenceny map
        for(Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            //adding the nodes in the minheap
            minHeap.insert(node);
        }   

       //after taking the 2 min values and upadting the minheap
        while(minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();
            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.rite = second;
            minHeap.insert(newNode);
        }
        //after the taking the finall updated min tree we need to upadted the path into the encoder and decoder
        Node ft = minHeap.remove();//final updated min heap
        initEncoderDecoder(ft, "");
    }
    public static void initEncoderDecoder(Node node, String path){
    //here we need to traversing the finall min heap  using the recursion to fill the encoder and decoder hash with path
    //base condition
        if(node==null){
            return;
        }

        //if the node.left and rite ==null means we need to add the path sofar
        if(node.left==null && node.left==null){
            encoder.put(node.data, path);
            decoder.put(path, node.data);
        }
            
         //calling for the left node recursion and rite node recursion for travelling
         initEncoderDecoder(node.left, path+"0");//for left we need add the 0
         initEncoderDecoder(node.rite, path+"1");//for rite we need to add 1
            
    }
    //after all this we need to encoding by taking the string to path by using encoder hashmap
    public String encoding(String str){
    String ans1="";
    for(int i=0;i<str.length();i++){
        ans1=ans1+encoder.get(str.charAt(i));
        }
        return ans1;
    }

    //after all this we need to decoding by taking the path to string by using the decoder hashmap
    public String decoding(String path){
        String key="";
        String ans2="";
        for(int i=0;i<path.length();i++){
            key=key+path.charAt(i);
            if(decoder.containsKey(key)){
                ans2+=decoder.get(key);
                key="";//for next getting value

            }
        }
        return ans2;
    }

    

    public static void main(String[] args) throws Exception{
        String code="abbccda";
        HuffmanCoding c=new HuffmanCoding(code);
        String ans1=c.encoding(code);
        System.out.println(ans1);
        String ans2=c.decoding(code);
        System.out.println(ans2);

    }


        
        
}
    

