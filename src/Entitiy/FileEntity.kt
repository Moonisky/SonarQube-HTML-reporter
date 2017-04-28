package Entitiy

import Protobuf.DbFileSources

class FileEntity {
    var path = ""
    var content: DbFileSources.Data? = null
    var issues = mutableListOf<IssueEntity>()
}