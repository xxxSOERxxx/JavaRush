package JavaRush14;

class UkrainianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 55;
        }

        @Override
        String getDescription() {
            String text = super.getDescription() + "Моя страна - " + Country.UKRAINE +  ". Я несу " +
                    this.getCountOfEggsPerMonth() + " яиц в месяц.";
            return text;
        }
    }
