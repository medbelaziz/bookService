pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building..................'
      }
    }

    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            echo 'Deploying......................'
          }
        }

        stage('') {
          steps {
            echo 'From depoying 2 ..............'
          }
        }

      }
    }

    stage('Test') {
      steps {
        echo 'Testing .................'
      }
    }

  }
  environment {
    Deploy2 = 'echo \'Deploy 2\''
  }
  post {
    always {
      echo 'One way or another, I have finished'
    }

    success {
      echo 'I succeeeded!'
    }

    unstable {
      echo 'I am unstable :/'
    }

    failure {
      echo 'I failed :('
    }

    changed {
      echo 'Things were different before...'
    }

  }
}