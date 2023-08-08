package product

import cart.InputUser
import ItemCarrinho
import cart.InputUser.Companion.readIntInput
import kotlin.random.Random

class LancheFactory {
    companion object {
        val inputUser= InputUser()
        fun criarLanche(opcao: Int): Lanche? {
            when (opcao) {
                1 -> {
                    val quant = readIntInput("Quantos X-burger você deseja:")
                    val descricao = listOf(
                        "Pão com gergelim", "Hambúrguer de carne", "Queijo cheddar",
                        "Bacon", "Alface", "Tomate", "Cebola", "Molho especial")
                    for (i in 1..quant) {
                        var codigo: Int
                        do {
                            codigo = Random.nextInt(1, 1000)
                        } while (codigo in carrinho)

                        val item = ItemCarrinho("X-burger", 1, 10.0, descricao)
                        carrinho[codigo] = item
                    }
                }
                2 -> {
                    val quant = readIntInput("Quantos X-salada você deseja:")
                    val descricao = listOf(
                        "Pão com gergelim", "Hambúrguer de carne", "Queijo prato",
                        "Alface", "Tomate", "Cebola", "Ketchup", "Maionese"
                    )
                    return Lanche("X-salada",quant,12.0,descricao)
                }
                else -> {
                    println("Opção inválida. Digite novamente.")
                }
            }
            return null
        }
    }
}
