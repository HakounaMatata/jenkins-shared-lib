def buildAndPush(image, version) {
    echo "🐳 Building and pushing Docker image ${image}:${version}"
    sh """
        docker build -t ${image}:${version} -t ${image}:latest .
        docker push ${image}:${version}
        docker push ${image}:latest
    """
}
