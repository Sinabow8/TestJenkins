node{
    stage('SCM Checkout'){
        git 'https://github.com/Sinabow8/TestJenkins'
    }
    stage('Compile-Package'){
        sh 'mvn package'
    }
}
