public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthDay = 13;
        post.birthMonth = 6;
        post.birthYear = 1999;

        {
            int birthDay = 13;
            int birthMonth = 6;
            int birthYear = 1999;
        }

    }

}