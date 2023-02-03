package DSA;
/*
 * Challenge 3:
There are two train TrainE and TrainF. Each train has 5 compartments. Each compartment has passengers from following states: Uttar Pradesh, Himachal Pradesh, Gujarat, Maharashtra, Kerala. There is one restriction that for each state citizens there is one dedicated compartment only, irrespective of sequence of compartment, like if Maharashtra state citizens are sitting in compartment 2nd, all of them will sit only there. Bookings will not allow in any other compartment for them, and there is no guarantee that if TrainE reserves booking of Maharashtra citizen in compartment 2nd, TrainF will do same, may be TrainF reserves booking of Maharashtra citizen in compartment 1st or in 2nd or in 3rd, and so on. Indian railways want to know that how many citizens of each states, state-wise, are travelling in both trains. 
Write a java program to implement this structure and perform this operation.
 */

public class Challenge3 {
    
    static NodeChal insertlast(NodeChal Head,int data,String state){
        NodeChal temp1 = Head;
        while(temp1!=null){
            if (temp1.State == state ){
                System.out.println("Members of this "+state+" already sitted in Train.");
                return Head;

            }
            temp1=temp1.next;

        }
        NodeChal n = new NodeChal(data,state);
        if(Head == null){
            Head = n;
            return Head;
        }
        else{
            NodeChal temp = Head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
                  
        }
        return Head;
    }

    static void TotalPasse(NodeChal E,NodeChal F){
        NodeChal temp = E;
        NodeChal temp1 = F;
        while(temp!=null){
            temp1 =F;
            while(temp1!=null){
                if(temp.State==temp1.State){
                    int sum= temp.data+temp1.data;
                    System.out.println("Total passengers of "+ temp.State+" code = "+ sum);
                    break;
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }

    }
    static void display(NodeChal Head){
        NodeChal temp = Head;
        while(temp!=null){
            System.out.println("STate "+temp.State +" = "+temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        NodeChal E = null;
        NodeChal F = null;
        E = insertlast(E, 50, "UP");
        E = insertlast(E, 60, "HIM");
        E = insertlast(E, 70, "GUJ");
        E = insertlast(E, 40, "MAH");
        E = insertlast(E, 30, "KER");
        F = insertlast(F, 50, "KER");
        F = insertlast(F, 60, "MAH");
        F = insertlast(F, 70, "GUJ");
        F = insertlast(F, 10, "HIM");
        F = insertlast(F, 15, "HIM");
        F = insertlast(F, 55, "UP");
        TotalPasse(E, F);
        // display(E);
    }
}
