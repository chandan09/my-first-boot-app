pipeline{
    agent any
    tools {
 			 maven 'localmaven'
			}
    stages{
        stage("Git checkout"){
        steps{
            git credentialsId: 'f59fa7bd-926e-48b7-83bb-0c6dd7c8f772', url: 'https://github.com/chandan09/my-first-boot-app.git'
            }
        }
    
    stage("Build"){
    	steps{
    	bat label: '', script: 'mvn --version'   	
    	bat label: '', script: 'mvn clean package'
    	}
    
    	}
    	
    stage("archive artifact"){
     steps{
         archiveArtifacts artifacts: 'target/*.war', followSymlinks: false
             }
            }   
            
    stage("deploy"){
     steps{
 			echo " Deploying on tomcat"
            }   
        }
    }
}