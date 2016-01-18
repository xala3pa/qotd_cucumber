package qotd

class QuoteController {

    def index() { }

    def random () {
        def staticAuthor = "Conrad Hall"
        def staticContent = "You are always a student, never a master. You have to keep moving forward."
            [author: staticAuthor, content: staticContent]
    }
}
