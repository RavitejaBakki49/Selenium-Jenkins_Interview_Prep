pipeline {
    agent any

    tools {
        jdk 'JDK-22'
    }
    triggers {
    pollSCM('H/5 * * * *')
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
    }
          post {
        always {
             junit 'target/surefire-reports/*.xml'
               publishHTML([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target',
                reportFiles: 'ExtentReport.html',
                reportName: 'Extent Report',
                useWrapperFileDirectly: true
            ])
        }
                success {
            echo 'Pipeline completed successfully'
        }

        failure {
            echo 'Pipeline failed - please check the test results'
        }

    }
}
