package Definition

enum class BugLevelEnum {
    BLOCKER, CRITICAL, MAJOR, MINOR, INFO;

    val sql: String
        get() = "severity = '" + this.name + "'"

    val chinese: String
        get() {
            when (this) {
                BLOCKER -> return "严重错误"
                CRITICAL -> return "明显缺陷"
                MAJOR -> return "潜在问题"
                MINOR -> return "不符规范"
                INFO -> return "修改建议"
            }
        }
}