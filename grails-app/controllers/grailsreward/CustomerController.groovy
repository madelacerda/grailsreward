package grailsreward

class CustomerController {
    static scaffold = Customer
    def calculationsService

    def lookup() {
        def customerInstance = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("Ma%", 2, [sort: "totalPoints"])
        [customerInstanceList: customerInstance]
    }

    def checkin() {

    }

    def index() {
        params.max = 10
        [customerInstanceList: Customer.list(params), customerInstanceCount: Customer.count()]
    }


    def create() {
        [customerInstance: new Customer()]
    }

    def save(Customer customerInstance) {
        customerInstance.save()
        redirect(action: "show", id: customerInstance.id)
    }

    def show(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance = calculationsService.getTotalPoints(customerInstance)
        [customerInstance: customerInstance]
    }


    def edit(Long id) {
        def customerInstance = Customer.get(id)
        [customerInstance: customerInstance]
    }

    def update(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance.properties = params
        customerInstance.save()
        redirect(action: "show", id: customerInstance.id)
    }

    def delete(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance.delete()
        redirect(action: "index")
    }

    def customerLookup(lookupInstance) {
        def (customerInstance, welcomeMessage) = calculationService.processCheckin(lookupInstance)
        render(view: "checkin", model: [customerInstance: customerInstance, welcomeMessage: welcomeMessage])
    }

}
