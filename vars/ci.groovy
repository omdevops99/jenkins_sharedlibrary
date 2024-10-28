def call() {
    node {
        sh 'env'
        if(Branch_name == "main") {
        stage('code compile'){}
        stage('code checkout'){}
        stage('code Build'){}
        }
        else
        stage('code checkout'){}
        stage('code test cases'){}
        stage('code integration test cases'){}
    }
}