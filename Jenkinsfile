node{
    stage('SCM Checkout'){
        git 'https://github.com/Sinabow8/TestJenkins'
    }
    stage('Compile-Package'){
        bat 'mvn clean compile'
        bat 'mvn -version'
    }
    stage('Test'){
        bat 'mvn test'
        //It's a test.
    }
    stage('Deploy'){
        //TODO deploy the project
    }
}