pipeline {
    agent any
    stages {
        stage('Build Appplication') {
            steps {
              sh 'mvn -f Spring-Examplespring-boot-rest-example/pom.xml clean package'
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