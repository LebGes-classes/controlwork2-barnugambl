public class Cat extends Animal{
    @Override
    public void eat(){
        sytost = (int)(Math.random()*100);
        System.out.println("Изначальная сытость кошки - " + sytost);
        System.out.println("Мяу!");
        sytost += (int)(Math.random()*75);
        if (sytost > 100){
            sytost = 100;

        }
        System.out.println("Сытость кошки - " + sytost);
    }
    public Cat(){

    }


}
