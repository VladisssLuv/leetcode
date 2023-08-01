package easy

class StudentAttendanceRecordI {
    fun checkRecord(s: String): Boolean {
        var countAbsent = 0
        var countLateContract = 0

        for (char in s) {
            if (char == 'L') {
                countLateContract++
                if (countLateContract >= 3) {
                    return false
                }
                continue
            }
            if (char == 'A') {
                countAbsent++
                if (countAbsent >= 2) {
                    return false
                }
            }
            countLateContract = 0
        }
        return true
    }
}