package medium

class AddTwoNumbers {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var pointerForL1 = l1
        var pointerForL2 = l2
        var transfer = 0
        var pointerForResultListNode: ListNode? = null
        var resultListNode: ListNode? = pointerForResultListNode

        while (pointerForL1 != null || pointerForL2 != null) {
            var number1 = 0
            var number2 = 0
            var newNode: ListNode? = null

            pointerForL1?.let {
                number1 = it.`val`
                pointerForL1 = it.next

            }
            pointerForL2?.let {
                number2 = it.`val`
                pointerForL2 = it.next
            }

            if ((number1 + number2 + transfer) < 10) {
                newNode = ListNode(number1 + number2 + transfer)
                transfer = 0
            } else {
                newNode = ListNode((number1 + number2 + transfer) % 10)
                transfer = 1
            }

            if (pointerForResultListNode == null) {
                pointerForResultListNode = newNode
                resultListNode = pointerForResultListNode
            } else {
                pointerForResultListNode.next = newNode
                pointerForResultListNode = pointerForResultListNode.next
            }
        }
        if (transfer == 1) {
            pointerForResultListNode!!.next = ListNode(transfer)
        }

        return resultListNode
    }
}