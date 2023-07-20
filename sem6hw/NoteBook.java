package sem6hw;

public class NoteBook {
    private String producer;
    private String model;
    private int cpu;
    private int ram;
    private int storage;
    private int price;

    public NoteBook(String producer, String model, int cpu, int ram, int storage, int price){
        this.producer = producer;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    public String getProducer(){
        return producer;
    }

    public String getModel(){
        return model;
    }

    public int getCpu(){
        return cpu;
    }

    public int getRam(){
        return ram;
    }

    public int getStrorage(){
        return storage;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "producer: " + producer + " model: " + model +  " cpu: " + cpu +
         " ram: " + ram + " storage: " + storage + " price" + price;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof NoteBook)) return false;
        NoteBook noteBook = (NoteBook)o;
        return producer.equals(noteBook.producer) && model.equals(noteBook.model) && cpu == noteBook.cpu 
        && ram == noteBook.ram && storage == noteBook.storage && price == noteBook.price;
   }

   @Override
   public int hashCode(){
    return 2 * producer.hashCode() + 3 * model.hashCode() + 4 * cpu + 5 * ram + 6 * storage + 7 * price;
   }
}