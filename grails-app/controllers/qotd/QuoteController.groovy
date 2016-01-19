package qotd

class QuoteController {

    static scaffold = true

    def random () {
        def allQuotes = Quote.list()
        def randomQuote

        if (allQuotes.size() > 0) {
            def randomIndex = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIndex]
        } else {
            randomQuote = new Quote(author: "Anonymous",
                    content: "Real Programmers Don't eat much Quiche")
        }
        [quote: randomQuote]
    }
}
