pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..................'
            }
        }
    }
    stages {
        stage('Test') {
                steps {
                    sh 'mvn -B -DskipTests clean package' 
                }
                steps {
                    echo 'Testing .................'
                }
        }
    }
    stages {
        stage('Deploy') {
            steps {
                echo 'Deploying......................'
            }
        }
    }
    post {
        always {
            junit 'build/*.xml'
            echo 'One way or another, I have finished'
            /* deleteDir()  clean up our workspace */
        }
        success {
            echo 'I succeeeded!'
            /*
            mail to: 'medbelaziz@gmail.com',
            subject: "success Pipeline: ${currentBuild.fullDisplayName}",
            body: "The ${env.BUILD_URL}  is complete with success "
            */
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
            /*
            mail to: 'medbelaziz@gmail.com',
            subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
            body: "Something is wrong with ${env.BUILD_URL}"
            */
        }
        changed {
            echo 'Things were different before...'
        }
    }
}
