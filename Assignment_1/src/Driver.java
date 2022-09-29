public class Driver {

    public static void main(String[] args) {
        Person[] personList = new Person[10];


        for (int i = 0; i < personList.length; i++) {
            personList[i] = new Person("Immi", "Chan", new Date(12, 4, 2022));
        }

        printPerson(personList);
        System.out.println("Total Persons : " + countPerson(personList));


    }



        public static void printPerson(Person personList[]) {

            for (int i = 0; i < personList.length; i++) {
                if (personList[i] != null)
                    System.out.println(personList[i]);
            }
        }

        public static int countPerson(Person personList[]){

        int counter = 0;
        for(int i = 0; i < personList.length; i++){
            if(personList[i]!=null)
                counter++;
        }
        return counter;

        }
    }

