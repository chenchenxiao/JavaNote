package com.basic.算法.左程云算法.基础二;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Blse
 * @date 2018/11/22
 * @description
 */
public class 猫狗队列 {


    public static void main(String[] args) {
        DogCatQueue test = new DogCatQueue();

        Pet dog1 = new Dog("dog");
        Pet cat1 = new Cat("cat");
        Pet dog2 = new Dog("dog");
        Pet cat2 = new Cat("cat");
        Pet dog3 = new Dog("dog");
        Pet cat3 = new Cat("cat");

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);
        while (!test.isDogQueueEmpty()) {
            System.out.println(test.pollDog().getType());
        }
        while (!test.isEmpty()) {
            System.out.println(test.pollAll().getType());
        }
    }


}

class DogCatQueue {
    private Queue<PetQueue> dogQ;
    private Queue<PetQueue> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<PetQueue>();
        this.catQ = new LinkedList<PetQueue>();
        this.count = 0;
    }

    public void add(Pet pet) {
        if (pet.getType().equals("dog")) {
            this.dogQ.add(new PetQueue(pet, this.count++));
        } else if (pet.getType().equals("cat")) {
            this.catQ.add(new PetQueue(pet, this.count++));
        } else {
            throw new RuntimeException("err, not dog or cat");
        }
    }

    public Pet pollAll() {
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                return this.dogQ.poll().getPet();
            } else {
                return this.catQ.poll().getPet();
            }
        } else if (!this.dogQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else if (!this.catQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("err, queue is empty!");
        }
    }

    public Dog pollDog() {
        if (!this.isDogQueueEmpty()) {
            return (Dog) this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("Dog queue is empty!");
        }
    }

    public Cat pollCat() {
        if (!this.isCatQueueEmpty()) {
            return (Cat) this.catQ.poll().getPet();
        } else
            throw new RuntimeException("Cat queue is empty!");
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogQueueEmpty() {
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty() {
        return this.catQ.isEmpty();
    }

}

class PetQueue {
    private Pet pet;
    private long count;

    public PetQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public String getType() {
        return pet.getType();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}


class Pet{
    private String type;
    public Pet(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Dog extends Pet{

    public Dog(String type) {
        super("dog");
    }
}

class Cat extends Pet{

    public Cat(String type) {
        super("cat");
    }
}