pipeline {
    agent any

    stages {
        stage ('Build Stage') {
            withMaven(maven: 'Maven36'){
                sh 'mvn clean compile'
            }
        }

        stage ('Test Stage') {
            withMaven(maven: 'Maven36'){
                sh 'mvn test'
            }
        }

        stage ('Deploy Stage') {
            withMaven(maven: 'Maven36'){
                sh 'mvn deploy'
            }
        }
    }

}