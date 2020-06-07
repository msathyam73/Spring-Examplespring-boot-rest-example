pipeline {
    agent any
    stages {
        stage('Build Appplication') {
            steps {
              sh 'maven clean package'
            }
      
         post('Buid'){
			success{
						echo 'Now archiving the artifact'
						archiveArtifacts artifacts: '**/*.jar'
		}
	}

	}
	}
}