pipeline {
    agent any
    stages {
        stage('Build Appplication') {
            steps {
			 M2_HOME='E:\softwares\apache-maven-3.6.3\bin'
			 PATH='%M2_HOME%;%PATH%'
			
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