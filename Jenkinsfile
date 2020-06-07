pipeline {
    agent any
    stages {
        stage('Build Appplication') {
            steps {
              bat ""C:\maven\apache-maven-3.3.9\bin\mvn.exe" -f pom.xml clean package"
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