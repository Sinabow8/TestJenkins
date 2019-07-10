pipeline {
    agent any

    stages{
        stage ('Compile'){
            steps {
                withMaven(maven : 'maven 3.6.1'){
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Test'){
            withMaven(maven : 'maven 3.6.1'){
                sh 'mvn test'
            }
        }
    }
}