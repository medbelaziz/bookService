@Library('my-shared-library') _

hostMap
pipeline {
	agent any
	stages {
		stage('Checkout') {
			steps {
				GitCheckout(
					branch: "jenkins_conf",
					url: "https://github.com/medbelaziz/bookService.git"
					)
			}
		}

		stage('Build') { 
			steps {
				script{
					hostMap.puAt("AAA","aaaa")
					build("########## Build ###########")
					echo hostMap
				}
				
			} 
		}

		stage('Deploy') {
			parallel {
				stage('Deploy1') { steps { deploy( "Deploying1") } }
			}
		}

		stage('Test') { steps { test('Testing') } }
	}
	post {
		always { echo 'One way or another, I have finished' }
		success { echo 'I succeeeded!' }
		unstable { echo 'I am unstable :/' }
		failure { echo 'I failed :(' }
		changed { echo 'Things were different before...' }
	}
}
