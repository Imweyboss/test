@Library('test1') _

pipeline{
    agent any
    stages{
        stage('Test'){
            steps{
                welcome("Art")
            }
        }
    }
} 
