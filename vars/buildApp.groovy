def call() {
    echo "⚙️ Building Java project from shared library..."
    sh 'mvn -q -DskipTests=true clean package'
    sh 'cp target/demo1-0.0.1-SNAPSHOT.jar target/app.jar'
}
