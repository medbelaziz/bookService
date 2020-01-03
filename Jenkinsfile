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
                sh script: "sleep 15"
        }
        stage("stage: MED ") {
                echo "This is ${job}."
                sh script: "sleep 15"
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
