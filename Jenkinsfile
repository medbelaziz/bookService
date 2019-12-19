@Library('my-shared-library') _

hostMap = [:]
pipeline {
	agent any
	stages {

		stage('Build') { 
			steps {
				script{
				echo "************PIPELINE Build**********************"
				hostMap.putAt("AAA","aaaa")
				buildPluging()
				echo hostMap
				}
			} 
		}
	}
}
