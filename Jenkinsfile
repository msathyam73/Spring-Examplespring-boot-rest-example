pipeline {
    agent any
    stages {
        stage('Build Appplication') {
            steps {
              sh 'mvn clean package'
            }
      
         post{
			success{
						echo 'Now archiving the artifact'
						archiveArtifacts artifacts: '**/*.jar'
		}
	}

	}
	}
}