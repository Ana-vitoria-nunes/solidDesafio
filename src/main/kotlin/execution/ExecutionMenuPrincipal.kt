package execution

import Menu.ShowDrinkMenu
import Menu.ShowSnackMenu

class ExecutionMenuPrincipal : MenuOption {
    override fun execute(opcao: Int): Int {
        when (opcao) {
            1 -> {
                ShowSnackMenu().exibirMenu()
            }

            2 -> {
                ShowDrinkMenu().exibirMenu()
            }
            else -> {
                println("Opção inválida.")
            }
        }

        return 0
    }
}