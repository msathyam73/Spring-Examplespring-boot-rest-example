pipeline {
    agent any
    stages {
        stage('Build Appplication') {
            steps {
			
              bat 'mvn clean package' 
			  echo 'packaging completed'
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