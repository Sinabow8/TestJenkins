node{
    stage('SCM Checkout'){
        git 'https://github.com/Sinabow8/TestJenkins'
    }
    stage('Compile-Package'){
        bat 'javac Calculator.java'
        bat 'javac CalculatorTest.java'
        bat 'javac CalculatorTestRunner.java'
    }
    stage('Test'){
        bat 'java CalculatorTestRunner.java'
    }
}
