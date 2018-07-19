package algorithm;


/*
 * 给定两个链表 l1 : 2 -> 4 -> 3
 * 			  l2 : 5 -> 6 -> 4
 * 返回结果链表 l3 : 7 -> 0 -> 8.
 * 			  (342 + 465 == 807)
 * 
*/

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumber {
	public ListNode addTwoNumber(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode ptr = head;
		int carry = 0; 
		while (true) {
			if (l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			ptr.val = carry % 10;
			carry /= 10; //进位 
			if (l1 != null || l2 != null || carry != 0) {
				ptr = (ptr.next = new ListNode(0));
			} else break;
		}
		return head;
	}
	
	public static void main(String[] args) {
		System.out.println( 7 / 10);
	}
}
