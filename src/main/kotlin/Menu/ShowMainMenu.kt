package Menu
import cart.InputUser.Companion.readIntInput
import execution.ExecutionMenuPrincipal

class ShowMainMenu:DisplayMenu {

    override fun exibirMenu() :Int{
        println()
        println("===== MENU INICIAL =====")
        println("1.Lanche")
        println("2.Bebida")
       return ExecutionMenuPrincipal().execute(readIntInput("Escolha a opção desejada: "))
    }

}