@Library('my-shared-library') _
hostMap = [:]
pipeline {
    agent { label "master"}
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
        stage('BUild') {
            steps {
                script {
                    def tests = [:]
                    hostMap.each{ key,value ->
                        tests["${key}"] = {
                            node {
                                stage('nested'){
                                   stage("1") {
                                        echo '1'
                                    }
                                    stage("2") {
                                        echo '2'
                                    }
                                    stage("3") {
                                        echo '3'
                                    } 
                                }
                            }
                        }
                    parallel tests
                    }
                }
            }
        }       
    }
}
