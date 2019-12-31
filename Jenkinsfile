@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Example') {
			when {
				anyOf {
				    equals expected: 1, actual: currentBuild.number
				    equals expected: 2, actual: currentBuild.number
				    equals expected: 3, actual: currentBuild.number
				    equals expected: 4, actual: currentBuild.number
				 }
			}
	    		steps() {
				
				sh 'echo $currentBuild.number' 
				Application()
			}
		}
	}
}
