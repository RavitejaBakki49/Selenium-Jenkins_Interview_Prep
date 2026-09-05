pipeline {
    agent any

    tools {
        jdk 'JDK-22'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
          post {
        always {
            echo 'Pipeline execution completed'
        }

    }
}
