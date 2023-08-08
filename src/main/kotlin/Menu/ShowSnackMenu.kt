package Menu
import cart.InputUser.Companion.readIntInput
import execution.MenuLanche

class ShowSnackMenu : DisplayMenu {
    override fun exibirMenu(): Int {
        println("=== LANCHES ===")
        println("1. X-burger - R$ 10,00")
        println("2. X-salada - R$ 12,00")
        return MenuLanche().execute(readIntInput("Escolha o lanche desejado: "))
    }
}