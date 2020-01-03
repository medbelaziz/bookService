@Library('my-shared-library') _
hostMap = [:]
pipeline {
	agent any
	stages {
		stage('Example 1') {
			steps() {
				script{
					def hostsMap = []
					hostsMap.add("1")
					hostsMap.add("2")
					hostsMap.add("3")
					def listParam = createBooleanParamList(hostsMap)
					def choices = input message: '', parameters: listParam
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
