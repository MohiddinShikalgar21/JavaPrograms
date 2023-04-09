package Test;

class listnode{
	int value;
	listnode next;
	public listnode(int value) {
		this.value=value;
		this.next=null;
	}
	public listnode(int value,listnode next) {
		this.value=value;
		this.next=next;
	}
}

public class mergeksortedlists {
    static listnode partition(listnode[] l,int start,int end) {
    	if(start==end) return l[start];
    	if(start<end) {
        	int mid=(start+end)/2;
    	    listnode l1=partition(l,start,mid);
    	    listnode l2=partition(l,mid+1,end);
    	    return merge(l1,l2);
    	}
    	return null;
    }
    static listnode merge(listnode l1,listnode l2) {
    	if(l1.next==null) return l2;
    	if(l2.next==null) return l1;
    	if(l1.value<l2.value) {
    		l1.next=merge(l1.next,l2);
    		return l1;
    	}
    	else {
    		l2.next=merge(l2.next,l1);
    		return l2;
    	}
     }
}
