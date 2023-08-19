package easy

class LinkedListCycle {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun hasCycle(head: ListNode?): Boolean {
        var fastPointer = head
        var slowPointer = head

        while (fastPointer != null && slowPointer != null) {
            fastPointer = fastPointer.next?.next
            slowPointer = slowPointer.next

            fastPointer?.also {
                if (it == slowPointer) {
                    return@hasCycle true
                }
            }
        }

        return false
    }
}