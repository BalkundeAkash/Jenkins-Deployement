pipeline {
    agent any

    tools {
        maven 'Maven-3.9 (or anything you want)'
        jdk 'JDK17'
    }

    environment {
        DOCKER_CRED = credentials('dockerhub-cred')
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    credentialsId: 'Git-PAT',
                    url: 'https://github.com/BalkundeAkash/Jenkins-Deployement.git'
            }
        }

        stage('Build Spring Boot') {
            steps {
                sh '''
                    cd HospitalManagement
                    mvn clean package -DskipTests
                '''
            }
        }

        stage('Docker Build') {
            steps {
                sh """
                    docker build -t ${DOCKER_CRED_USR}/jenkins-deployment-app:latest .
                """
            }
        }

        stage('Docker Login') {
            steps {
                sh """
                    echo ${DOCKER_CRED_PSW} | docker login -u ${DOCKER_CRED_USR} --password-stdin
                """
            }
        }

        stage('Docker Push') {
            steps {
                sh """
                    docker push ${DOCKER_CRED_USR}/jenkins-deployment-app:latest
                """
            }
        }

        stage('Docker Run on Localhost') {
            steps {
                sh """
                    docker rm -f deploy-app || true
                    docker run -d --name deploy-app -p 8080:8080 ${DOCKER_CRED_USR}/jenkins-deployment-app:latest
                """
            }
        }
    }

    post {
        success {
            echo "🚀 Application Running at: http://localhost:8080"
        }
        failure {
            echo "❌ Build Failed"
        }
    }
}
