package com.github.ysinhz.androidplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.ysinhz.androidplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
