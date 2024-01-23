import java.util.ArrayList;
import java.util.Set;
public class BookStore
{
    private final String            bookStoreName;
    private final ArrayList<Novel>  novelReferences;

    public BookStore(final String       bookStoreName,
                     final ArrayList<Novel>  novelReferences)
    {
        if(bookStoreName == null || bookStoreName.isBlank())
        {
            this.bookStoreName = null;
        }
        else if(bookStoreName.equalsIgnoreCase("Amazon"))
        {
            this.bookStoreName = "Chapters";
        }
        else
        {
            this.bookStoreName = bookStoreName;
        }
        this.novelReferences = new ArrayList<>();
        novelReferences.add(null);
        novelReferences.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novelReferences.add(new Novel("All the King's Men", "Robert Penn Warren", 1946));
        novelReferences.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novelReferences.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novelReferences.add(new Novel("Animal Farm", "George Orwell", 1946));
        novelReferences.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novelReferences.add(new Novel(null, null, 0));
        novelReferences.add(new Novel(null, "author name 1", 0));
        novelReferences.add(new Novel("", null, 0));
        novelReferences.add(new Novel(null, "", 0));
        novelReferences.add(new Novel("title 1", null, 0));
        novelReferences.add(new Novel("", "", 0));
        novelReferences.add(new Novel("", "author name 2", 0));
        novelReferences.add(new Novel("title 2", null, 0));
        novelReferences.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novelReferences.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novelReferences.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novelReferences.add(new Novel("Atonement", "Ian McEwan", 2002));
        novelReferences.add(new Novel("Beloved", "Toni Morrison", 1987));
        novelReferences.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novelReferences.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novelReferences.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novelReferences.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novelReferences.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novelReferences.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novelReferences.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novelReferences.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novelReferences.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novelReferences.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novelReferences.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novelReferences.add(new Novel("The Correction", "Jonathan Franzen", 2001));
        novelReferences.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novelReferences.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novelReferences.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novelReferences.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novelReferences.add(new Novel("A Death in the Family", "James Agee", 1958));
        novelReferences.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novelReferences.add(new Novel("Deliverance", "James Dickey", 1970));
        novelReferences.add(new Novel("Dog Soldier", "Robert Stone", 1974));
        novelReferences.add(new Novel("Falconer", "John Cheever", 1977));
        novelReferences.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novelReferences.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novelReferences.add(new Novel("Go Tell it on the Mountain", "James Baldwin", 1953));
        novelReferences.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novelReferences.add(new Novel("The Grapes of Wrath", "John Steinback", 1939));
        novelReferences.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novelReferences.add(new Novel("The Great Gatsby", "F. Scott Fritzgerald", 1925));
        novelReferences.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novelReferences.add(new Novel("The Heart is a Lonely Hunter", "Carson McCullers", 1940));
        novelReferences.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novelReferences.add(new Novel("Herzog", "Saul Bellow", 1964));
        novelReferences.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novelReferences.add(new Novel("A House of Mr. Biswas", "V.S. Naipaul", 1964));
        novelReferences.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novelReferences.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novelReferences.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novelReferences.add(new Novel("Light in August", "William Faulkner", 1932));
        novelReferences.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novelReferences.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novelReferences.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novelReferences.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novelReferences.add(new Novel("Loving", "Henry Green", 1945));
        novelReferences.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novelReferences.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novelReferences.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novelReferences.add(new Novel("Money", "Martin Amis", 1984));
        novelReferences.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novelReferences.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novelReferences.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novelReferences.add(new Novel("Native Son", "Richard Wright", 1940));
        novelReferences.add(new Novel("Neuromancer", "William Gibson", 1984));
        novelReferences.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novelReferences.add(new Novel("1984", "George Orwell", 1948));
        novelReferences.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novelReferences.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novelReferences.add(new Novel("The Painted Bird", "Jerzy kosinski", 1965));
        novelReferences.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novelReferences.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novelReferences.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novelReferences.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novelReferences.add(new Novel("Posession", "A.S. Byatt", 1990));
        novelReferences.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novelReferences.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novelReferences.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novelReferences.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novelReferences.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novelReferences.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novelReferences.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novelReferences.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novelReferences.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novelReferences.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novelReferences.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novelReferences.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novelReferences.add(new Novel("The Spy Who Came in from the Cold", "John le Carre", 1986));
        novelReferences.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novelReferences.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novelReferences.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novelReferences.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novelReferences.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novelReferences.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novelReferences.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novelReferences.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novelReferences.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novelReferences.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novelReferences.add(new Novel("White Noise", "Don DeLillo", 1985));
        novelReferences.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novelReferences.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));
    }
}
