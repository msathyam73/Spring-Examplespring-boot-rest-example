pipeline {
    agent any
    stages {
        stage('Build Appplication') {
            steps {
			
				set PATH=%PATH%
              bat 'mvn -f pom.xml clean package'
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