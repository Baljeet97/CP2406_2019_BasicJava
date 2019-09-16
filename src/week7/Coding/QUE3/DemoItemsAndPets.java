package week7.Coding.QUE3;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold lego = new ItemSold();
        lego.setInvoiceNumber(84119484);
        lego.setDescription("The Lego Age +5");
        lego.setPrice(20);

        ItemSold fireTruck = new ItemSold();
        fireTruck.setInvoiceNumber(84224948);
        fireTruck.setDescription("Fire Truck");
        fireTruck.setPrice(30);

        PetSold max = new PetSold();
        max.setHouseBroken(true);
        max.setNeutered(false);
        max.setVaccinated(false);

        PetSold sheila = new PetSold();
        sheila.setHouseBroken(false);
        sheila.setVaccinated(true);
        sheila.setNeutered(true);

        System.out.println("SOld Item 1-" + "\nInvoice Number : " + lego.getInvoiceNumber() + "\nDescription: " + lego.getDescription() + "\nPrice: $" + lego.getPrice());
        System.out.println("SOld Item 2-" + "\nInvoice Number : " + fireTruck.getInvoiceNumber() + "\nDescription: " + fireTruck.getDescription() + "\nPrice: $" + fireTruck.getPrice());
        System.out.println();
        System.out.println("Sold Pet 1 Status-" + "\nHouse Broken: " + max.getHouseBroken() + "\nNeutered" + max.getNeutered() + "\nVaccinated: " + max.getVaccinated());
        System.out.println("Sold Pet 2 Status-" + "\nHouse Broken: " + sheila.getHouseBroken() + "\nNeutered" + sheila.getNeutered() + "\nVaccinated: " + sheila.getVaccinated());
    }
}
