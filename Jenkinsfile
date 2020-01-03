@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Example 1') {
			steps() {
				script{
					def hostsMap = [:]
					hostsMap.putAt("1","One")
					hostsMap.putAt("2","Two")
					hostsMap.putAt("3","tree")
					def listParam = createBooleanParamList(hostsMap)
					def choices = input message: 'Remplir ça!!', parameters: listParam
					def listFiltre = []
					choices.each{
						echo "----- $it -------------"	
						if(it.getValue()){
							echo "----- $it -------------"	
							listFiltre.add(it.getKey())	
						}
					}
					listFiltre.each{
						echo "----- $it -------------"	
					}
				}
			}
		}
	}
}
def createBooleanParamList(Map paramList) {
	def booleanParams = []
	paramList.each {
	    booleanParams.add(booleanParam(defaultValue: false, name: it.getKey(), description: ''))
	}
	booleanParams
}
