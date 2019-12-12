@Library('my-shared-library') _

pipeline {
		agent any
		stages {
      
			stage('Checkout') {
				steps {
					echo 'Checkouting..................'
					GitCheckout(
							branch: "jenkins_conf",
							url: "https://github.com/medbelaziz/bookService.git"
							)
				}
			}

			stage('Build') { steps { echo 'Building..................' } }

			stage('Deploy') {
				parallel {
					stage('Deploy1') { steps { echo 'Deploying1......................' } }
					stage('Deploy2') { steps { echo 'From depoying 2..............' } }
					stage('Deploy3') { steps { echo 'Deploy 3..................' } }
				}
			}

			stage('Test') { steps { echo 'Testing .................' } }
		}
		post {
			always { echo 'One way or another, I have finished' }
			success { echo 'I succeeeded!' }
			unstable { echo 'I am unstable :/' }
			failure { echo 'I failed :(' }
			changed { echo 'Things were different before...' }
		}
	}
