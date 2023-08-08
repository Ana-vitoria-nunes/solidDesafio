package Payment

class MealTicket : ProcessPayment {
    override fun payment(valuePurchase:Double,valueClient:Double):String{
        return "Compra finalizada com sucesso! Boa refeição. Pagamento: Vale refeição"
    }
}