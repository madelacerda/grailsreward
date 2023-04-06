package grailsreward

class BootStrap {

    def init = { servletContext ->
        new Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new Product(name: "Dark Blend", sku: "MB02", price: 11.95).save()
        new Customer(phone: 13621526, firstName: "Matias", lastName: "de la cerda", totalPoints: 3).save()
        new Customer(phone: 23123131, firstName: "Maria", lastName: "de la cerda", totalPoints: 6).save()
        new Customer(phone: 213123123, firstName: "Edgardo", lastName: "de la cerda", totalPoints: 5).save()
        new Customer(phone: 123123123, firstName: "Paula", lastName: "tecas", totalPoints: 6).save()
        new Customer(phone: 5645646456, firstName: "Benja", lastName: "sadasd", totalPoints: 1).save()
        new Customer(phone: 546453221, firstName: "Florencia", lastName: "buzeta", totalPoints: 8).save()
        new Customer(phone: 546546452, firstName: "Freddy", lastName: "pineda", totalPoints: 2).save()
        new Customer(phone: 31231231231, firstName: "Paula", lastName: "tecas", totalPoints: 6).save()
        new Customer(phone: 5562131256, firstName: "Benja", lastName: "sadasd", totalPoints: 1).save()
        new Customer(phone: 543562112, firstName: "Florencia", lastName: "buzeta", totalPoints: 8).save()
        new Customer(phone: 7665867934, firstName: "Freddy", lastName: "pineda", totalPoints: 2).save()
        new Customer(phone: 84968468401, firstName: "Freddy", lastName: "pineda", totalPoints: 2).save()
        new Customer(phone: 98789555522, firstName: "Paula", lastName: "tecas", totalPoints: 6).save()
        new Customer(phone: 643157420, firstName: "Benja", lastName: "sadasd", totalPoints: 1).save()
        new Customer(phone: 7896454545, firstName: "Florencia", lastName: "buzeta", totalPoints: 8).save()
        new Customer(phone: 467972457, firstName: "Freddy", lastName: "pineda", totalPoints: 2).save()
    }
    def destroy = {
    }
}
