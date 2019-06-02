package Phone;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.

public static void main(String[] args) {
        String[] words = {"Один","Два","Три","Четыре","Пять","Шесть","Семь","Восемь","Девять","Десять";
        HashMap <String, Integer> hm = new HashMap<>();
        for(String word: words) {
        Integer res = hm.get(word);
        hm.put(word, res == null ? 1 : res + 1);
        }

//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
public class Phone {
    private HashMap<String, ArrayList<String>> phone = new HashMap<>();

    public void add(String name, String telephone) {
        ArrayList<String> telephoneList = phone.get(name);
        if (telephoneList == null) telephoneList = new ArrayList<>();
        telephoneList.add(telephone);
        phone.put(name, telephoneList);
    }

    public ArrayList<String> get(String name) {
        return phone.get(name);
    }

    public void info() {
        System.out.println(phone);
    }

}