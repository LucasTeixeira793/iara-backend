pipeline {
    agent any
    stages {
        stage('Git Clone') {
            echo 'Cloning..'
            git url: 'https://github.com/LucasTeixeira793/iara-backend.git'
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}