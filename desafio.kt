// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { Basico, Intermediario, Avancado }

class Usuario(val nome : String, val idade : Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        if(usuario.idade >= 18){
        	inscritos.add(usuario)
            println("${usuario.nome} foi matriculado(a) na formação de ${nome}, nível: $nivel")
        }
        else{
            println("A idade mínima para matrícula é de 18 anos, tente novamente")
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val usuario1 = Usuario("Alice", 10)
    val usuario2 = Usuario("Jeferson", 30)
    val usuario3 = Usuario("Gustavo", 22)
    
    val conteudo1 = ConteudoEducacional("Fundamentos de Programação", 60)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 100)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados", 130)
    
    val formacao = Formacao("Desenvolvimento de Software", mutableListOf(conteudo1, conteudo2, conteudo3), Nivel.Basico)
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    
    println("Inscritos na formação de ${formacao.nome}:")
    for (inscrito in formacao.inscritos) {
        println("- Nome: ${inscrito.nome}, Idade: ${inscrito.idade}")
    } 
    for(duracao in formacao.conteudos){
        println("Conteudos: ${duracao.nome}, com carga horária de: ${duracao.duracao} horas")
    }
}
