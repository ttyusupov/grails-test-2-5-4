package org.tyusupov

import grails.test.mixin.Mock
import grails.test.mixin.TestMixin
import grails.test.mixin.domain.DomainClassUnitTestMixin
import spock.lang.Specification

/**
 * @author Timur
 * @date 2016-04-28.
 */
@TestMixin(DomainClassUnitTestMixin)
@Mock([TestObj, TestObj2])
class TestSpec extends Specification {

    def setup() {
        new TestObj(name: "name").save(failOnError: false, flush: true)
        new TestObj2(name: "name").save(failOnError: false, flush: true)
    }

    def "test"() {
        expect: true
    }
}
