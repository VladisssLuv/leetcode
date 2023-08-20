package easy

class ReverseLinkedList {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
    private val resultList = ListNode(0)
    var iterator = resultList

    fun reverseList(head: ListNode?): ListNode? {

        helper(head)
        return resultList.next
    }

    private fun helper(node: ListNode?) {
        if(node == null) {
            return
        }

        helper(node.next)
        iterator.next = ListNode(node.`val`)
        iterator = iterator.next!!
    }

}