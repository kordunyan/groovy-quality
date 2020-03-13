package sample

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction


class InfoTask extends DefaultTask {

    @Optional
    String prefix = 'Current gradle Version'

    @TaskAction
    void info() {
        println "${prefix: project.gradle.gradleVersion}"

    }

}
