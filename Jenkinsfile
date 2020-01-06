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
						
						stage("Désactiver TDV [${val}]") {
							if(index==0){
								echo "#Index => $index "
							}
							

						}

					}
				}
			}
		}
	}
}
