fun main(){

    val lista = mutableMapOf<String, Double>()
    var opcao : Int

    do {

        println("----- Lista do Mercado -----")
        println("1 - Adicionar Produto")
        println("2 - Remover Produto")
        println("3 - Alterar Preço")
        println("4 - Mostrar a Lista")
        println("0 - !!Sair!!")

        opcao = readLine()!!.toInt()

        when (opcao) {

            1 -> adicionarProduto(lista)
            2 -> removerProdutos(lista)
            3 -> alterarPreco(lista)


        }

    }while (opcao != 0)

}

fun adicionarProduto(lista: MutableMap<String, Double>){

    print("Nome do Produto")
    val nome = readLine()!!

    println("Valor do Produto")
    val preco = readLine()!!.toDouble()

    lista [nome] = preco
    println("Produto adicionado")

}

fun removerProdutos(lista : MutableMap<String, Double>){

    print("Remover Produto")
    val nome = readLine()!!

    if (lista.remove(nome) != null){  //se retornar null  o produto não estava na lista
        println("produto removido")
    }else
        println("Produto nao encontrado")

}


fun alterarPreco(lista: MutableMap<String, Double>){





}



