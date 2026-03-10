fun main(){

    val lista = mutableMapOf<String, Double>() //String → nome do produto / Double → preço do produto


    var opcao : Int

    do {

        println("----- Lista do Mercado -----")
        println("1 - Adicionar Produto")
        println("2 - Remover Produto")
        println("3 - Alterar Preço")
        println("4 - Mostrar a Lista")
        println("0 - !!Sair!!")

        

        opcao = readLine()!!.toInt()

        when (opcao) { //funciona como um menu de decisões

            1 -> adicionarProduto(lista)
            2 -> removerProdutos(lista)
            3 -> alterarPreco(lista)
            4 -> verLista(lista)
            0 -> sairDaLista(lista)

        }

    }while (opcao != 0) //Esse do while faz o programa ficar repetindo o menu até o usuário escolher sair.

}

fun adicionarProduto(lista: MutableMap<String, Double>){

    print("Nome do Produto")
    val nome = readLine()!!

    println("Valor do Produto")
    val preco = readLine()!!.toDouble()

    lista [nome] = preco
    println("Produto adicionado")  //O programa pede:Nome do produto/ Preço do produto Depois salva no Map : lista[nome] = preco


}

fun removerProdutos(lista : MutableMap<String, Double>){

    print("Remover Produto")
    val nome = readLine()!!

    if (lista.remove(nome) != null){  //se retornar null  o produto não estava na lista
        println("produto removido")
    }else
        println("Produto nao encontrado")  //Se o produto existir → ele é removido/ Se não existir → aparece "Produto não encontrado"


}


fun alterarPreco(lista: MutableMap<String, Double>) {
    print("Produto para alterar preço: ")
    val nome = readLine()!!

    if (lista.containsKey(nome)) {
        print("Novo preço: ") // Primeiro verifica se o produto existe:
        val novoPreco = readLine()!!.toDouble()
        lista[nome] = novoPreco
        println("Preço atualizado!") //Se existir: pede o novo preço atualiza o valor


    } else {
        println("Produto não encontrado.") 

    }
}

fun verLista(lista : MutableMap<String,Double>){


    println("Lista de produtos")

    if (lista.isEmpty()){ // Primeiro verifica se a lista está vazia:
        print("Lista vazia") 
    }else{
        for ((nome, preco) in lista){
            println("$nome - R$ $preco") // Se tiver produtos, ele percorre o Map com: for ((nome, preco) in lista)





            }
        }
    }

fun sairDaLista(lista : MutableMap<String,Double>) {


        println("Encerrando Lista")

         }





