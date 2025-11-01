def call() {
    echo "⚙️ Building Java project from shared library..."
    sh 'ls -la'  
    sh 'mvn -q -DskipTests=true clean package'
    echo "✅ Build completed successfully!"
}
