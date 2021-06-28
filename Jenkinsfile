pipeline {
	agent any

	environment {
		DOCKER_IMAGE = "thuongtx/spring-jenkins-pipleline"
	}

	stages {
		stage('Clone') {
			steps {
				git branch: 'main', url: 'https://github.com/thuongtrinh/spring-jenkins-pipleline.git'
			}
		}

		stage("Test") {
			steps {
				echo "Test Stage"
				//sh "mvn test"
				//step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
				withMaven(maven : 'apache-maven-3.8.1') {
					sh 'mvn test'
				}
			}
		}

//		stage('Build') {
//			steps {
//				withDockerRegistry(credentialsId: 'docker-hub-webhook1', url: 'https://index.docker.io/v1/') {
//					sh 'docker build -t thuongtx/docker-spring-boot:v1 .'
//					sh 'docker push thuongtx/docker-spring-boot:v1'
//				}
//			}
//		}

		
	}

	post {
		success {
			echo "SUCCESSFUL"
		}
		failure {
			echo "FAILED"
		}
	}
}
