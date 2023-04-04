public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author blok = new Author("Александр", "Блок");

        Book ruslanLudmila = new Book("Руслан и Людмила", pushkin, 1820);
        Book ruslanLudmila2 = new Book("Руслан и Людмила", pushkin, 1821);

        Book stranger = new Book("Незнакомка", blok, 1906);

        // System.out.println("Заголовок книги: " + ruslanLudmila.getTitle());
        // System.out.println("Год издания книги: " + ruslanLudmila.getPublishingYear() );

        ruslanLudmila.setPublishingYear(1821);

        // System.out.println("Год переиздания книги: " + ruslanLudmila.getPublishingYear());

        // System.out.println("Заголовок книги: " + stranger.getTitle());
        // System.out.println("Год издания книги: " + stranger.getPublishingYear() );

        System.out.println(pushkin.toString());
        System.out.println(ruslanLudmila.toString());

        System.out.println(blok.hashCode());
        System.out.println(stranger.hashCode());

        System.out.println(ruslanLudmila.equals(stranger));
        System.out.println(ruslanLudmila.equals(ruslanLudmila2));
    }
}
