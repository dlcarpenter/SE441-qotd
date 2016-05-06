package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	def "test for valid quote text"() {
		when: 'text is empty'
			def p = new Quote(text: '')
		then: 'validation should fail'
			!p.validate()
		// TODO: add new tests for null text (should fail) and
	}
}
