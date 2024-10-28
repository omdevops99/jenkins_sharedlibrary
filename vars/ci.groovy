def call() {
    node {
        sh 'env'
        if(Branch_name == "main") {
        stage('code compile'){}
        stage('code checkout'){}
        stage('code Build'){}
        }
        else if(Branch_name ==~ 'PR.*') {
        stage('code checkout'){}
        stage('code compile'){}
        stage('code test cases'){}
        stage('code integration test cases'){}        
        }
        else {
        stage('code checkout'){}
        stage('code compile'){}
        stage('code test cases'){}
        }
    }
}






////