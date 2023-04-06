package grailsreward

class WhiteboardController {

    def calculationsService

    def index() {}

    def variables() {
        def myTotal = 1
        render("total: " + myTotal)
        render("</br> total: " + myTotal.class)
        myTotal = myTotal + 1
        render("</br> New total: " + myTotal + "</br>")
        def firstName = "Matias"
        render("</br>Name: " + firstName)
        render(" </br> " + firstName.class)

        def today = new Date("2/1/2014")
        render("</br> Today is  " + today)
        render("</br>  " + today.class)


    }

    def strings() {
        def first = "Matias"
        def last = "de la cerda"
        def points = 4
        def fullName = "Matias de la Cerda"
        render "your string, $fullName, has ${fullName.length()} character in length"
    }

    def conditions() {
        def welcomeMessage = calculationsService.welcome(params)
        render(welcomeMessage)
    }
}
