@Library('my-shared-library') _
hostMap = [:]

pipeline {
  agent { label 'master' }
  stages {
    stage('Build and Test') {
		steps{
			hostMap.add("1")
			hostMap.add("2")
			hostMap.add("3")
		}
	}
    stage('Build and Test') {
     parallel {
		
		hostMap.each{ it ->
		
			stage("Build and Test Linux") {

				stages {
					stage("Build (Linux)") {
						steps {
							echo "Inside for loop 1"
						}
					}
					stage("Test (Linux)") {
						steps {
							echo "Inside for loop 2"
						}
					}
				}

			}
		}	
      }
    }
  }
}
