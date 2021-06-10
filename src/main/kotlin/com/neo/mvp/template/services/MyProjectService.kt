package com.neo.mvp.template.services

import com.intellij.openapi.project.Project
import com.neo.mvp.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
