  public ListNode mergeKLists(ListNode[] lists) {
      int l=lists.length;
      int in=1;
        if(l==0)
            return null;
        while(in<l){
        for(int i=0;i<l-in;i+=in*2)
        {
           lists[i]=merge(lists[i],lists[i+in]);
        }
        in*=2;
        }
        return lists[0];
    }
    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode temp=new ListNode(0);
        ListNode c=temp;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {
               c.next=l1;
                l1=l1.next;
            }
            else
            {   c.next=l2;
                l2=l2.next;
            }
            c=c.next;
        }
        if(l1!=null)
            c.next=l1;
        if(l2!=null)
            c.next=l2;
        return temp.next;
    }