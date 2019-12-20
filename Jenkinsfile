@Library('my-shared-library') _
import org.jenkinsci.plugins.pipeline.modeldefinition.Utils
hostMap = [:]
pipeline {
	agent any
	stages {

		stage('Prepare') { 
			steps {  
					testPlugin()
			}
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
