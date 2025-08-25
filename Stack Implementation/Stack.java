class Stack{
    int s;
    int top;
    int arr[];
    
    Stack(int s)
    {
        this.s=s;
        this.arr=new int [s];
        this.top=-1;
    }
    
    public void push(int ele)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return;
        }
        else{
            arr[++top]=ele;
        }
        
    }
    public int  pop()
    {   
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            
        }
        else{
        int e=arr[top];
        arr[top]=0;
        top--;
        return e;
        }
        return -1;
        
    }
    public void display()
    {
        for(int i=0;i<=top;i++)
        System.out.print(arr[i]);
    }
    public boolean isFull()
    {
        if(top==s-1)return true;
        else return false;
    }
    public boolean isEmpty()
    {
        if(top==-1)return true;
        else return false;
    }
}