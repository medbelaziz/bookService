@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Example') {
			input {
				message "Should we continue?"
				ok "Yes"
				parameters {
				booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

				}
			}
			steps {
				echo "Hello, ${TOGGLE}, nice to meet you."
			}
		}
	}
}
