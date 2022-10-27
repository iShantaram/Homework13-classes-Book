public class Author {
    private final String firstName;
    private final String lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName.replaceAll("\\p{Punct}", "").trim();
        this.lastName = lastName.replaceAll("\\p{Punct}", "").trim();
    }

    Author(String fullname) {
        /*
        Если передана одна строка в качестве автора, то:
        1. заменяем все знаки на пробелы
        2. все множественные пробелы заменяем на один " "
        3. удаляем пробелы в начале и в конце, если есть
        4. разделяем оставшуюся строку по первому пробелу на две
        5. всю вторую часть считаем фамилией =), если второй части нет - заполняем пустой строкой
         */
        String[] names = fullname.replaceAll("\\p{Punct}", " ").replaceAll("\\s{2,}", " ").trim().split("\\s", 2);
        this.firstName = names[0];
        if (names.length == 2) {
            this.lastName = names[1];
        } else {
            this.lastName = "";
        }
    }

    public String toString() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
