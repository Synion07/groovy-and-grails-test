package com.demo

class Registration {
	
	static constraints = {
		race()
		runner()
		paid()
		dateCreated()
	}
	
	Boolean paid
	Date dateCreated
	
	static belongsTo = [race: Race, runner: Runner]
}
