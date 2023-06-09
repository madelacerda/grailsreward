package grailsreward

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {
        def firstName = params.first
        def totalPoints = params.points.toInteger()
        def welcomeMessage = " "
        switch (totalPoints) {
            case 5:
                welcomeMessage = "Welcome back $firstName, this drink is on us."
                break
            case 4:
                welcomeMessage = "Welcome back $firstName, your next drink is free"
                break
            case 2..3:
                welcomeMessage = "Welcome back $firstName, you now have $totalPoints points."
                break
            default:
                welcomeMessage = "Welcome back $firstName, thanks for registering"
        }
    }

    def getTotalPoints(customerInstance) {
        def totalAwards = 0
        customerInstance.awards.each {
            totalAwards = totalAwards + it.points
        }
        customerInstance.totalPoints = totalAwards
        return customerInstance
    }

    def processCheckin(lookupInstance) {
        def customerInstance = lookupInstance
        def welcomeMessage = "welcome back"
        return [customerInstance, welcomeMessage]
    }
}
