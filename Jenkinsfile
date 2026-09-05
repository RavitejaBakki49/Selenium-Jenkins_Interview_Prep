pipeline {
agent any
    
    tools {
        jdk 'JDK-22'
    }

    stages {
          stage('Build') {
                steps {
                     bat 'mvn clean install'
                }
            }
    }
}
