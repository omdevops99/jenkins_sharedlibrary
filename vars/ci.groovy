def call() {
    node {
        sh 'env'
        stage('code compile'){}
        stage('code checkout'){}
        stage('code Build'){}
        stage('code test cases'){}
        stage('code integration test cases'){}
    }
}