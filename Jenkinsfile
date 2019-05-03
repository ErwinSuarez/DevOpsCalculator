pipeline {
    agent any

    stages {
        stage ('Build Stage') {
            withMaven(maven: 'Maven36'){
                bat 'mvn clean compile'
            }
        }

        stage ('Test Stage') {
            withMaven(maven: 'Maven36'){
                bat 'mvn test'
            }
        }

        stage ('Deploy Stage') {
            withMaven(maven: 'Maven36'){
                bat 'mvn deploy'
            }
        }
    }

}