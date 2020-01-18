public class Linked_List {
    Node head;

    public void addNode(int data)
    {
        Node new_node = new Node(data);

        //If linked list is null then add new node as head of linked List (first node)
        if(head == null)
        {
            this.head = new_node;
        }
        else  //If nodes already exist in list, then loop through it and find last node
        {
            Node tmp = this.head; //Start from first node (head)
            while(tmp.next != null)
            {
                tmp = tmp.next;
            }
            tmp.next = new_node; //New node is last
        }
    }

    public void traverse_Linked_List()
    {
        Node current_node = this.head; //Find first node

        while(current_node != null)
        {
            System.out.print(current_node.data + " ");
            current_node = current_node.next;
        }
    }

    //This will delete first instance where data matches
    public void delete_node(int data)
    {
        Node prev_node;
        //if head contains data then delete head and next element will become head
        if(head.data == data)
        {
            head = head.next;
        }
        else
        {
            Node current_node = head.next;
            prev_node= head;
            while(current_node != null)
            {
                if (current_node.data == data)
                {
                    if(current_node.next == null) //if this happens to be last node, then set previous node's next to null
                    {
                        prev_node.next = null;
                    }
                    else
                    {
                        prev_node.next = current_node.next;
                        current_node.next = null;
                    }
                }
                prev_node = current_node;
                current_node = current_node.next;
            }
        }
    }


    public static void main(String[] args) {
        Linked_List l1 = new Linked_List();
        l1.addNode(10);
        l1.addNode(7);
        l1.addNode(9);
        l1.addNode(12);
        l1.addNode(15);

        l1.traverse_Linked_List();
        System.out.println("");
        l1.delete_node(18);
        l1.traverse_Linked_List();
    }

}

