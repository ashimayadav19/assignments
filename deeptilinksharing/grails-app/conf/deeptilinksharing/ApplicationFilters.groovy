package deeptilinksharing

class ApplicationFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                println "${params}"
            }
        }
    }
}
