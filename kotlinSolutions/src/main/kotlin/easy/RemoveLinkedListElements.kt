package easy

class RemoveLinkedListElements {
    companion object {
        public class ListNode(var `val`: Int) {
            var next: ListNode? = null
        }
    }

    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) {
            return null
        }

        val newHead: ListNode = ListNode(0)
        newHead.next = head
        var it: ListNode? = newHead.next
        var last: ListNode = newHead

        while(it != null) {
            if(it.`val` == `val`) {
                last.next = it.next
            } else {
                last = it
            }
            it = it.next
        }

        return newHead.next
    }
}