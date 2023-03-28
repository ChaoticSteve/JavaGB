/**Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/
import java.util.*;

class Task6_1 {
    public static void main(String[] args) {
        HashSet<Notebook> shop = new HashSet<>();
        addNoteBook(shop);
        HashMap<String, String> filters = new HashMap<>();
        startMenu(filters);
        System.out.println(runFilter(shop, filters));
    }

    public static HashSet<Notebook> addNoteBook(HashSet<Notebook> product) {
        Notebook Lenovo1 = new Notebook("Lenovo", "G730", "15", "8Gb", "1TB", "Linux", "black");
        Notebook Lenovo2 = new Notebook("Lenovo", "G530", "15", "8Gb", "500GB", "Linux", "black");
        Notebook Lenovo3 = new Notebook("Lenovo", "Legion 5", "15", "16Gb", "1TB+240GB", "Windows10", "black");
        Notebook Mac = new Notebook("Apple", "MacBook Pro", "14", "16Gb", "1TB", "MacOS", "grey");
        Notebook Huawei = new Notebook("HP", "Pavilion 6", "15", "8Gb", "320GB", "Windows10", "grey");
        Notebook Asus = new Notebook("ASUS", "ZenBook 13", "13", "8Gb", "500GB", "Windows10", "blue");

        product.add(Lenovo1);
        product.add(Lenovo2);
        product.add(Lenovo3);
        product.add(Mac);
        product.add(Huawei);
        product.add(Asus);

        return product;
    }

    public static HashMap<String, String> startMenu(HashMap<String, String> filters) {
        Scanner isScanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Выберите производителя");
            System.out.println("2. Выберите объем жесткого диска");
            System.out.println("3. Выберите объем оперативной памяти");
            System.out.println("4. Выберите операционную систему");
            System.out.println("5. Выберите цвет ноутбука");
            System.out.println("0. Вывод ноутбуков по заданным параметрам");
            System.out.printf(">>> ");
            choice = isScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите название производителя:");
                    String brand = new Scanner(System.in).nextLine();
                    filters.put("brand", brand);
                    break;
                case 2:
                    System.out.println("Введите объем жесткого диска:");
                    String hardDisk = new Scanner(System.in).nextLine();
                    filters.put("hardDisk", hardDisk);
                    break;
                case 3:
                    System.out.println("Введите объем оперативной памяти:");
                    String operativeMemory = new Scanner(System.in).nextLine();
                    filters.put("operativeMemory", operativeMemory);
                    break;
                case 4:
                    System.out.println("Введите операционную систему:");
                    String system = new Scanner(System.in).nextLine();
                    filters.put("system", system);
                    break;
                case 5:
                    System.out.println("Введите цвет ноутбука:");
                    String color = new Scanner(System.in).nextLine();
                    filters.put("color", color);
                    break;
                default:
                    break;
            }
        } while (choice > 0);
        return filters;
    }

    public static List<Notebook> runFilter(HashSet<Notebook> product, HashMap<String, String> filters) {
        List<Notebook> productSelection = new ArrayList<>();

        for (Notebook notebook : product) {
            String filterBrand = filters.get("brand");
            if (filterBrand != null
                    && !filterBrand.equals(notebook.getBrand())) {
                continue;
            }

            String filterModel = filters.get("model");
            if (filterModel != null
                    && !filterModel.equals(notebook.getModel())) {
                continue;
            }

            String filterDiagonal = filters.get("diagonal");
            if (filterDiagonal != null
                    && !filterDiagonal.equals(notebook.getDiagonal())) {
                continue;
            }

            String filterOperativeMemory = filters.get("operativeMemory");
            if (filterOperativeMemory != null
                    && !filterOperativeMemory.equals(notebook.getOperativeMemory())) {
                continue;
            }

            String filterHardDisk = filters.get("hardDisk");
            if (filterHardDisk != null
                    && !filterHardDisk.equals(notebook.getHardDisk())) {
                continue;
            }

            String filterSystem = filters.get("system");
            if (filterSystem != null
                    && !filterSystem.equals(notebook.getMySystem())) {
                continue;
            }

            String filterColor = filters.get("color");
            if (filterColor != null
                    && !filterColor.equals(notebook.getColor())) {
                continue;
            }
            productSelection.add(notebook);
        }

        return productSelection;
    }
}