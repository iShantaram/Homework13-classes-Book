public class Homework13 {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", pushkin, 2010);

        Author heminguej = new Author("  Эрнест   ,    ?Хэмингуэй .");
        //Author heminguej = new Author("  ");
        Book starikimore = new Book("Старик и море", heminguej);

        Author exupery = new Author("Антуан де Сент-Экзюпери");
        Book prince = new Book("Маленький принц", exupery, 1946);

        System.out.println("Книга " + onegin.getName() + ", автор " + onegin.getAuthor() +
                ", год издания " + onegin.getYearOfPublishing());

        starikimore.setYearOfPublishing(2002);
        System.out.println(starikimore);

        System.out.println("Книга " + prince.getName() + ", автор " + prince.getAuthor().getFirstName() +
                " " + prince.getAuthor().getLastName() + ", год издания " + prince.getYearOfPublishing());
    }
}