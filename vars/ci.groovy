def call() {
pipeline {
   agent any 
   stages {

      stage('compile') {
         steps {
            echo 'compile'
         } 
      }

      stage('testcases') {
         steps {
            echo 'testcases'
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
