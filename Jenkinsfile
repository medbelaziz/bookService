@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Build') { 
			steps {
				buildPluging(hostMap)
				withCredentials([
					string(credentialsId: "ansible_cleAPI", variable: 'CLEAPI'), 
        				string(credentialsId: "ansible_clePublique", variable: 'CLEPUBLIQUE')
					 ]) {
						 echo "CLEAPI => " + CLEAPI
						 echo "CLEPUBLIQUE => " + CLEPUBLIQUE
				}
			} 
		}
	}
}
