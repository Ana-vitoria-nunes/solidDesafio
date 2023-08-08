package Payment

class creditAndDebit: ProcessPayment {
    override fun payment(valuePurchase:Double,valueClient:Double):String{
        return "Compra finalizada com sucesso! Boa refeição. Pagamento: Cartão"
    }
}