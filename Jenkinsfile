@Library('my-shared-library') _

hostMap = [:]
pipeline {
	agent any
	stages {

		stage('Prepare') { 
			      Utils.markStageSkippedForConditional(STAGE_NAME)
		}
		stage('Build') { 
			steps {
				script{
				hostMap.putAt("AAA","aaaa")
				buildPluging(hostMap)
				echo "************PIPELINE Build**********************"
				echo hostMap["AAA"]
				echo hostMap["BBB"]
				}
			} 
		}
	}
}
