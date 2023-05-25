package decorator;

class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }

    private void addChicken(){
        System.out.println("Dodano kurczaka!");
    }
}