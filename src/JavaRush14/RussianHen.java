package JavaRush14;

class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 45;
    }

    @Override
    String getDescription() {
        String text = super.getDescription() + "Моя страна - Russian. Я несу " +
                this.getCountOfEggsPerMonth() + " яиц в месяц.";
        return text;
    }
}
