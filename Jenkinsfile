pipeline{
    agent any
    tools {
 			 maven 'localmaven'
			}
    stages{
        stage("Git checkout"){
        steps{
            git credentialsId: 'f59fa7bd-926e-48b7-83bb-0c6dd7c8f772', url: 'https://github.com/chandan09/HelloWorld.git'
            }
        }
    }
    
    stages{
    stage("Build"){
    	steps{
    	sh 'mvn --version'    	
    	}
    }
    
    }
}