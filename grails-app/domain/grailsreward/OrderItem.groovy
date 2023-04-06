package grailsreward

class OrderItem {

    Integer qty
    Float total
    static belongsTo = [order:CustomerOrder, product:Product]

    static constraints = {
    }
}
