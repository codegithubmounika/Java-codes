package SingleLinkedList;

public class AddelementsinLinkedList  {
    public static class Node{
        //this is the blueprint of the linked list we creted the linkedlist by creating the objects of the class the Node
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class LinkedList{
          //creating the method called add to add the elemnts into the linkedlist at the tail side
        void addElements(int e){
            //here this was the node to adding the existing list or//creating the new linkid list if heaad == nulll
            Node temp = new Node(e);
            //if the linked list was empty means ur node was the first one so it points to head
            if(head==null){
                head=temp;
            }
            else{
                //so here already linkedlist is there so we need to add the elements at the end of the linkedist
                //so we need to add the we need to no tail of that paritcular linkedlist
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                //if voilate condition so we find the last where we need to add
                curr.next=temp;
            }
        }




        //this class and used for the printing the linkedlist and adding the nodes(elements) in the linkedlist
        Node head;
        void linkedList1(){
        //here we are using the cuurent node as the temporary for tarversing total linkedlist to get first node 
        Node curr=this.head;
            while (curr!=null) {
                System.out.println(curr.data);
                curr=curr.next;
            }
        
        }

    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addElements(10);
        l1.addElements(20);
        l1.addElements(80);


        l1.linkedList1();

        
    }
    
}
