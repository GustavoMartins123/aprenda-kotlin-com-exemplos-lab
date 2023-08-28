// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { 
    BASICO, 
    INTERMEDIARIO, 
    AVANCADO
}

enum class Type{
    MOBILE,
    WINDOWS,
    WEB
}

enum class SubType{
    ANDROID,
    IOS,
    HTML,
    CSHARP,
    JAVA
}

data class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel)

data class Curso(val nome: String, val Categoria: Type, val Conteudo: SubType, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudo = ConteudoEducacional("Introdução à Programação", 60, Nivel.BASICO)
    val curso = Curso("Curso de Android", Type.MOBILE, SubType.ANDROID, Nivel.INTERMEDIARIO)

    println("Conteúdo: ${conteudo.nome}, Duração: ${conteudo.duracao}, Nível: ${conteudo.nivel}")
    println("Curso: ${curso.nome}, Categoria: ${curso.Categoria}, Conteudo: ${curso.Conteudo}, Nível: ${curso.nivel}")
}
