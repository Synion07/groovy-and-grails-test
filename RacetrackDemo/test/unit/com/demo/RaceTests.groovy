package com.demo



import grails.test.mixin.*
import org.junit.*

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
		assertThat race.inMiles(), is(3.10700)
    }
}
