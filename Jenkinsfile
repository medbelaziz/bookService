@Library('my-shared-library') _
hostMap = [:]
def jobs = ["JobA", "JobB", "JobC"]

def parallelStagesMap = jobs.collectEntries {
    ["${it}" : generateStage(it)]
}

def generateStage(job) {
    return {
        stage("stage: ${job}") {
                echo "This is ${job}."
        }
        stage("stage: MED ") {
                echo "This is MED."
        }
    }
}

pipeline {
    agent any

    stages {
        stage('non-parallel stage') {
            steps {
                echo 'This stage will be executed first.'
            }
        }

        stage('parallel stage') {
            steps {
                script {
                    parallel parallelStagesMap
                }
            }
        }
    }
}
