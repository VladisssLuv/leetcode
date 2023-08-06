package easy

class MiddleoftheLinkedList {

    class ListNode(val `val`: Int) {
        var next: ListNode? = null
    }

    fun middleNode(head: ListNode?): ListNode? {
        var fastPointer: ListNode? = head
        var slowPointer: ListNode? = head
        while (fastPointer?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next
        }
        return slowPointer
    }
}