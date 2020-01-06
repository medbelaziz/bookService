@Library('my-shared-library') _
hostMap = [:]

pipeline {
  	agent any
	stages {
		stage('Build and Test') {
			steps{
				script{				
					hostMap.putAt("1","one")
					hostMap.putAt("1","two")
					hostMap.putAt("1","tree")

					hostMap.eachWithIndex { key, val, index ->
						echo "#index => $index #Key => $key #Value =>  $val"
					}
				}
			}
		}
	}
}
