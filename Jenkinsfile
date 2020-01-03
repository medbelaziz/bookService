@Library('my-shared-library') _
hostMap = [:]
pipeline {
    agent any
    stages {
        stage('Run Tests') {
            parallel {
                stage('Test On Windows') {
                    steps {
                        echo "run-tests.bat"
                    }
                }
                stage('Test On Linux') {
                    steps {
                        echo "run-tests.sh"
                    }
                }
            }
        }
    }
}
