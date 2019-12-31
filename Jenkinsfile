@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Example') {
			input {
				message "Should we continue?"
				ok "Yes, we should."
				submitter "alice,bob"
				parameters {
				booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

				/*string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')*/
				}
			}
			steps {
				echo "Hello, ${TOGGLE}, nice to meet you."
			}
		}
	}
}
