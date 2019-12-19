@Library('my-shared-library') _

hostMap = [:]
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
					buildPluging()
					echo hostMap
				}
				
			} 
		}
	}
}
