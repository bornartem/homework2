public class homework2 {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var dog1 = 4;
        var dog2 = dog + dog1;
        System.out.println(dog2);
        var dog3 = 3.5;
        System.out.println(dog2-dog3); // сначала понял, что уже к полученному результату нужно прибавлять следующий
        var cat= 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat); // далее уже согласно заданию.
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        var friend1 = friend+2;
        System.out.println(friend1);
        var friend3 = friend1/7;
        System.out.println(friend3);

        var frog = 3.5;
        System.out.println(frog);
        var frog1 = frog*10;
        System.out.println(frog1);
        var frog2 = frog1/3.5;
        System.out.println(frog2);
        var frog3 = frog2+4;
        System.out.println(frog3);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1+weightBoxer2;
        System.out.println(totalWeight);
        var differenceWeight = weightBoxer1-weightBoxer2;
        System.out.println(differenceWeight);
        var differenceWeight1 = weightBoxer2-weightBoxer1;
        System.out.println(differenceWeight1);
        var differenceWeight2 = weightBoxer2%weightBoxer1;
        System.out.println(differenceWeight2);

        var totalWorkTime = 640;// 8 задача
        var workTimeEachWorker = 8;
        var numberWorkers = totalWorkTime/workTimeEachWorker;
        System.out.println("Всего работников в компании - " + numberWorkers +  " человек.");
        var numberWorkers1 = numberWorkers+94;
        System.out.println(numberWorkers1);
        var totalWorkTime1 = numberWorkers1*workTimeEachWorker;
        System.out.println(totalWorkTime1);
        System.out.println("Если в компании работает " +numberWorkers1 + " человек, то всего " + totalWorkTime1 + " часов работы может быть поделено между сотрудниками.");
    }
}