import java.util.Stack;
import java.util.ArrayList;

public class DepthFirstSearch{
    
    static class Node
    {
        int NodeNum;
        Boolean visited = false;
        ArrayList<Node> children = new ArrayList<Node>();
        
        public Node(int nN, Boolean v)
        {
            this.NodeNum = nN;
            this.visited =v;
            
        }
    }
    
    ArrayList<Node> s;
    Stack<Node> finall;
    int lookingFor;
    
    
    
    public DepthFirstSearch()
    {
        s = new ArrayList<Node>();
        finall = new Stack<Node>();
        lookingFor = 12;
        
        Populate();
        
        
        
        Node n;
        
        while (s.size()!=0)
        {
            int i =0; 
            
            n = s.get(i);
            
            
            int j =0;
            Boolean pass;
            
            while (n.children.size()!=0)
            { 
                System.out.println("This is node: " + n.NodeNum + " and children # is: " + n.children.size());
                
                if (n.NodeNum == lookingFor)
                {
                    System.out.println("I FOUND IT! " + n.NodeNum + " is equal to " + lookingFor);
                    Found();
                    
                    
                }
                
                if (n.children.get(j)!=null)
                {
                    Node temp = n.children.get(j);
                    
                    
                    if (n.children.get(j).children.size()==0)
                    {
                        n.children.remove(j);
                        
                        
                    }
                    n = temp;
                    
                    
                }
                
                else
                {j++;
                }
                
                
                
            }
            
            
            
            if (n.children.size() == 0)
            {
                System.out.println("This is node: " + n.NodeNum + " and children # is: " + n.children.size());
                
                
                if (n.NodeNum == lookingFor)
                {
                    System.out.println("I FOUND IT! " + n.NodeNum + " is equal to " + lookingFor);
                    Found();
                    
                    
                }
                
                finall.push(n);
                s.remove(n);
            }
            
            
            
        }
        
        
    }
    
    public void Found()
    {
        System.out.println("Hehehehyehyehasjdhfghjdgjahsd");
        System.exit(0);
    }
    
    
    public void Populate()
    {
        Node rootNode = new Node(7, true);
        
        s.add(rootNode);
        rootNode.visited=true;
        System.out.println(rootNode.NodeNum);
        
        Node n1 = new Node(11, false);
        Node n2 = new Node(12, false);
        
        s.add(n1);
        s.add(n2);
        
        rootNode.children.add(n1);
        rootNode.children.add(n2);
        
        Node n1n1 = new Node(3, false);
        Node n1n2 = new Node(8, false);
        
        s.add(n1n1);
        s.add(n1n2);
        
        n1.children.add(n1n1);
        n1.children.add(n1n2);
        
        Node n1n1n1 = new Node (23, false);
        
        s.add(n1n1n1);
        
        n1n1.children.add(n1n1n1);
        
    }
    
    
    public static void main (String[] args)
    {
        DepthFirstSearch d = new DepthFirstSearch();
        
        
    }
    
}