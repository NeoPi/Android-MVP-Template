package com.neo.mvp.template.listeners

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.neo.mvp.template.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    private var projectInstance: Project? = null
    override fun projectOpened(project: Project) {
        projectInstance = project
//        project.service<MyProjectService>()
        project.getService(MyProjectService::class.java)
    }

    override fun projectClosing(project: Project) {
        projectInstance = null
        super.projectClosing(project)
    }
}
