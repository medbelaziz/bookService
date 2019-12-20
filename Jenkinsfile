@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Build') { 
			steps {
					buildPluging(hostMap)
			
			} 
		}
	}
}
