pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                echo 'Hi, this is Sathyam from Init'
		echo 'We are starting the Testing'
            }
        }
         stage('Buid'){
	    steps{
                   echo 'Bulding Sample Maven Project'
		}
        }
	stage('Deploy'){
	     steps{
                    echo 'Deploying in stagging Area'
		}
	}
 }

}