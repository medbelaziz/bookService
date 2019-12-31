@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Example 1') {
			steps() {
				echo "currentBuild.number => $currentBuild.number"
			}
		}
		
		stage('Example 2') {

			when {
				anyOf {
				    equals expected: 1, actual: currentBuild.number
				    equals expected: 2, actual: currentBuild.number
				    equals expected: 99, actual: currentBuild.number
				    equals expected: 100, actual: currentBuild.number
				 }
			}
	    		steps() {
				
				echo "**************HELLO******************"
				Application()
			}
		}
	}
}
