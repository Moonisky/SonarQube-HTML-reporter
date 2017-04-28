package Output

import Entitiy.ProjectEntity

interface OutputInterface {
    fun renderProjects(projects: Array<ProjectEntity>)
}