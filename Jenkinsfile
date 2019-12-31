@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Example') {
			input {
				message "Should we continue?"
				ok "Continue"
			}
			steps {
				echo "Hello, nice to meet you."
			}
		}
	}
}
