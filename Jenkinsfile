@Library('my-shared-library') _
import org.jenkinsci.plugins.pipeline.modeldefinition.Utils
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Build') { 
			steps {
				script{
					buildPluging(hostMap)
				}
			} 
		}
	}
}
