package com.demo



import grails.test.mixin.*

import static org.hamcrest.CoreMatchers.*;

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Race)
class RaceTests {

    void testConvertsCorrectlyToMiles() {
		// given
		def race = new Race(distance: 5.0)
		
		// when
		assertEquals race.inMiles(), 3.10700
    }
}
