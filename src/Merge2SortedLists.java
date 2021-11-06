public class Merge2SortedLists {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null && l2 == null){
                return null;
            }
            if(l1 == null){
                return l2;
            }
            if(l2 == null){
                return l1;
            }
            ListNode merged=new ListNode(0,null);
            ListNode c=merged;
            while(l1!=null && l2==null){
                if(l1.val<l2.val){
                    c.next=l1;
                    l1=l1.next;
                    c=c.next;
                }
                else if(l2.val<l1.val){
                    c.next=l2;
                    l2=l2.next;
                }
                else {
                    c.next=l1;
                    l1=l1.next;
                    c.next=l2;
                    l2=l2.next;
                }
                c=c.next;
            }
            if(l1 != null){
                while(l1 != null){
                    c.next = l1;
                    l1 = l1.next;
                    c = c.next;
                }
            }
            if(l2 != null){
                while(l2 != null){
                    c.next = l2;
                    l2 = l2.next;
                    c = c.next;
                }
            }
            return merged;
        }


        public ListNode _mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null){
                return l2;
            }
            if(l2 == null){
                return l1;
            }
            ListNode merged=null;
            if(l1.val < l2.val){
                merged=l1;
                merged.next=_mergeTwoLists(l1.next, l2);
            } else {
                merged=l2;
                merged.next=_mergeTwoLists(l1, l2.next);
            }
            return merged;
        }
    }
}