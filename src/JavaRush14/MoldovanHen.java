package JavaRush14;

class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 50;
    }

    @Override
    String getDescription() {
        String text = super.getDescription() + "Моя страна - Молдова. Я несу " +
                this.getCountOfEggsPerMonth() + " яиц в месяц.";
        return text;
    }
}
