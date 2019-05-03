pipeline {
    agent any

    stages {
        steps ('Build Stage') {
            withMaven(maven: 'Maven36'){
                bat 'mvn clean compile'
            }
        }

        steps ('Test Stage') {
            withMaven(maven: 'Maven36'){
                bat 'mvn test'
            }
        }

        steps ('Deploy Stage') {
            withMaven(maven: 'Maven36'){
                bat 'mvn deploy'
            }
        }
    }

}