package execution
import cart.InputUser.Companion.carrinho
import cart.InputUser.Companion.readIntInput

class ExecutionModificarProduto:MenuOption {

    override fun execute(opcao: Int): Int {
        when (opcao) {
            1 -> {
                println("=== ADICIONAR ADICIONAIS ===")
                println("Adicionais disponíveis:")
                val adicionais = mutableMapOf<String, Double>()
                adicionais["Milho"] = 0.00
                adicionais["Batata palha"] = 0.00
                adicionais["ovo"] = 0.00
                adicionais["Bacon"] = 0.00
                adicionais["Picles"] = 0.00
                adicionais["Cebola Caramelizada"] = 0.00
                var cont = 1
                for ((chave, valor) in adicionais) {
                    println("${cont}. $chave - R$ ${String.format("%.2f", valor)}")
                    cont++
                }
                val codigoItem=readIntInput("Digite o código do item que deseja editar: ")

                val itemSelecionado = carrinho[codigoItem]

                if (itemSelecionado == null) {
                    println("Código de item inválido ou item não encontrado.")

                }
                val opcaoAdicional = readIntInput("Escolha o número do adicional que deseja adicionar ou 0 para cancelar: ")
                if (opcaoAdicional == 0) {
                    println("Operação cancelada. O item não foi alterado.")

                }
                val adicionalSelecionado = adicionais.entries.elementAtOrNull(opcaoAdicional - 1)
                if (adicionalSelecionado != null) {
                    val (nomeAdicional, precoAdicional) = adicionalSelecionado
                    itemSelecionado!!.descricao = itemSelecionado!!.descricao + listOf(nomeAdicional)
                    itemSelecionado.valor += precoAdicional
                    println("$nomeAdicional adicionado ao item com sucesso! Preço adicional: R$ ${String.format("%.2f", precoAdicional)}")

                }
            }
            2 -> {
                println("=== REMOVER INGREDIENTES ===")
                val codigoItem=readIntInput("Digite o código do item que deseja remover Igredientes: ")

                val itemSelecionado = carrinho[codigoItem]

                if (itemSelecionado == null) {
                    println("Código de item inválido ou item não encontrado.")
                }
                println("Ingredientes atuais do item:")
                for ((index, ingrediente) in itemSelecionado!!.descricao.withIndex()) {
                    println("${index + 1}. $ingrediente")
                }
                val opcaoIngrediente = readIntInput("Escolha o número do ingrediente que deseja remover ou 0 para cancelar: ")

                if (opcaoIngrediente == 0) {
                    println("Operação cancelada. O item não foi alterado.")

                }
                if (opcaoIngrediente !in 1..itemSelecionado.descricao.size) {
                    println("Opção inválida.")

                }
                val ingredienteRemovido = itemSelecionado.descricao[opcaoIngrediente - 1]
                if (itemSelecionado != null) {
                    itemSelecionado.descricao = itemSelecionado.descricao - listOf(ingredienteRemovido)
                }
                println("$ingredienteRemovido removido do item com sucesso!")
            }
            else -> {
                println("Opção inválida.Digite novamente")
            }
        }
        return 0
    }
}