package DSA;
/* Challenge 1:
Suppose there are two trains going towards Delhi. First is Train A which is originating from Agra at 06:00 AM and second is Train B which is originating from Aligarh at 06:20 AM, and they both will arrive at Mathura on 07:30 AM and 07:35AM respectively. 

Train A has 5 boggies/compartments and each compartment has one attendant namely Att 1, Att2, Att3, Att4, Att5, and Train B has also 5 boggies/compartments and each compartment has one attendant namely Att6, Att7, Att8, Att9, Att10.

When train B reaches Mathura loco pilot of Train B detected that engine is not in good condition and will face breakdown in between of Mathura and Delhi. He intimates everything to the Station Manager immediately, and Station Manager and DRM decided that they will merge all the boggies/compartments after Train A. 

Write an Algorithm or Java Program to merge both structures one after one.*/


public class Challenge1 {
    
    static Node3 findtail(Node3 head){
        Node3 tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        return tail;
    }

    static void merge(Node3 A,Node3 B){
        B=B.next;
        A.next = B;
        B.previous = A;
    }
    
    static void display(Node3 head){
        Node3 temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Doublyinsert d = new Doublyinsert();
        Node3 Head = null;
        Node3 Head1 = null;
        Head = d.insertlast(Head, 0);
        Head = d.insertlast(Head, 1);
        Head = d.insertlast(Head, 2);
        Head = d.insertlast(Head, 3);
        Head = d.insertlast(Head, 4);
        Head = d.insertlast(Head, 5);
        // display(Head);
        Head1 = d.insertlast(Head1, 0);
        Head1 = d.insertlast(Head1, 6);
        Head1 = d.insertlast(Head1, 7);
        Head1 = d.insertlast(Head1, 8);
        Head1 = d.insertlast(Head1, 9);
        Head1 = d.insertlast(Head1, 10);
        Head1 = d.insertlast(Head1, 11);
        // display(Head1);
        Node3 Tail = findtail(Head);
        merge(Tail, Head1);
        display(Head);



    }
}
