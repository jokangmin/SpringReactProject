pipeline {
    agent any

    stages {
        stage('Build Spring') {
            steps {
                // Spring 프로젝트 빌드
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Deploy Spring') {
            steps {
                // Tomcat 서버에 Spring 프로젝트 배포
                sh 'cp target/*.war /Users/jokangmin/Documents/Web/lib/apache-tomcat-9.0.93/webapps/' // Tomcat의 webapps 디렉토리 경로로 수정
            }
        }
    }
}

