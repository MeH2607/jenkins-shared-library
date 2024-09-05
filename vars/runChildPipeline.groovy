def call(String childJobName, Map params = [:]) {
    // Kør child pipeline uden at returnere build variabler
    def result = build job: childJobName, parameters: params.collect { k, v -> string(name: k, value: v) }, propagate: false
    // Returner ikke build variabler her, da parent pipeline håndterer artifacts
    return result
}
