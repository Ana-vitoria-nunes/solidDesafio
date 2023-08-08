package Payment

class Cash: ProcessPayment {
    override fun payment(valuePurchase:Double,valueClient:Double):String{
        return if (valuePurchase>valueClient){
            val troco=valuePurchase-valueClient
            "Compra finalizada com sucesso! Boa refeição. Pagamento em dinheiro\nTroco: $troco."

        } else{
            "Valor insuficiente. Digite novamente o valor do dinheiro:"
        }
    }
}