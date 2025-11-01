def call() {
    echo "⚙️ Building Java project from shared library..."
    dir('python-iti') { 
        sh 'mvn -q -DskipTests=true clean package'
        sh 'cp target/demo1-0.0.1-SNAPSHOT.jar target/app.jar'
    }
}
