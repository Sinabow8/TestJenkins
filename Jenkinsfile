node{
    stage('SCM Checkout'){
        git 'https://github.com/Sinabow8/TestJenkins'
    }
    stage('Compile-Package'){
        bat 'mvn clean compile'
    }
    stage('Test'){
        bat 'mvn test'
        //It's a test.
    }
}