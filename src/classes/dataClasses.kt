package classes

fun main(args: Array<String>) {
    data class Podcast(val title: String, val description: String, val url: String)

    val podcast = Podcast("Adroid Central", "The Premier source for weekly news", "https://umaurl.com.br")
    val podcast2 = podcast.copy(title = "Developers Backstage")

    val (title, description, url) = podcast2
    println("title = $title, url = $url")
}