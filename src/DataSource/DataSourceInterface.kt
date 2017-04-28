package DataSource

import Entitiy.ProjectEntity

interface DataSourceInterface {
    fun getProjectIssues(): Array<ProjectEntity>
}