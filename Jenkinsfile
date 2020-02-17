//@Library('my-shared-library') _
hostMap = [:]

pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
               echo "Fail! #######################"
            }
        }
    stage('Deploy') {
            steps {
                retry(3) {
                    echo "Deploying #######################"
                }

                timeout(time: 2, unit: 'MINUTES') {
                    echo 'time out .....'
                }
                sleep(time: 1, unit: 'MINUTES'){
                    echo "Sleeping finiched #######################"
                }
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}
