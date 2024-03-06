package model;

import collections.*;

public class LaptopShop {
    public LinkList<Laptop> collections = new LinkList<Laptop>();

    public LaptopShop() {
        
    }

    public boolean addLaptop(Laptop laptop){
        collections.add(laptop);

        return false;
    }

    public Laptop searchLaptop(Laptop laptop){
        collections.contains(laptop);
        return null;
    }

    public boolean deleteLaptop(Laptop laptop){
        collections.delete(laptop);
        return false;
    }

    



}
