//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

package Extra;

public class RemoveExtraElementFromSortedList {
    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

        public static ListNode deleteDuplicates(ListNode head) {
            ListNode res = head;

            while (head != null && head.next != null) {
                if (head.val == head.next.val) {
                    head.next = head.next.next;
                } else {
                    head = head.next;
                }
            }

            return res;
        }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode result = deleteDuplicates(head);
        System.out.print("List after removing duplicates: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}
