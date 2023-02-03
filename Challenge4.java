package DSA.Stack;
/* Remove Boggie from Train and linking remaining boggie after detaching */


public class Challenge4 {

    static int counter(Node Train){
        int ctr =0;
        Node temp = Train;
        while(temp!=null){
            ctr++;
            temp = temp.next;
        }
        return ctr;
    }

    public static Node push(Node top,int data){
        Node n = new Node(data);
        if(top != null){
            n.next = top;
            top =n;
        }
        else{
            top = n;
        }
        return top;
    }

    

    public static Node pop(Node top){
        if(top!=null){
            top = top.next;
            return top;
        }
        else{
            System.out.println("Stack is Empty!!");
        }
        return top;
    }
    

    static Node detach(Node top,int bogi,int ctr){
        Node n = null;
        int remain = ctr-bogi;
        int ctr1=1; //counter;
        while(ctr1<=remain){
            System.out.println("Detaching Boggie Number : "+ctr--);
            int c = top.data;
            n = push(n,c);
            top = pop(top);
            c =0;
            ctr1++;
        }
        System.out.println("Detaching User's Boggie number : "+ctr--);
        top = pop(top);
        ctr++;
        while(n!=null){
            int c = n.data;
            System.out.println("After Detaching Boggie number "+ bogi + " Linking Boggie number : "+ ++ctr);
            top = push(top,c);
            n = pop(n);
            c =0;

        }
        return top;


    }

    public static void display(Node top){
        Node temp = top;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
    Node TrainE = null;
    Node c = null;
    TrainE = push(TrainE, 8);
    TrainE = push(TrainE, 10);
    TrainE = push(TrainE, 12);
    TrainE = push(TrainE, 14);
    TrainE = push(TrainE, 16);
    TrainE = push(TrainE, 18);
    int count = counter(TrainE);
    TrainE = detach(TrainE, 4, count);
    display(TrainE);

        
    }
}
