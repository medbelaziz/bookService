@Library('my-shared-library') _
hostMap = [:]

pipeline {
  	agent any
	stages {
		stage('Prepare') {
			steps{
				script{				
					hostMap.putAt("1","one")
					hostMap.putAt("2","two")
					hostMap.putAt("3","tree")
				}
			}
		}
		stage('Build and Test') {
			steps{
				script{
					hostMap.eachWithIndex { key, val, index ->
						
						stage("Désactiver TDV [${ansibleHost}]") {
							when{
								equals expected: 0, actual: index 
							}
							echo "#Index => $index "

						}

					}
				}
			}
		}
	}
}
