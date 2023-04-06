package grailsreward

class InventoryController {

    def index() {
        render( "here is a list of everything")
    }

    def remove(){
        render("you have one les than before")
    }

    def edit(){
        def productName = "Breakfast Blend"
        def sku = "BB01"
        [product:productName, sku:sku]
    }

    def list(){
        def allProducts = Product.list()
        [allProducts: allProducts]
    }
}
