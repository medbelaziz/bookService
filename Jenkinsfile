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
                                stage("${key}") {
                                    echo '${key}'
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
