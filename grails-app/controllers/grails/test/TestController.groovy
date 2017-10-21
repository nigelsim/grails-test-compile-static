package grails.test

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class TestController {

    def index() { 
        log.info("In Index")
    }
}
