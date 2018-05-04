package grails.clover.integrationtest

import grails.testing.mixin.integration.Integration
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
class FooServiceSpec extends Specification {

    @Autowired
    FooService fooService

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:
        fooService.something()
        then:
        true
    }
}
