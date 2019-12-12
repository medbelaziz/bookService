@Library('my-shared-library') _

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

		stage('Build') { steps { build(msg:"Build") } }

		stage('Deploy') {
			parallel {
				stage('Deploy1') { steps { deploy( msg:"Deploying1") } }
				stage('Deploy2') { steps { deploy( msg:"Deploying2") } }
				stage('Deploy3') { steps { deploy( msg:"Deploying3") } }
			}
		}

		stage('Test') { steps { test( msg: 'Testing' ) } }
	}
	post {
		always { echo 'One way or another, I have finished' }
		success { echo 'I succeeeded!' }
		unstable { echo 'I am unstable :/' }
		failure { echo 'I failed :(' }
		changed { echo 'Things were different before...' }
	}
}
