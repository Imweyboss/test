pipeline{
    agent any
    stages{
        stage('Test'){
            steps{
                welcome 'Art'
            }
        }
    }
} 
