@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		
		stage('Build') { 
			steps {
				//cleanWs()
				//buildPluging(hostMap)
				withCredentials([
					string(credentialsId: "ansible_cleAPI", variable: 'CLEAPI'), 
        				string(credentialsId: "ansible_clePublique", variable: 'CLEPUBLIQUE')
					 ]) {
						 echo "CLEAPI => " + CLEAPI
						 echo "CLEPUBLIQUE => " + CLEPUBLIQUE
				}
				withCredentials([sshUserPrivateKey(credentialsId: 'ansible_KEY_API', keyFileVariable: 'tmpVariable', passphraseVariable: 'exemple passPhrase', usernameVariable: 'mohammed')]) {
						echo "*************************************"
						echo "tmpVariable => " + tmpVariable
				}
			} 
		}
	}
}
