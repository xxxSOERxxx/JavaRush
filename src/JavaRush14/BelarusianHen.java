package JavaRush14;

class BelarusianHen extends Hen {
    String Sssss = "Belarus";
    int N = 60;
    @Override
    int getCountOfEggsPerMonth() {
        return this.N;
    }

    @Override
    String getDescription() {
        String text = super.getDescription() + "Моя страна - " + Sssss + ". Я несу " +
                this.getCountOfEggsPerMonth() + " яиц в месяц.";
        return text;
    }
}
