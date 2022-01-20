package classes

class MovieList(val genre : String){
    private val movies = ArrayList<String>()

    fun addMovie(movie: String){
        movies.add(movie)
    }

    fun print(){
        println("Movie List: $genre")
        for (movie in movies){
            print("$movie ")
        }
        println()
    }
}

class MovieGoer{
    private var movieList = HashMap<String, MovieList>()
    fun addList(list:MovieList){
        movieList[list.genre] = list
    }

    fun addGenre(genre:String){
        movieList[genre] = MovieList(genre)
    }

    fun movieListFor(genre: String) : MovieList? {
        return movieList[genre]
    }

    fun addMovie(genre: String, movie : String){
        if(!movieList.containsKey(genre)){
            addGenre(genre)
        }
        movieList[genre]?.addMovie(movie)
    }
}

fun main(args: Array<String>){
    val jane = MovieGoer()
    val jonh = MovieGoer()

//    val actionsList = MovieList("action")
//    jane.addList(actionsList)
//    jonh.addList(actionsList)

    jane.addMovie("action", "rambo")
    jane.addMovie("action", "rambo2")

    jonh.addMovie("action", "rambo3")
    jonh.addMovie("action", "rambo4")

    jane.movieListFor("action")?.print()
    jonh.movieListFor("action")?.print()

}
