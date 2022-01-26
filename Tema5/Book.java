package Tema5;
    /**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */



class Book
{
    // The fields.
    private String author;
    private String title;
    private int pagina;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
   

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages, boolean cursado)
    {
        author = bookAuthor;
        title = bookTitle;
        pagina=pages;
        refNumber="";
        borrowed=0;
        courseText=cursado;

    }

    public String autor(){
        return author;

    }
    public String tituloLibro(){
        return title;
    }

    public void imprimirAutor(){
        System.out.println(author);
    }

    public void imprimirLibro(){
        System.out.println(title);
    }
    public int getPagina() {
        return pagina;
    }
    public void setRefNumber(String ref){
        if (ref.length()>3){
        this.refNumber=ref;
        }else{
            System.out.println("Error: La referencia debe ser mayor a tres caracteres");
        }
    }
    public void borrow(){
        borrowed=+1;
    }
    public int getBorrowed() {
        return borrowed;
    }
    public boolean isCourseText() {
        return courseText;
    }

    public void printDetail(){
        System.out.println("Autor: "+author +"\n"+"Titulo: "+title+"\n"+ "Paginas: "+pagina+"\n"+"Referencia del libro: "
        +refNumber+"\n"+"Veces que se ha prestado: "+borrowed+"\n"+"Es usado como libro de curso en la actualidad: "+courseText);
      
    }
    
}

