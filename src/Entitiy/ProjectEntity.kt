package Entitiy

class ProjectEntity {
    var name = ""
    var uuid = ""
    var files = mutableListOf<FileEntity>()
    var issueCount = hashMapOf(
            "BLOCKER" to 0,
            "CRITICAL" to 0,
            "MAJOR" to 0,
            "MINOR" to 0,
            "INFO" to 0)
}