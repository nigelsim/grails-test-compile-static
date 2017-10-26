package grails.test

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class TestController {

    def index() { 
        log.info("In Index")
        respond(Person.findAll())
    }
    
    def get(Long id) {
        respond(Person.get(id))
    }
}
