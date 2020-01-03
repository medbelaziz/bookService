@Library('my-shared-library') _
hostMap = [:]
pipeline {
    agent any
    stages {
        stage('Prepare'){
            steps {
                script{
                    echo "Prepare"
                    hostMap.putAt("1","1")
                    hostMap.putAt("2","2")
                    hostMap.putAt("3","3")
                }
            }
        }
        
         
        stage('Nb Machines') {
            
            stage('Nb Machines nested') {
                steps() {
                    script{
                        parallel {
                            hostMap.each { key, value ->
                                stage('Test On Windows') {
                                        echo "Windows ${key}"
                                }
                                stage('Test On Unix') {
                                        echo "Unix ${key}"
                                }
                                stage('Test On Apple') {
                                        echo "Apple ${key}"
                                }
                            }
                        }
                    }
                }
            }
        }
       
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
