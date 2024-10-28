def call() {
pipeline {
   agent any 
   stages {

      stage('compile') {
         when {
            branch  'main'
         }
         steps {
            echo 'compile'
         } 
      }

      stage('testcases') {
         steps {
            echo 'testcases'
         } 
      }

      stage('integration test cases') {
         steps {
            echo 'integration test cases'
         } 
      }

      stage('build') {
         steps {
            echo 'build'
         } 
      }

      stage('Release App') {
         steps {
            echo 'Release'
         } 
      }
   }
}

}
