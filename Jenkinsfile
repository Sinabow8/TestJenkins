node{
    stage('SCM Checkout'){
        git 'https://github.com/Sinabow8/TestJenkins'
    }
    stage('Compile-Package'){
        def mvnHome = tool name: 'maven 3.6.1', type: 'maven'
        bat 'mvn -version'
    }
}
