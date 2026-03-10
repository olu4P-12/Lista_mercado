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
            4 -> verLista(lista)
            0 -> sairDaLista(lista)

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


fun alterarPreco(lista: MutableMap<String, Double>) {
    print("Produto para alterar preço: ")
    val nome = readLine()!!

    if (lista.containsKey(nome)) {
        print("Novo preço: ")
        val novoPreco = readLine()!!.toDouble()
        lista[nome] = novoPreco
        println("Preço atualizado!")
    } else {
        println("Produto não encontrado.")
    }
}

fun verLista(lista : MutableMap<String,Double>){


    println("Lista de produtos")

    if (lista.isEmpty()){
        print("Lista vazia")
    }else{
        for ((nome, preco) in lista){
            println("$nome - R$ $preco")



            }
        }
    }

fun sairDaLista(lista : MutableMap<String,Double>) {


        println("Encerrando Lista")

         }




