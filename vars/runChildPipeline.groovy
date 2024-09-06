def call(String childJobName, Map params = [:]) {
    def result = build job: childJobName, parameters: params.collect { k, v -> string(name: k, value: v) }, propagate: false
    return result
}
