pipeline {
    agent {
        docker { image 'busybox'
        }
    }
    stages {
		stage('Build') {
                steps{
                    sh '''/bin/bash echo "all is fine" '''
                }
			}
        stage('Test') {
            steps {
                    sh '''/bin/bash echo "all is fine" '''
            }
        }
    }
}
