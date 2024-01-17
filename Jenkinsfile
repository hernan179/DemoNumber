pipeline {
    agent any
    tools {
        maven 'maven3.8.5'
    }
    stages {
        stage('checout') {
            steps {
                git url: 'https://github.com/hernan179/DemoNumber.git',
                branch: 'master'
            }
            
        }
        stage('Listar') {
            steps {
                sh 'mvn clean package -DskipTests -ntp'
            }
            
        }
    }
    post { 
         success { 
           archiveArtifacts artifacts: 'target/*.jar'
           deleteDir()
        }
      }
    
}
