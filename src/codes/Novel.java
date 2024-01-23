public class Novel
{
    private final String    bookTitle;
    private final String    authorName;
    private final int       yearPublished;

    public Novel(final String   bookTitle,
                 final String   authorName,
                 final int      yearPublished)
    {
        if(bookTitle == null || bookTitle.isBlank())
        {
            this.bookTitle = null;
        }
        else
        {
            this.bookTitle = bookTitle;
        }

        if(authorName == null || authorName.isBlank())
        {
            this.authorName = null;
        }
        else
        {
            this.authorName = authorName;
        }

        this.yearPublished = Math.max(yearPublished, 0); //to catch negative entries
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }
}
