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
            parallel {
                steps() {
                    script{
                        listRollbackHosts.each { key, value ->
                            tage('Test On Windows') {
                                steps {
                                    echo "Windows ${key}"
                                }
                            }
                            stage('Test On Unix') {
                                steps {
                                    echo "Unix ${key}"
                                }
                            }
                            stage('Test On Apple') {
                                steps {
                                    echo "Apple ${key}"
                                }
                            }
                        }
                    }
                }
            }
        }
        /*
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
        }*/
    }
}
