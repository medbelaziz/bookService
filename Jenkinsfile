//@Library('my-shared-library') _
hostMap = [:]

pipeline {
    agent none
	stages {
		stage('Prepare') {
			agent any
			steps {
				echo "Preparing ..."
			}
		}

		stage('Runinng JOB 1') {
			steps {
				build job: 'job1' , wait: true
			}
		}

		stage('Deploy') {
			agent any
			steps {
				echo " Deploying .... "
			}
		}
	}
}
